package com.hw.web.user;

import java.util.List;

public interface UserService {

	public  void index(User user);

	public List<User> list();

	public User findOne(String userid);

	public void modify(User user);

	public void remove(User user);

	

}