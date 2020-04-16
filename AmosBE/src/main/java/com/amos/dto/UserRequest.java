package com.amos.dto;

public class UserRequest {
    private long id;
    private String username;
    private String password;
    private String address;
    private String fullname;
    private String city;
    private int role;
    
    private boolean isActive;

    private String pincode;

    private String mobileNo;
 
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    
    

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

    @Override
    public String toString() {
        return "UserDTO [id=" + id + ", username=" + username + ", password=" + password + ", address=" + address + ", fullname=" + fullname
                + ", city=" + city + ", role=" + role + ", isActive=" + isActive + ", pincode=" + pincode + ", mobileNo=" + mobileNo
                + ", creationTime="  + "]";
    }
    
    
}

