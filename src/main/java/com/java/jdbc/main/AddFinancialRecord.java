package com.java.jdbc.main;

import java.sql.SQLException;
import java.util.Scanner;
import com.java.jdbc.dao.FinancialRecordService;

public class AddFinancialRecord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter employee id:");
        int employeeId = sc.nextInt();
        
        System.out.println("Enter description:");
        sc.nextLine();  // Consume the newline character
        String description = sc.nextLine();
        
        System.out.println("Enter amount:");
        double amount = sc.nextDouble();
        
        System.out.println("Enter record type:");
        sc.nextLine();  // Consume the newline character
        String recordType = sc.nextLine();
        
        FinancialRecordService financialRecordService = new FinancialRecordService();
        
        try {
            String result = financialRecordService.AddFinancialRecord(employeeId, description, amount, recordType);
            System.out.println(result);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            sc.close();
        }
    }
}
	


