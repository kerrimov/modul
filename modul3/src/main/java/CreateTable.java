import java.sql.*;
import java.util.ArrayList;

public class CreateTable {

        public static void main(String[] args) {
            ArrayList<Tables> employees = new ArrayList<>();
            //String query = "select count(*) from employees;";
            String query = "select employees.first_name, employees.last_name, employees.hire_date from employees.employees;";
            String query2 = "select em.first_name, em.last_name, sal.salary\n" +
                    "from employees em \n" +
                    "inner join salaries sal on (em.emp_no=sal.emp_no) \n" +
                    "where sal.to_date like '2000%';\n";
            int count = 0;
            try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employees", "root", "TK98kerri7");
                 Statement statement = connection.createStatement();
                 ResultSet resultSet = statement.executeQuery(query)){

                for (int i=0; i<200; i++){
                    resultSet.next();
                    employees.add(new Tables( resultSet.getString(1), resultSet.getString(2), resultSet.getDate(3))) ;
                }

                System.out.println(query2);

            } catch (SQLException e) {
                e.printStackTrace();
            }


        }
}

