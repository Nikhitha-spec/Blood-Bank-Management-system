package com.BloodBank;

import java.sql.*;
import java.util.Scanner;

public class Request {
    private Connection conn;
    private Scanner sc;

    public Request(Connection conn, Scanner sc) {
        this.conn = conn;
        this.sc = sc;
    }

    public void makeRequest() {
        try {
            System.out.print("Enter Recipient ID: ");
            int recipientId = sc.nextInt();
            System.out.print("Enter Blood Group: ");
            String bg = sc.next();
            System.out.print("Enter Units Requested: ");
            int units = sc.nextInt();
            System.out.print("Enter Request Date (YYYY-MM-DD): ");
            String date = sc.next();

            String query = "INSERT INTO requests(recipient_id, blood_group, units_requested, request_date) VALUES(?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, recipientId);
            ps.setString(2, bg);
            ps.setInt(3, units);
            ps.setString(4, date);

            if (ps.executeUpdate() > 0) {
                System.out.println("Request submitted successfully!");
            } else {
                System.out.println("Failed to submit request.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void viewRequests() {
        try {
            String query = "SELECT * FROM requests";
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            System.out.println("Request");
			System.out.println("+--------------+--------------------+---------------+----------+--------------------+----------------+");
			System.out.println("| Request ID   | Recipient ID       | Blood Group   | Units    | Request Date       | Status         |");
			System.out.println("+--------------+--------------------+---------------+----------+--------------------+----------------+");
            while (rs.next()) {
                int request_id = rs.getInt("request_id");
                int recipient_id = rs.getInt("recipient_id");
                String blood_group = rs.getString("blood_group");
                int units_requested = rs.getInt("units_requested");
                String request_date = rs.getString("request_date");
                String status = rs.getString("status");
                System.out.printf("|%-14s|%-20s|%-15s|%-10s|%-20s|%-16s|\n",request_id,recipient_id,blood_group,units_requested,request_date,status);
                System.out.println("+--------------+--------------------+---------------+----------+--------------------+----------------+");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
