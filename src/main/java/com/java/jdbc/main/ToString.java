package com.java.jdbc.main;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import com.java.jdbc.model.Employee;
import com.java.jdbc.model.FinancialRecord;
import com.java.jdbc.model.Payroll;
import com.java.jdbc.model.Tax;
public class ToString 
{ 
	public static void main(String[] args) throws ParseException { 
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); 
		//Employee e=new Employee(1, "Sadhana", "Madina","Female", "sadhana@gmail.com", "9933993399", "Tekkali", "SWE", sdf.parse("10/10/2000"),sdf.parse("01/05/2024"), sdf.parse("10/10/2055")); System.out.println(e.toString()); 
		Payroll p=new Payroll(1, 1, sdf.parse("10/10/2000"),sdf.parse("01/05/2024"),50000,3000,1000,52000); 
		System.out.println(p.toString()); 
		Tax t=new Tax(1, 1, "2020", 44500,7500 ); 
		System.out.println(t.toString()); 
		FinancialRecord f1 = new FinancialRecord(1, 1, sdf.parse("01/04/2024"), "Salary", 50000, "Income"); 
		System.out.println(f1.toString()); 
		} }