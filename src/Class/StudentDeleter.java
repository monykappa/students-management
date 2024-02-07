/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import DB.DBconnection;

public class StudentDeleter {
    
    public boolean deleteStudent(int studentID) {
        String deleteQuery = "DELETE FROM students WHERE id=?";

        try (Connection connection = DBconnection.getConnection(); 
             PreparedStatement statement = connection.prepareStatement(deleteQuery)) {

            statement.setInt(1, studentID);
            int rowsDeleted = statement.executeUpdate();

            return rowsDeleted > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false; // Return false if an error occurs during deletion
        }
    }
}
