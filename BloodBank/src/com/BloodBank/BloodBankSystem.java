package com.BloodBank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class BloodBankSystem {
	
	private static final String URL = "jdbc:mysql://localhost:3306/bloodbank";
    private static final String USER = "root";
    private static final String PASSWORD = "@nikhitha6660";
    
	public static void main(String[] args) {
		try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            Scanner sc = new Scanner(System.in);

            Donor donor = new Donor(conn, sc);
            Recipient recipient = new Recipient(conn, sc);
            Request request = new Request(conn, sc);

            while (true) {
                System.out.println("Blood Bank Management System\n");
                System.out.println("1. Add Donor");
                System.out.println("2. View Donors");
                System.out.println("3. Add Recipient");
                System.out.println("4. View Recipients");
                System.out.println("5. Make Blood Request");
                System.out.println("6. View Requests");
                System.out.println("7. Exit");
                System.out.print("Enter choice: ");
                int choice = sc.nextInt();

                switch (choice) {
                    case 1 :
                    	donor.addDonor();
                    	System.out.println();
    					break;
                    case 2 :
                    	donor.viewDonors();
                    	System.out.println();
    					break;
                    case 3 :
                    	recipient.addRecipient();
                    	System.out.println();
    					break;
                    case 4 :
                    	recipient.viewRecipients();
                    	System.out.println();
    					break;
                    case 5 :
                    	request.makeRequest();
                    	System.out.println();
    					break;
                    case 6 :
                    	request.viewRequests();
                    	System.out.println();
    					break;
                    case 7 :
                    	System.out.println("Exiting...");
                    default : System.out.println("Invalid choice!");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
