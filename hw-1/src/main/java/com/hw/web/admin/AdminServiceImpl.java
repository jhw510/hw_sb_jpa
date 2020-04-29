package com.hw.web.admin;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.Buffer;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.util.NumberUtils;

import com.hw.web.util.Data;

import javafx.scene.input.DataFormat;

import java.util.Date;
@Service
public class AdminServiceImpl implements AdminService{
 @Autowired AdminDao adminDao;
 
 @Override
 public void register(Admin admin) {
	/*employNumber,name,passwd,position,profile,email,phoneNumber,registerDate*/
	 System.out.println(admin);
	 admin.setEmployNumber(createEemployNumber());
	 admin.setPasswd("1");
	 admin.setRegisterDate(createCurrentDate());
	 adminDao.insert(admin);
 }
	
	private String createCurrentDate() {
		System.out.println(new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new Date()));
	return new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new Date());
}

	private String createEemployNumber() {
	
	String startNum="";
	for (int i=0;i<4;i++) {
		startNum +=(int)Math.random()*10;
	}
	return startNum ;
		}
		 


	@Override
	public List<Admin> list() {
	
		return adminDao.selectAll();
	}

	


	@Override
	public Admin findOne(String employNumber) {
		
		return adminDao.selectOne(employNumber);
	}

	@Override
	public void modify(Admin admin) {
		adminDao.update(admin);
		
	}

	@Override
	public void remove(Admin admin) {
		adminDao.delete(admin);
	}
}

/*NumberFormat numFormat = new();
	Date number = new Date();
	System.out.println(numFormat.format(number));*/