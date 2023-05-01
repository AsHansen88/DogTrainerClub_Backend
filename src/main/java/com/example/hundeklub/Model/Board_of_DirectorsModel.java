package com.example.hundeklub.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="dogtrainer")
public class Board_of_DirectorsModel {


@Id
@Column(length = 5000000)
private Long Id;
private String fileName;
private String fileType;
@Column(name="file")
private byte [] file;


  public Long getId() {
    return Id;
  }

  public void setId(Long id) {
    Id = id;
  }

  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public String getFileType() {
    return fileType;
  }

  public void setFileType(String fileType) {
    this.fileType = fileType;
  }

  public byte[] getFile() {
    return file;
  }

  public void setFile(byte[] file) {
    this.file = file;
  }
}
