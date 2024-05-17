package com.java.jdbc; 
import static org.junit.Assert.*; 
import java.text.ParseException; 
import java.text.SimpleDateFormat; 
import org.junit.Test; 
import com.java.jdbc.model.Employee; 
import com.java.jdbc.model.Payroll; 
public class PayrollTest 
{ 
	@Test public void testConstructors() throws ParseException 
	{ 
		Payroll p=new Payroll(); 
		assertNotNull(p); 
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); 
		Payroll p1 = new Payroll(1, 1, sdf.parse("10/10/2000"),sdf.parse("01/05/2024"),50000,3000,1000,52000); 
		} 
	@Test public void testGettersSetters() throws ParseException 
	{ 
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); 
		Payroll p=new Payroll(); 
		p.setPayrollID(1); 
		p.setEmployeeID(1); 
		p.setPayPeriodStartDate(sdf.parse("10/10/2000")); 
		p.setPayPeriodEndDate(sdf.parse("01/05/2024")); 
		p.setBasicSalary(50000); 
		p.setOvertimePay(3000); 
		p.setDeductions(1000); 
		p.setNetSalary(52000); 
		assertEquals(1, p.getPayrollID());
		assertEquals(1,p.getEmployeeID()); 
		assertEquals(sdf.parse("10/10/2000"),p.getPayPeriodStartDate()); 
		assertEquals(sdf.parse("01/05/2024"),p.getPayPeriodEndDate()); 
		assertEquals(50000,p.getBasicSalary(),0); 
		assertEquals(3000, p.getOvertimePay(),0); 
		assertEquals(1000,p.getDeductions(),0); 
		assertEquals(52000,p.getNetSalary(),0); 
		} 
	@Test public void testHashCode() throws ParseException 
	{ 
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); 
		Payroll p1 = new Payroll(1, 1, sdf.parse("10/10/2000"),sdf.parse("01/05/2024"),50000,3000,1000,52000); 
		Payroll p2 = new Payroll(1, 1, sdf.parse("10/10/2000"),sdf.parse("01/05/2024"),50000,3000,1000,52000); 
		assertEquals(p1.hashCode(), p2.hashCode()); } 
	@Test public void testEquals() throws ParseException 
	{ 
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); 
		Payroll p1 = new Payroll(1, 1, sdf.parse("10/10/2000"),sdf.parse("01/05/2024"),50000,3000,1000,52000); 
		Payroll p2 = new Payroll(1, 1, sdf.parse("10/10/2000"),sdf.parse("01/05/2024"),50000,3000,1000,52000); 
		Payroll p3 = new Payroll(1, 1, sdf.parse("10/11/2000"),sdf.parse("01/05/2024"),50000,3000,1000,52000); 
		assertTrue(p1.equals(p2)); assertFalse(p1.equals(p3)); } 
	@Test public void testToString() throws ParseException 
	{ 
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); 
		Payroll p1 = new Payroll(1, 1, sdf.parse("10/10/2000"),sdf.parse("01/05/2024"),50000,3000,1000,52000); 
		String result = "Payroll [PayrollID=1, EmployeeID=1, BasicSalary=50000.0, OvertimePay=3000.0, Deductions=1000.0, NetSalary=52000.0]"; 
		assertEquals(p1.toString(), result); } }