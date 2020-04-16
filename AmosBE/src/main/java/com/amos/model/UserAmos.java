package com.amos.model;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class UserAmos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id", nullable = false, unique = true)
    private long userId;

    @Column(name = "username", unique = true, nullable = false)
    private String username;

    @Column(name = "password", nullable = false)
    private String password;
    
    @Column(name = "first_name", nullable = false)
    private String firstName;
    
    @Column(name = "last_name", nullable = false)
    private String lastName;
    
    @Column(name = "verification_code")
    private short verificationCode;

    @Column(name = "address")
    private String address;

    @Column(name = "city")
    private String city;
    
    @Column(name = "state")
    private String state;
    
    @Column(name = "country")
    private String country;
    
    @Column(name = "pincode")
    private int pincode;
    
    @Column(name = "is_active", nullable = false)
    private boolean isActive;

    @JoinColumn(name = "role_id", referencedColumnName = "role_id", nullable = false)
    @OneToOne(cascade = CascadeType.ALL)
    private Role role;

    @Column(name = "mobile_no", unique = true, nullable = false)
    private String mobileNo;

    @Column(name = "creation_time")
    private LocalDateTime creationTime;

    @Column(name = "modification_time")
    private LocalDateTime modificationTime;

    @OneToOne(mappedBy = "user")
    private Orders order;
    
	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
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

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public short getVerificationCode() {
		return verificationCode;
	}

	public void setVerificationCode(short verificationCode) {
		this.verificationCode = verificationCode;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public LocalDateTime getCreationTime() {
		return creationTime;
	}

	public void setCreationTime(LocalDateTime creationTime) {
		this.creationTime = creationTime;
	}

	public LocalDateTime getModificationTime() {
		return modificationTime;
	}

	public void setModificationTime(LocalDateTime modificationTime) {
		this.modificationTime = modificationTime;
	}

	@Override
	public String toString() {
		return "UserAmos [userId=" + userId + ", username=" + username + ", password=" + password + ", firstName="
				+ firstName + ", lastName=" + lastName + ", verificationCode=" + verificationCode + ", address="
				+ address + ", city=" + city + ", state=" + state + ", country=" + country + ", pincode=" + pincode
				+ ", isActive=" + isActive + ", role=" + role + ", mobileNo=" + mobileNo + ", creationTime="
				+ creationTime + ", modificationTime=" + modificationTime + "]";
	}
    
    

}
