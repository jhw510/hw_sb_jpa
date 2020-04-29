package com.hw.web.util;

public enum Messenger {
	 SUCCESS,FAIL ,FILE_INSERT_ERROR,FILE_SELECT_ERROR;
	@Override
	public String toString() {
		String returnValue ="";
		switch (this) {
		case SUCCESS:returnValue ="SUCCESS";break;
		case FAIL:returnValue ="FAIL";break;
		default:break;
		
		}
		return returnValue;
	}
}
