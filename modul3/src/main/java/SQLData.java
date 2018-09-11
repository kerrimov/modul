import java.sql.*;

public class SQLData {
    public static final String url = "jdbc:mysql://localhost:3306/myexcel";
    public static final String user = "root";
    public static final String password = "root";

    static int count = 0;

    public static void createTable(String tableName, int column) {
        String nameColumn = "";

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        for (int i = 0; i <= column; i++) {
            if (i == 0) {
                nameColumn += "id int(11) NOT NULL AUTO_INCREMENT, ";
            } else if (i == column) {
                nameColumn += "column" + i + " " + " VARCHAR (255)" + ", PRIMARY KEY (id));";
            } else {
                nameColumn += "column" + i + " " + " VARCHAR (255)" + ",";
            }
            String query = "CREATE TABLE " + tableName + " (" + nameColumn;
            System.out.println(query);
            try (Connection connection = DriverManager.getConnection(url, user, password);
                 Statement statement = connection.createStatement()) {
                statement.executeUpdate(query);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void deleteTable(String tableName) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        String query = "DROP TABLE " + tableName;
        try (Connection connection = DriverManager.getConnection(url, user, password);
             Statement statement = connection.createStatement()) {
            statement.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void deleteData(String tableName, int row) {
        String query = "DELETE FROM " + tableName + " WHERE id = " + row + ";";
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try (Connection connection = DriverManager.getConnection(url, user, password);
             Statement statement = connection.createStatement()) {
            statement.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void insertData(String tableName, int rowId, String data) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        String query = "INSERT INTO " + tableName;
        for (int i = 0; i <= data.split(",").length; i++) {
            if (i == data.split(",").length) {
                query += "'" + addData(data) + "');";
            } else if (i == 0) {
                for (int j = 0; j <= data.split(",").length; j++) {
                    if (j == 0) {
                        query += "(id,";
                    } else if (j == 1) {
                        query += "column" + j + ",";
                    } else if (j == data.split(",").length) {
                        query += "column" + j + ") VALUES (" + rowId + ",";
                    } else {
                        query += "column" + j + ",";
                    }
                }
            } else {
                query += "'" + addData(data) + "',";
            }
        }
        try (Connection connection = DriverManager.getConnection(url, user, password);
             Statement statement = connection.createStatement()) {
            statement.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            count = 0;
        }
    }

    public static String addData(String data) {
        String temp = "";
        for (int i = count; i < data.split(",").length; i++) {
            temp = data.split(",")[count];
            count++;
            break;
        }
        return temp;
    }
}


