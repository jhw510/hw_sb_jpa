package com.hw.web.user;

import java.util.List;

public interface UserDao {

	public List<User> selectAll();

	public User selectOne(String userid);

}
