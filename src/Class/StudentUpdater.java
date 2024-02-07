/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Map;
import javax.swing.JOptionPane;
import DB.DBconnection;

public class StudentUpdater {
    
    public boolean updateStudentData(int studentID, Map<String, Object> updatedFields) {
        String updateQuery = "UPDATE students SET first_name=?, last_name=?, DOB=?, address=?, gender=?, phone_number=?, graduated=?, payment=?, in_active=? WHERE id=?";

        try (Connection connection = DBconnection.getConnection(); 
             PreparedStatement statement = connection.prepareStatement(updateQuery)) {

            // Set parameters for the update query
            statement.setObject(1, updatedFields.get("first_name"));
            statement.setObject(2, updatedFields.get("last_name"));
            statement.setObject(3, updatedFields.get("DOB"));
            statement.setObject(4, updatedFields.get("address"));
            statement.setObject(5, updatedFields.get("gender"));
            statement.setObject(6, updatedFields.get("phone_number"));
            statement.setObject(7, updatedFields.get("graduated"));
            statement.setObject(8, updatedFields.get("payment"));
            statement.setObject(9, updatedFields.get("in_active"));
            statement.setInt(10, studentID);

            // Execute the update query
            int rowsUpdated = statement.executeUpdate();

            return rowsUpdated > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false; // Return false if an error occurs during update
        }
    }
}


