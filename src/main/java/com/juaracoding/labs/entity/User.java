package com.juaracoding.labs.entity;

public class User {
  private int id;
  private String nama;
  private String email;

  public User(int id, String nama, String email) {
    this.id = id;
    this.nama = nama;
    this.email = email;
  }

  public User() {}

  public User(int id) {
    this.id = id;
  }

  public int getId() {
    return id;
  }

  public String getNama() {
    return nama;
  }

  public String getEmail() {
    return email;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setNama(String nama) {
    this.nama = nama;
  }

  public void setEmail(String email) {
    this.email = email;
  }
}
