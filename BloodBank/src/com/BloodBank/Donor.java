package com.BloodBank;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Donor {
    private Connection conn;
    private Scanner sc;

    public Donor(Connection conn, Scanner sc) {
        this.conn = conn;
        this.sc = sc;
    }

    public void addDonor() {
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

            String query = "INSERT INTO donors(name, gender, blood_group, contact_number, address) VALUES(?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, name);
            ps.setString(2, gender);
            ps.setString(3, bg);
            ps.setString(4, contact);
            ps.setString(5, address);

            if (ps.executeUpdate() > 0) {
                System.out.println("Donor added successfully!");
            } else {
                System.out.println("Failed to add donor.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void viewDonors() {
        try {
            String query = "SELECT * FROM donors";
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            System.out.println("Donors");
			System.out.println("+--------------+--------------------+---------------+---------------+");
			System.out.println("| Donor ID     | Name               | Blood Group   | Contact       |");
			System.out.println("+--------------+--------------------+---------------+---------------+");
            while (rs.next()) {
            	
            	int id = rs.getInt("donor_id");
                String name = rs.getString("name");
                String blood_group = rs.getString("blood_group");
                String contact = rs.getString("contact_number");
                System.out.printf("|%-14s|%-20s|%-15s|%-15s|\n",id,name,blood_group,contact);
                System.out.println("+--------------+--------------------+---------------+---------------+");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}