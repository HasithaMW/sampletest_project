package com.nenasalaproject.entity;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity		// Annotation for represent an entity
@Table		// Annotation for represent a table
public class User implements Serializable{		// Serializable objects can be access as same as the original object.
	
	@Id		// Primary key attribute.
	@GeneratedValue(strategy = GenerationType.IDENTITY)			// This parameter use to identify the entity.
	@Basic(optional = false)
	Integer id;
	@Column		// Normal column
	String username;
	@Column		// Normal colum
	String password;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public boolean equals(Object object) {
		 if (!(object instanceof User)) {
	            return false;
	        }
	        User other = (User) object;
	        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
	            return false;
	        }
	        return true;
	}
	

}
