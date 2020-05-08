package com.hw.web.lost;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
@Component
@Getter@Setter

public class Lost {

	private String lostId,lostName,lostKind,lostAddr,lostDate;
	@Override
	public String toString() {
		return String.format("%s,%s,%s,%s,%s", lostId,lostName,
				lostKind,lostAddr,lostDate);
	}
	
	
}
