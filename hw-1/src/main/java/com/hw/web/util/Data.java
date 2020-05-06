package com.hw.web.util;

import java.io.File;

public enum Data {
	LOST_LIST,USER_LIST,ADMIN_LIST;
	@Override
	public String toString() {
	
		String path = "C:"+File.separator+"Users"+File.separator+"bit"+File.separator
				+"git"+File.separator+"repository2"+File.separator+"hw-1"+File.separator
				+"src"+File.separator+"main"+File.separator+"resources"+File.separator+"static"
				+File.separator+"resources"+File.separator+"file"+File.separator;;
		switch(this){
		
		
		case ADMIN_LIST:  path =path.concat("admin_list.csv");break;
		case USER_LIST:path = path.concat("user_list.csv");break;
		case LOST_LIST:path = path.concat("lost.csv");break;
		
		
		default:
			break;
		}
		return path;
	}
}
