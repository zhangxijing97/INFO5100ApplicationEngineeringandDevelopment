package edu.neu.mgen;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
 

/**
 *
 * @author Xijing Zhang
 * @version 1.0
 * @since 2024-04-09
 */
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App {

    public static void main(String[] args) {

        // Load and register the SQLite JDBC driver
        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException e) {
            System.err.println("SQLite JDBC driver not found");
            e.printStackTrace();
            return; // Exit the program if driver is not found
        }

        // SQLite connection string with your specific path
        String url = "jdbc:sqlite:/Users/zhangxijing/MasterNEU/INFO5100ApplicationEngineeringandDevelopment/Assignments/HWtoChapter13/java_projects/myproject/trails.db";

        try (Connection conn = DriverManager.getConnection(url)) {
            conn.setAutoCommit(false); // Start transaction

            // Step 1: Read a record from your specific table
            String selectSQL = "SELECT id, trail FROM trails WHERE id = 1";
            try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(selectSQL)) {
                if (rs.next()) {
                    int id = rs.getInt("id");
                    String trail = rs.getString("trail");
                    System.out.println("Original Record: " + id + " " + trail);

                    // Create a TrailRecord object
                    TrailRecord record = new TrailRecord(id, trail);

                    // Step 2: Modify the record in Java (example adds ' - modified' to the name)
                    String modifiedTrail = trail + " - modified";

                    // Step 3: Update the record in the database
                    String updateSQL = "UPDATE trails SET trail = ? WHERE id = ?";
                    try (PreparedStatement pstmt = conn.prepareStatement(updateSQL)) {
                        pstmt.setString(1, modifiedTrail);
                        pstmt.setInt(2, id);
                        pstmt.executeUpdate();
                        System.out.println("Record Updated");
                    }

                    // Optional: Rollback changes to restore original state
                    conn.rollback();
                    System.out.println("Changes rolled back");

                    // Return the TrailRecord object
                    System.out.println("Returning TrailRecord: " + record);
                }
            }

            conn.commit(); // Commit transaction, though in this case, it's redundant due to the rollback

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}