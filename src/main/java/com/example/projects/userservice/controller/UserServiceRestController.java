package com.example.projects.userservice.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.example.projects.userservice.dao.UserServiceDAO;
import com.example.projects.userservice.model.Users;
@RestController
public class UserServiceRestController {
 @Autowired
 UserServiceDAO userServiceDAO;
 @RequestMapping(value="/users", method=RequestMethod.GET)
 public List<Users> getUsersList() {
return userServiceDAO.getUsersList();
 }
}