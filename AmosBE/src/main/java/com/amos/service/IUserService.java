package com.amos.service;

import java.util.List;

import com.amos.dto.PwdUpdateRequest;
import com.amos.dto.UserRequest;
import com.amos.dto.UserResponse;
import com.amos.model.UserAmos;

public interface IUserService {
    public UserAmos save(UserRequest user);
    public List<UserAmos> getUsers();
    public UserAmos updateUser(UserRequest user);
    public boolean deactivateUser(long id);
    public boolean changePassword(PwdUpdateRequest pwd);
    public UserResponse getMyDetails(long id);
}
