package com.java.jdbc.main;

import java.sql.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;

import com.java.jdbc.dao.FinancialRecordService;
import com.java.jdbc.model.FinancialRecord;

public class GetFinancialRecordsForDate {
    public static void main(String[] args) {
        List<FinancialRecord> finList = null;
        FinancialRecordService f = new FinancialRecordService();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter record date (dd/MM/yyyy): ");
        String str = sc.next();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date recorddate = new Date(sdf.parse(str).getTime());
            finList = f.GetFinancialRecordsForDate(recorddate);
            if (finList != null && !finList.isEmpty()) {
                for (FinancialRecord financialRecord : finList) {
                    System.out.println(financialRecord);
                }
            } else {
                System.out.println("No records found for the provided date.");
            }
        } catch (ParseException | ClassNotFoundException | SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

