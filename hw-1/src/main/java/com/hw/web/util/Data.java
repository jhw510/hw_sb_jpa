package com.hw.web.util;

import java.io.File;

public enum Data {
	ADMIN_PATH,USER_PATH, CSV,LIST;
	@Override
	public String toString() {
		String returnValue = "";
		switch(this){
		case USER_PATH: returnValue=
				"C:"+File.separator+"Users"+File.separator +
				"bit"+File.separator+"spring-workspace"+File.separator+
				"occamsrazor"+File.separator+"src"+File.separator+
				"main"+File.separator+"resources"+File.separator+"static"+File.separator+"user"+File.separator; break;
		case ADMIN_PATH: returnValue=
				"C:"+File.separator+"Users"+File.separator +
				"bit"+File.separator+"git"+File.separator+
				"repository2"+File.separator+"hw-1"+File.separator+
				"src"+File.separator+"main"+File.separator+"java"+File.separator+
				"com"+File.separator+"hw"+File.separator+"web"+File.separator+
				"admin"+File.separator; break;
		case CSV:returnValue = ".csv" ;break;
		default:break;
		
		}
		return returnValue;
	}
}
