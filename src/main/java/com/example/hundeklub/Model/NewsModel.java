package com.example.hundeklub.Model;

import jakarta.persistence.*;
import org.apache.catalina.User;

import java.sql.Date;

@Entity
@Table(name = "dogtrainer")
public class NewsModel {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "user_id", referencedColumnName = "id")
  private UserModel user;

  @Column(columnDefinition = "TEXT")
  private String content;

  @Column(name = "createdDate", columnDefinition = "TIMESTAMP DEFEAULT CURRENT_TIMESTAMP")
  private Date createdDate;

  public NewsModel() {
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public UserModel getUser() {
    return user;
  }

  public void setUser(UserModel user) {
    this.user = user;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public Date getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(Date createdDate) {
    this.createdDate = createdDate;
  }
}

