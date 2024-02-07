/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author mony
 */
import java.awt.event.MouseEvent;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import DB.DBconnection;

public class StudentSearch {
    private String searchInput;
    private DefaultTableModel model;

    public StudentSearch(String searchInput, DefaultTableModel model) {
        this.searchInput = searchInput.trim();
        this.model = model;
    }

    public void search() {
        if (searchInput.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter an ID or a name to search.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        model.setRowCount(0);  // Clear existing rows in the table

        try (Connection connection = DBconnection.getConnection()) {
            String query;
            PreparedStatement statement;

            // Check if the input is a numeric ID
            if (searchInput.matches("\\d+")) {
                // Search by ID
                query = "SELECT * FROM students WHERE id = ?";
                statement = connection.prepareStatement(query);
                statement.setString(1, searchInput);
            } else {
                // Search by first name and last name
                query = "SELECT * FROM students WHERE CONCAT(first_name, ' ', last_name) LIKE ?";
                statement = connection.prepareStatement(query);
                statement.setString(1, "%" + searchInput + "%");
            }

            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    // Add a row to the table for each result
                    Object[] row = {
                        resultSet.getString("id"),
                        resultSet.getString("first_name"),
                        resultSet.getString("last_name"),
                        resultSet.getString("DOB"),
                        resultSet.getString("address"),
                        resultSet.getString("gender"),
                        resultSet.getString("phone_number"),
                        resultSet.getString("graduated"),
                        resultSet.getString("payment"),
                        resultSet.getString("in_active")
                    };
                    model.addRow(row);
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Database error. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}    
