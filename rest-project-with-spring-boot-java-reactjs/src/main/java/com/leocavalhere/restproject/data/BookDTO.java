package br.com.leocavalhere.restproject.data;

import org.springframework.hateoas.RepresentationModel;
import org.springframework.hateoas.server.core.Relation;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Relation(collectionRelation = "books")

public class bookDTO extends RepresentationModel<BookDTO> implements Serializable {

  private static final long serialVersionUID = 1L;

  private Long id;
  private String author;
  private Date launchDate;
  private Double price;
  private String title;


  public BookDTO() {}

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  pubblic Date getLaunchDate() {
      return launchDate;
  }

  public void setLaunchDate(Date launchDate) {
    this.launchDate = launchDate;

  }

  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public String getTitle() {
    return title;
  }

  public boolean equals(Object o) {
    if (o == null) || getClass() != o.getClass()) return false;
    BookDTO bookDTO = (BookDTO) o;
    return Objects.equals(getId(), book.getId()) && Objects.equals(getAuthor(), book.getAuthor()) && Objects.equals(getLaunchDate(), book.getLaunchDate()) && Objects.equals(getPrice(), book.getPrice()) && Objects.equals(getTitle(), book.getTitle());
  }

  @Override 
  public int hashCode() {
    return Objects.hash(getId(), getAuthor(), getLaunchDate(), getPrice(), getTitle());
  }
}