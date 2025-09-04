import React, { useState, useEffect } from 'react';
import { Link, useNavigate } from 'react-router-dom';
import { FiPower, FiEdit, FiTrash2 } from 'react-icons/fi';

import api from '../../services/api';
import './styles.css';

import logoImage from '../../assets/logo.svg';

export default function Books() {
    const [books, setBooks] = useState([]);
    const [page, setPage] = useState(1);

    const username = localStorage.getItem('username');
    const accessToken = localStorage.getItem('accessToken');

    const navigate = useNavigate();

    function logout() {
        localStorage.clear();
        navigate('/');
    }

    function editBook(id) {
        try {
            navigate(`/book/new/${id}`);
        } catch(error) {
            alert('Edit failed! Try again.');
        }
    }

    async function deleteBook(id) {
        try {
            await api.delete(`api/book/v1/${id}`, {
                headers: {
                    Authorization: `Bearer ${accessToken}`,
                },
            });

            setBooks(books.filter((book) => book.id !== id));
        } catch(err) {
            alert('Delete failed! Try again.');
        }
    }

    async function fetchMoreBooks() {
        try {
            const response = await api.get('api/book/v1', {
                headers: {
                    Authorization: `Bearer ${accessToken}`,
                },
                params: {
                    page: page,
                    limit: 4,
                    direction: 'asc',
                },
            });

            setBooks([...books, ...response.data._embedded.bookVoes]);
            setPage(page + 1);
        } catch (err) {
            console.error('Erro ao carregar livros: ', err);
        }
    }
}