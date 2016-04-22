package com.nenasalaproject.entity;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
public class CivilStatus implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Basic(optional = false)
	Integer id;
	
	@Column
	String name;
	
	
	
	public CivilStatus(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public CivilStatus() {
		
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;//"CivilStatus [id=" + id + ", name=" + name + "]";
	}
	
	@Override
	public boolean equals(Object object) {
		 if (!(object instanceof CivilStatus)) {
	            return false;
	        }
	        CivilStatus other = (CivilStatus) object;
	        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
	            return false;
	        }
	        return true;
	}
	

}
