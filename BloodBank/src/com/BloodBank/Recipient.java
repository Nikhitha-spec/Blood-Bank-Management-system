package com.BloodBank;

import java.sql.*;
import java.util.Scanner;

public class Recipient {
    private Connection conn;
    private Scanner sc;

    public Recipient(Connection conn, Scanner sc) {
        this.conn = conn;
        this.sc = sc;
    }

    public void addRecipient() {
        try {
            System.out.print("Enter Name: ");
            String name = sc.next();
            System.out.print("Enter Gender: ");
            String gender = sc.next();
            System.out.print("Enter Blood Group: ");
            String bg = sc.next();
            System.out.print("Enter Contact Number: ");
            String contact = sc.next();
            System.out.print("Enter Address: ");
            String address = sc.next();

            String query = "INSERT INTO recipients(name, gender, blood_group, contact_number, address) VALUES(?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, name);
            ps.setString(2, gender);
            ps.setString(3, bg);
            ps.setString(4, contact);
            ps.setString(5, address);

            if (ps.executeUpdate() > 0) {
                System.out.println("Recipient added successfully!");
            } else {
                System.out.println("Failed to add recipient.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void viewRecipients() {
        try {
            String query = "SELECT * FROM recipients";
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            System.out.println("Recipient");
			System.out.println("+------------------+--------------------+---------------+---------------+");
			System.out.println("| Recipient ID     | Name               | Blood Group   | Contact       |");
			System.out.println("+------------------+--------------------+---------------+---------------+");
            while (rs.next()) {
            	
            	int id = rs.getInt("recipient_id");
                String name = rs.getString("name");
                String blood_group = rs.getString("blood_group");
                String contact = rs.getString("contact_number");
                System.out.printf("|%-18s|%-20s|%-15s|%-15s|\n",id,name,blood_group,contact);
                System.out.println("+------------------+--------------------+---------------+---------------+");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

