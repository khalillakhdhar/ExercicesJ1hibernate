package com.http.tp.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="STUDENT")
public class Student {
@Id

@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;
@Column(name="STUDENT_NAME", length=50, nullable=false, unique=false)
private String name;
@Column(nullable = false)
private String lastname;
@Column(unique = true)
private String email;

public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}



// getters and setters
}
