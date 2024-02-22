package com.commontest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Addition {
	
	public static Logger mylog = LogManager.getLogger();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("program started");
		mylog.info("Program started");
		int a=10;
		int res=0;
		mylog.info("Data are intialized");
		res=a+100;	
		mylog.info("math operation has performed");
		if(res==110) {
			mylog.info("success");
			//System.out.println("S");
		}
		else {
			mylog.info("error");
			//System.out.println("E");
			
		}
		mylog.info("program ended");
		

	}

}
