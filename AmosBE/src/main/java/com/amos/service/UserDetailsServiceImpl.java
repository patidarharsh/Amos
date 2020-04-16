package com.amos.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.amos.dao.UserDao;
import com.amos.dto.PwdUpdateRequest;
import com.amos.dto.UserRequest;
import com.amos.dto.UserResponse;
import com.amos.model.UserAmos;

@Service
public class UserDetailsServiceImpl implements UserDetailsService,IUserService {

    @Autowired
    private UserDao userDao;
    
    @Autowired
    private PasswordEncoder bcryptEncoder;
    
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserAmos user = userDao.findByUsername(username);
        if(user==null) {
            throw new UsernameNotFoundException("User not found with username: " + username);
        }
        return new User(user.getUsername(),user.getPassword(), new ArrayList<>());
    }
    
    @Override
    public UserAmos save(UserRequest user) {
        UserAmos newUser = new UserAmos();
        newUser.setUsername(user.getUsername());
        newUser.setPassword(bcryptEncoder.encode(user.getPassword()));
        newUser.setAddress(user.getAddress());
        newUser.setCity(user.getCity());
        newUser.setMobileNo(user.getMobileNo());
        newUser.setActive(true);
        newUser.setCreationTime(LocalDateTime.now());
        newUser.setModificationTime(LocalDateTime.now());
        return userDao.save(newUser);
    }
    
    @Override
    public List<UserAmos> getUsers() {
        List<UserAmos> list = userDao.findAll();
        list.forEach(a -> a.setPassword(null));
        return list;
    }
    
    @Override
    public UserAmos updateUser(UserRequest user) {
        int id = (int)user.getId();
        UserAmos newUser = userDao.findByUserId(id);
        newUser.setAddress(user.getAddress());
        newUser.setCity(user.getCity());
        newUser.setMobileNo(user.getMobileNo());
        newUser.setModificationTime(LocalDateTime.now());
        return userDao.saveAndFlush(newUser);
    }

    @Override
    public boolean deactivateUser(long id) {
        UserAmos newUser = userDao.findByUserId(id);
        newUser.setActive(false);
        userDao.saveAndFlush(newUser);
        return true;
    }
    
    @Override
    public boolean changePassword(PwdUpdateRequest pwdDTO) {
        UserAmos user = userDao.findByUserId(pwdDTO.getId());
        if(bcryptEncoder.matches(pwdDTO.getOldpwd(), user.getPassword())) {
            user.setPassword(bcryptEncoder.encode(pwdDTO.getNewpwd()));
            userDao.saveAndFlush(user);
            return true;
        }
        return false;
    }
    
    @Override
    public UserResponse getMyDetails(long id) {
        UserAmos user = userDao.findByUserId(id);
        UserResponse userResponse = new UserResponse();
        userResponse.setActive(user.isActive());
        userResponse.setAddress(user.getAddress());
        userResponse.setCity(user.getCity());
        userResponse.setCreationTime(user.getCreationTime());
        userResponse.setMobileNo(user.getMobileNo());
        userResponse.setModificationTime(user.getModificationTime());
        userResponse.setUsername(user.getUsername());
        return userResponse;
    }
}

