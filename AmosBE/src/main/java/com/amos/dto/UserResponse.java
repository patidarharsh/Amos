package com.amos.dto;

import java.time.LocalDateTime;

public class UserResponse {
    private String username;
    private String address;
    private String fullname;
    private String city;
    private int role;
    private boolean isActive;
    private String pincode;
    private String mobileNo;
    private LocalDateTime creationTime;
    private LocalDateTime modificationTime;
 
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

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }
    
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

    @Override
    public String toString() {
        return "UserResponse [username=" + username + ", address=" + address + ", fullname=" + fullname + ", city=" + city + ", role=" + role
                + ", isActive=" + isActive + ", pincode=" + pincode + ", mobileNo=" + mobileNo + ", creationTime=" + creationTime
                + ", modificationTime=" + modificationTime + "]";
    }
    
    
}
