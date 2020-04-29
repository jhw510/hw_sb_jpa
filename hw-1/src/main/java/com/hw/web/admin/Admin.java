package com.hw.web.admin;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Getter@Setter
public class Admin {

	private String employNumber,name,passwd,position,profile,email,phoneNumber,registerDate;
	@Override
	public String toString() {
		
		return String.format("%s,%s,%s,%s,%s,%s,%s,%s", 
				employNumber,name,passwd,position,profile,email,phoneNumber,registerDate);
	}

}
