package com.hw.web.admin;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.hw.web.util.Data;
import com.hw.web.util.Messenger;

@Repository
public class AdminDaoImpl implements AdminDao {

	@Override
	public void insert(Admin admin) {
		try {


		BufferedWriter writer = new BufferedWriter(
				new FileWriter(
				new File(Data.ADMIN_PATH.toString()+Data.LIST+Data.CSV), true));
		writer.write(admin.toString());
		writer.newLine();
		writer.flush();
		
		}catch(Exception e){
			System.out.println(Messenger.FILE_INSERT_ERROR);
		}
		
	}
	@Override
	public List<Admin> selectAll() {
		try {
			
		}catch(Exception e){
			
		}finally {
			
		}
		return null;
	}


	@Override
	public Admin selectOne(String employNumber) {
		Admin admin =null;
		try {
			
		}catch(Exception e) {
			
		}
		return null;
	}

	@Override
	public void update(Admin admin) {
		try {
			
		}catch(Exception e) {
			
		}
	}

	@Override
	public void delete(Admin admin) {
		try {
			
		}catch(Exception e) {
			
		}
		
	}

}
