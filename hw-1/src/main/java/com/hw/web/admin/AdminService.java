package com.hw.web.admin;

import java.util.List;

public interface AdminService {

	public List<Admin> list();

	public void register(Admin admin);
	public Admin findOne(String employNumber);
	public void modify(Admin admin);
	public void remove(Admin admin);
	
}
