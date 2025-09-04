package com.leocavalhere.restproject.file.importer.contract;

import com.leocavalhere.restproject.data.dto.PersonDTO;

import java.io.InputStream;
import java.util.List;

public interface FileImporter {

  
  List<PersonDTO> importFile(InputStream inputStream) throws Exception;

}