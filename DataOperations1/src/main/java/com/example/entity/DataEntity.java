package com.example.entity;

import jakarta.persistence.*;

@Entity
@Table(name="Entity")
public class DataEntity {
     @Id
//     @GeneratedValue(strategy=GenerationType.IDENTITY)
     private Long id;
     private String name;
     private String surname;
     private String city;
	
     public DataEntity(Long id, String name, String surname, String city) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.city = city;
	}

	public DataEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

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

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "DataEntity [id=" + id + ", name=" + name + ", surname=" + surname + ", city=" + city + "]";
	}
     
     
}
