package com.hw.web.admin;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Component
@Getter@Setter
public class Admin {

	private String employNumber,name,passwd,position,profile,email,phoneNumber,registerDate;
	@Override
	public String toString() {
		
		return String.format("%s,%s,%s,%s,%s,%s,%s,%s", 
				employNumber,name,passwd,position,profile,email,phoneNumber,registerDate);
	}

}
