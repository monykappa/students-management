/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import DB.DBconnection;

public class StudentAdder {
    
    public boolean addStudent(String firstName, String lastName, String dobText, String gender, String address, String phone, String graduated, String payment, String inactive) {
        // Validate if required fields are not empty
        if (firstName.isEmpty() || lastName.isEmpty() || dobText.isEmpty() || gender.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please fill in all required fields.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        // Parse and format the date
        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        try {
            LocalDate dob = LocalDate.parse(dobText, inputFormatter);
            String formattedDob = outputFormatter.format(dob);

            try (Connection connection = DBconnection.getConnection(); 
                 PreparedStatement statement = connection.prepareStatement("INSERT INTO students (first_name, last_name, DOB, gender, address, phone_number, graduated, payment, in_active) VALUES (?, ?, STR_TO_DATE(?, '%Y-%m-%d'), ?, ?, ?, ?, ?, ?)")) {

                // Set parameters for the prepared statement
                statement.setString(1, firstName);
                statement.setString(2, lastName);
                statement.setString(3, formattedDob); // Use the formatted date
                statement.setString(4, gender);
                statement.setString(5, address);
                statement.setString(6, phone);
                statement.setString(7, graduated);
                statement.setString(8, payment);
                statement.setString(9, inactive);

                // Execute the SQL query
                int rowsAffected = statement.executeUpdate();

                return rowsAffected > 0;

            } catch (SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Database error. Please check your input and try again.", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Invalid date format. Please enter the date in dd-MM-yyyy format.", "Error", JOptionPane.ERROR_MESSAGE);
        }

        return false;
    }
}
