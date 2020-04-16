package com.amos.dto;

public class PwdUpdateRequest {
    private long id;
    private String oldpwd;
    private String newpwd;
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getOldpwd() {
        return oldpwd;
    }
    public void setOldpwd(String oldpwd) {
        this.oldpwd = oldpwd;
    }
    public String getNewpwd() {
        return newpwd;
    }
    public void setNewpwd(String newpwd) {
        this.newpwd = newpwd;
    }
    @Override
    public String toString() {
        return "PwdUpdateRequest [id=" + id + ", oldpwd=" + oldpwd + ", newpwd=" + newpwd + "]";
    }
    
    
}
