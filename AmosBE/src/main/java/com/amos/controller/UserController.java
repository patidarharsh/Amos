package com.amos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.amos.dto.PwdUpdateRequest;
import com.amos.dto.UserRequest;
import com.amos.model.UserAmos;
import com.amos.service.UserDetailsServiceImpl;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

    @Autowired
    private UserDetailsServiceImpl userDetailsService;
    
    @RequestMapping(value = "/all-customers/{username}", method = RequestMethod.GET)
    public ResponseEntity<?> getUsers(@PathVariable String username){
            final List<UserAmos> users = userDetailsService.getUsers();
            return ResponseEntity.ok(users); 
    }
    
    @RequestMapping(value = "/update-details", method = RequestMethod.PUT)
    public ResponseEntity<?> updateDetails(@RequestBody UserRequest user){
        return ResponseEntity.ok(userDetailsService.updateUser(user));      
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST )
    public ResponseEntity<?> saveUser(@RequestBody UserRequest user) throws Exception {
        return ResponseEntity.ok(userDetailsService.save(user));
    }
    
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> deactivateUser(@PathVariable long id){
        return ResponseEntity.ok(userDetailsService.deactivateUser(id));
    }
    
    @RequestMapping(value = "/update-password", method = RequestMethod.PUT)
    public ResponseEntity<?> updatePassword(@RequestBody PwdUpdateRequest pwdDTO){
        return ResponseEntity.ok(userDetailsService.changePassword(pwdDTO));
    }
}
