package com.sitterbootcamp.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="sitter")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Sitter {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="sitter_id")
	private int sitterId;
	
	@Column(name="name")
	private String sitterName;
	
	private int experience;
	
	private String email;

	public Sitter() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Sitter(int sitterId, String sitterName, int experience, String email) {
		super();
		this.sitterId = sitterId;
		this.sitterName = sitterName;
		this.experience = experience;
		this.email = email;
	}

	public int getSitterId() {
		return sitterId;
	}

	public void setSitterId(int sitterId) {
		this.sitterId = sitterId;
	}

	public String getSitterName() {
		return sitterName;
	}

	public void setSitterName(String sitterName) {
		this.sitterName = sitterName;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + experience;
		result = prime * result + sitterId;
		result = prime * result + ((sitterName == null) ? 0 : sitterName.hashCode());
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
		Sitter other = (Sitter) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (experience != other.experience)
			return false;
		if (sitterId != other.sitterId)
			return false;
		if (sitterName == null) {
			if (other.sitterName != null)
				return false;
		} else if (!sitterName.equals(other.sitterName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Sitter [sitterId=" + sitterId + ", sitterName=" + sitterName + ", experience=" + experience + ", email="
				+ email + "]";
	}
	
	
}
