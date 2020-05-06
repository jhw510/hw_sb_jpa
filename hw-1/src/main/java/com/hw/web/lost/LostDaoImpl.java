package com.hw.web.lost;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.hw.web.util.Data;

@Repository
public class LostDaoImpl implements LostDao {

	@Override
	public List<Lost> selectAll() {
		List<Lost> losts = new ArrayList<>()	;
		List<String> temp = new ArrayList<>();
		try {
			
			BufferedReader reader = new BufferedReader
					(new FileReader(new File(Data.LOST_LIST.toString())));
			
			String message = "";
			while((message = reader.readLine()) != null) {
				
				temp.add(message);
			}
			reader.close();
			
		}catch(Exception e) {
			System.out.println("에러");
		}
		Lost lo=null;
		for(String s:temp) {
				lo = new Lost();
				String[] arr = s.split(",");
				lo.setLostId(arr[0]);
				lo.setLostName(arr[1]);
				lo.setLostDate(arr[2]);
				lo.setLostKind(arr[3]);
				lo.setLostAddr(arr[4]);
				losts.add(lo);
		}
		return losts;
	}

}
