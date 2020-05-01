package com.hw.web.admin;

import java.util.List;

import org.springframework.stereotype.Component;
@Component
public interface AdminDao {

	public List<Admin> selectAll();

	public void insert(Admin admin);

	public Admin selectOne(String employNumber);

	public void update(Admin admin);

	public void delete(Admin admin);

}
