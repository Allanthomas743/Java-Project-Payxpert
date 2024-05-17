package com.java.jdbc.model;

import java.util.Date;
import java.util.Objects;

public class Payroll {
	private int PayrollID;
	private int EmployeeID;
	private Date PayPeriodStartDate;
	private Date PayPeriodEndDate;
	private double BasicSalary;
	private double OvertimePay;
	private double Deductions;
	private double NetSalary;
	public int getPayrollID() {
		return PayrollID;
	}
	public void setPayrollID(int payrollID) {
		PayrollID = payrollID;
	}
	public int getEmployeeID() {
		return EmployeeID;
	}
	public void setEmployeeID(int employeeID) {
		EmployeeID = employeeID;
	}
	public Date getPayPeriodStartDate() {
		return PayPeriodStartDate;
	}
	public void setPayPeriodStartDate(Date payPeriodStartDate) {
		PayPeriodStartDate = payPeriodStartDate;
	}
	public Date getPayPeriodEndDate() {
		return PayPeriodEndDate;
	}
	public void setPayPeriodEndDate(Date payPeriodEndDate) {
		PayPeriodEndDate = payPeriodEndDate;
	}
	public double getBasicSalary() {
		return BasicSalary;
	}
	public void setBasicSalary(double basicSalary) {
		BasicSalary = basicSalary;
	}
	public double getOvertimePay() {
		return OvertimePay;
	}
	public void setOvertimePay(double overtimePay) {
		OvertimePay = overtimePay;
	}
	public double getDeductions() {
		return Deductions;
	}
	public void setDeductions(double deductions) {
		Deductions = deductions;
	}
	public double getNetSalary() {
		return NetSalary;
	}
	public void setNetSalary(double netSalary) {
		NetSalary = netSalary;
	}
	public Payroll(int payrollID, int employeeID, Date payPeriodStartDate, Date payPeriodEndDate, double basicSalary,
			double overtimePay, double deductions, double netSalary) {
		
		PayrollID = payrollID;
		EmployeeID = employeeID;
		PayPeriodStartDate = payPeriodStartDate;
		PayPeriodEndDate = payPeriodEndDate;
		BasicSalary = basicSalary;
		OvertimePay = overtimePay;
		Deductions = deductions;
		NetSalary = netSalary;
	}
	public Payroll() {
		
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Payroll [PayrollID=" + PayrollID + ", EmployeeID=" + EmployeeID + ", BasicSalary=" + BasicSalary
				+ ", OvertimePay=" + OvertimePay + ", Deductions=" + Deductions + ", NetSalary=" + NetSalary + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(PayrollID,EmployeeID,PayPeriodStartDate,PayPeriodEndDate ,BasicSalary,OvertimePay,
				Deductions, NetSalary);
	}
	
	@Override
	public boolean equals(Object obj) {
		Payroll payroll = (Payroll)obj;
		if (payroll.getPayrollID() == PayrollID && payroll.getEmployeeID() == EmployeeID 
				&& payroll.getPayPeriodStartDate().compareTo(PayPeriodStartDate)==0  && payroll.getPayPeriodEndDate().compareTo(PayPeriodEndDate)==0
				&& payroll.getBasicSalary() == BasicSalary && payroll.getOvertimePay() ==OvertimePay 
				&& payroll.getDeductions() == Deductions 
			&& payroll.getNetSalary() == NetSalary 
				) {
			return true;
		}
		return false;
	}

	

}
