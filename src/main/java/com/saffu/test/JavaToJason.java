package com.saffu.test;

import java.io.File;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.saffu.entity.Employee;

public class JavaToJason {
	
	public static void main(String[] args) {
		
		
		try {
			
			ObjectMapper mapper= new ObjectMapper();
			
			
			Employee e1= new Employee(101, "Amit", 25000.00);
			Employee e2= new Employee(102, "Salim", 85000.00);
			Employee e3= new Employee(103, "Sumita", 95000.00);
			
			List<Employee> list = Arrays.asList(e1,e2,e3);
			
			
			String value = mapper.writeValueAsString(list);
			System.out.println(value);
			
			
			mapper.writeValue( new File("C:\\Users\\User\\Desktop\\data\\data.json"),list);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

}
