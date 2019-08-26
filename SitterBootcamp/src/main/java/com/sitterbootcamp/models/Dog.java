package com.sitterbootcamp.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
@Table(name="dog")
public class Dog {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="dog_id")
	private int dogId;
	
	@Column(name="name")
	private String dogName;
	
	private int age;
	
	private String breed;
	
	@ManyToOne
	@JoinColumn(name="sitter")
	private Sitter sitter;

	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dog(int dogId, String dogName, int age, String breed, Sitter sitter) {
		super();
		this.dogId = dogId;
		this.dogName = dogName;
		this.age = age;
		this.breed = breed;
		this.sitter = sitter;
	}

	public int getDogId() {
		return dogId;
	}

	public void setDogId(int dogId) {
		this.dogId = dogId;
	}

	public String getDogName() {
		return dogName;
	}

	public void setDogName(String dogName) {
		this.dogName = dogName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public Sitter getSitter() {
		return sitter;
	}

	public void setSitter(Sitter sitter) {
		this.sitter = sitter;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((breed == null) ? 0 : breed.hashCode());
		result = prime * result + dogId;
		result = prime * result + ((dogName == null) ? 0 : dogName.hashCode());
		result = prime * result + ((sitter == null) ? 0 : sitter.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog other = (Dog) obj;
		if (age != other.age)
			return false;
		if (breed == null) {
			if (other.breed != null)
				return false;
		} else if (!breed.equals(other.breed))
			return false;
		if (dogId != other.dogId)
			return false;
		if (dogName == null) {
			if (other.dogName != null)
				return false;
		} else if (!dogName.equals(other.dogName))
			return false;
		if (sitter == null) {
			if (other.sitter != null)
				return false;
		} else if (!sitter.equals(other.sitter))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Dog [dogId=" + dogId + ", dogName=" + dogName + ", age=" + age + ", breed=" + breed + ", sitter="
				+ sitter + "]";
	}
	
	
}
