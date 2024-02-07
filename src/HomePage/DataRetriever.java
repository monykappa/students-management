// HomePage/DataRetriever.java
package HomePage;

import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DataRetriever {

    public static void fetchDataFromDatabase(DefaultTableModel model) {
        try {
            // Create an instance of DBconnection (assuming it's in the DB package)
            DB.DBconnection databaseHandler = new DB.DBconnection();

            // Get a connection from the DatabaseHandler class
            Connection connection = databaseHandler.getConnection();

            // Prepare and execute the query
            String query = "SELECT * FROM students";
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();

            // Get column names and set them as table headers
            int columnCount = resultSet.getMetaData().getColumnCount();
            model.setColumnCount(0); // Clear existing columns
            for (int i = 1; i <= columnCount; i++) {
                model.addColumn(resultSet.getMetaData().getColumnName(i));
            }

            // Add rows to the table
            model.setRowCount(0); // Clear existing rows
            while (resultSet.next()) {
                Object[] row = new Object[columnCount];
                for (int i = 1; i <= columnCount; i++) {
                    row[i - 1] = resultSet.getObject(i);
                }
                model.addRow(row);
            }

            // Close resources
            resultSet.close();
            statement.close();
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
