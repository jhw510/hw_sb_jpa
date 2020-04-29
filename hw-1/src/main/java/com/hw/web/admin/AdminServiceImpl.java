package com.hw.web.admin;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.hw.web.util.Data;

@Service
public class AdminServiceImpl implements AdminService{

@Override
public void add(Admin admin) {
	try {
		File file = new File(Data.ADMIN_PATH.toString()+Data.LIST+Data.CSV);
		@SuppressWarnings("resource")
		BufferedWriter writer = new BufferedWriter(new FileWriter(file,true));
		String message = admin.toString();
		System.out.println(message);
		writer.write(message);
		writer.newLine();
		writer.flush();
	}catch(Exception e){
		System.out.println("파일 입력시 에러생김");
	}
}

@Override
public List<Admin> list() {
	List<Admin> adminlist = new ArrayList<>();
	List<String> list = new ArrayList<>();
	try {
		File file = new File(Data.ADMIN_PATH.toString()+Data.LIST+Data.CSV);
		BufferedReader reader = new BufferedReader(new FileReader(file));
		String message = "";
		while((message = reader.readLine()) != null) {
			list.add(message);
			}
		reader.close();
	}catch (Exception e){
		System.out.println("파일 읽기에서 에러 생김");
	}

	Admin a = null;
	for(int i=0;i<list.size();i++) {
		a= new Admin();
		String [] arr = list.get(i).split(",");
		a.setEmployNumber(arr[0]);
		a.setName(arr[1]);
		a.setPasswd(arr[2]);
		a.setPosition(arr[3]);
		a.setProfile(arr[4]);
		a.setEmail(arr[5]);
		a.setPhoneNumber(arr[6]);
		a.setRegisterDate(arr[7]);
		adminlist.add(a);
	}

	return adminlist;
}

@Override
public int count() {

	return 0;
}

@Override
public void register(Admin admin) {
	// TODO Auto-generated method stub
	
}

@Override
public Admin findOne(String employNumber) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public void modify(Admin admin) {
	// TODO Auto-generated method stub
	
}

@Override
public void remove(Admin admin) {
	// TODO Auto-generated method stub
	
}
}
