package com.nenasalaproject.entity;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;

import com.nenasalaproject.common.RegexPool;

@Table
@Entity
public class Employee implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Basic(optional = false)
    @Column(name = "id")
	private Integer id;
	@Column(name="fname")
	@Pattern(regexp=RegexPool.PERSONNAME, message="Invalid person name")
	private String fname;
	@Column(name="lname")
	@Pattern(regexp=RegexPool.PERSONNAME, message="Invalid person name")
	private String lname;
	@JoinColumn(name="gender_id", referencedColumnName="id")
	@ManyToOne(optional=false)
	@NotNull(message="Gender should be selected")
	private Gender genderId;
	@JoinColumn(name="civilStatus_id", referencedColumnName="id")
	@ManyToOne(optional=false)
	@NotNull(message="Civil status should be selected")
	private CivilStatus civilStatusId;
	@Column(name="address")
	@Pattern(regexp= RegexPool.ADDRESS, message="Invalid Address")
	private String address;
	@Column(name="nic")
	@NotNull(message="NIC no. can't be null")
	@Pattern(regexp= RegexPool.NIC, message="Invalid NIC no")
	private String nic;
	@Column(name="land")
	@Pattern(regexp= RegexPool.LANDPHONENO, message="Invalid land phone no")
	private String land;
	@Column(name="mobile")
	@Pattern(regexp= RegexPool.MOBILEPHONENO, message="Invalid mobile phone no")
	private String mobile;
	@Column(name="email")
	@Pattern(regexp= RegexPool.EMAILADDRESS, message="Invalid email address")
	private String email;
	@Column(name="dob")
	@Temporal(TemporalType.DATE)
	@NotNull(message="Date of birth can't be null")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dob;
	
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the fname
	 */
	public String getFname() {
		return fname;
	}
	/**
	 * @param fname the fname to set
	 */
	public void setFname(String fname) {
		this.fname = fname;
	}
	/**
	 * @return the lname
	 */
	public String getLname() {
		return lname;
	}
	/**
	 * @param lname the lname to set
	 */
	public void setLname(String lname) {
		this.lname = lname;
	}
	/**
	 * @return the genderId
	 */
	public Gender getGenderId() {
		return genderId;
	}
	/**
	 * @param genderId the genderId to set
	 */
	public void setGenderId(Gender genderId) {
		this.genderId = genderId;
	}
	/**
	 * @return the civilStatusId
	 */
	public CivilStatus getCivilStatusId() {
		return civilStatusId;
	}
	/**
	 * @param civilStatusId the civilStatusId to set
	 */
	public void setCivilStatusId(CivilStatus civilStatusId) {
		this.civilStatusId = civilStatusId;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the land
	 */
	public String getLand() {
		return land;
	}
	/**
	 * @param land the land to set
	 */
	public void setLand(String land) {
		this.land = land;
	}
	/**
	 * @return the mobile
	 */
	public String getMobile() {
		return mobile;
	}
	/**
	 * @param mobile the mobile to set
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the nic
	 */
	public String getNic() {
		return nic;
	}
	/**
	 * @param nic the nic to set
	 */
	public void setNic(String nic) {
		this.nic = nic;
	}
	/**
	 * @return the dob
	 */
	public Date getDob() {
		return dob;
	}
	/**
	 * @param dob the dob to set
	 */
	public void setDob(Date dob) {
		
		this.dob = dob;
//		if(this.dob != null){
//			try {
//				this.dob = new SimpleDateFormat("yyyy/MM/dd").parse(dob.toString());
//				System.out.println(this.dob);
//			} catch (ParseException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
	}
	
	
	@Override
	public boolean equals(Object object) {
		 if (!(object instanceof Employee)) {
	            return false;
	        }
	        Employee other = (Employee) object;
	        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
	            return false;
	        }
	        return true;
	}
	
	

}
