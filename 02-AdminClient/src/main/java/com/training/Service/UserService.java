package com.training.Service;

import java.util.List;

import com.training.bean.User;

public interface UserService {
	 User getUser(int userId);
	    List<User> getAllUser();
	    User validateUser(String username, String password);
	    User addUser(User user);
	    User updateUser(User user);
	    User updatePassword(User user, String newpass);
	    String removeUser(User user);
}
