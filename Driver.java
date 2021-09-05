package com.greatlearning.service;

import com.greatlearning.departments.Admin;
import com.greatlearning.departments.HR;
import com.greatlearning.departments.Tech;

public class Driver {

	public static void main(String[] args) {
		
		System.out.println();
		Admin admin = new Admin();
		System.out.println(" Welcome to " + admin.departmentName());
		System.out.println(admin.getTodaysWork());
		System.out.println(admin.getWorkDeadline());
		System.out.println(admin.isTodayAHoliday());
		System.out.println();

		HR hr = new HR();
		System.out.println(" Welcome to " + hr.departmentName());
		System.out.println(hr.doActivity());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(hr.isTodayAHoliday());
		System.out.println();
		System.out.println();

		Tech tech = new Tech();
		System.out.println(" Welcome to " + tech.departmentName());
		String strg = tech.getTodaysWork();
		StringBuilder string = new StringBuilder(strg);
		string.setCharAt(19, 'M');
		System.out.println(string);
		System.out.println(tech.getWorkDeadline());
		String str = tech.getTechStackInformation();
		String cap= str.substring(0, 1).toUpperCase()+str.substring(1);
		System.out.println(cap);
		System.out.println(tech.isTodayAHoliday());

	}

}
