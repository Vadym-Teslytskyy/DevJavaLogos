package less23HomeWork;

import java.sql.*;
import java.util.Scanner;

public class FunctinalDB {
	
	public static final String CREATE_TABLE_PERSON_QUERY = "CREATE TABLE person(id INT PRIMARY KEY AUTO_INCREMENT, "
			+"first_name VARCHAR(255), last_name VARCHAR(255), fathers_name VARCHAR(255), age INT, birth_day DATE)";
	
	public static final String INSERT_PERSON = "INSERT INTO person(first_name, last_name, fathers_name, age, birth_day) "
	+"VALUES (?, ?, ?, ?, ?)";
	
	public static final String DELETE_ROW = "DELETE FROM person WHERE id=(?)";
	
	public static final String UPDATE_ROW = "UPDATE person SET first_name=(?), last_name=(?), fathers_name=(?), age=(?), birth_day=(?) "
	+"WHERE id=(?)";
	
	public static final String SELECT_ALL = "SELECT * FROM person";
	
	Scanner scanner = new Scanner(System.in);
	
	public void createTable(Connection connection) throws SQLException {
		Statement statement = connection.createStatement();
		statement.execute(CREATE_TABLE_PERSON_QUERY);
		statement.close();
}
	
	public void addRow(Connection connection) throws SQLException {
		PreparedStatement statement = connection.prepareStatement(INSERT_PERSON);
		statement.setString(1, enterFirstName());
		statement.setString(2, enterLastName());
		statement.setString(3, enterFathersName());
		statement.setInt(4, enterAge());
		statement.setDate(5, enterBirthDay());
		statement.executeUpdate();
		statement.close();
}
	
	public void updateRow(Connection connection) throws SQLException {
		PreparedStatement statement = connection.prepareStatement(UPDATE_ROW);
		statement.setString(1, enterFirstName());
		statement.setString(2, enterLastName());
		statement.setString(3, enterFathersName());
		statement.setInt(4, enterAge());
		statement.setDate(5, enterBirthDay());
		statement.setInt(6, enterRowNumber());
		statement.executeUpdate();
		statement.close();
}
	
	public void deleteRow(Connection connection) throws SQLException {
		PreparedStatement statement = connection.prepareStatement(DELETE_ROW);
		statement.setInt(1, enterRowNumber());
		statement.executeUpdate();
		statement.close();
	}
	
	public void selectAllTable(Connection connection) throws SQLException{
		PreparedStatement statement = connection.prepareStatement(SELECT_ALL);
		ResultSet rs = statement.executeQuery();
		
		while (rs.next()) {
			System.out.println(rs.getInt("id") + "  " 
					+ rs.getString("first_name") +"  "+ "  " 
						+ rs.getString("last_name")+"  " 
							+ rs.getString("fathers_name") +"  " 
								+ rs.getInt("age")+"  "
									+rs.getDate("birth_day"));
}
	
	}


	
	public String enterFirstName (){
		System.out.println("Введіть ім'я:");
		String fname = scanner.next();
		return fname;
	}
	
	public String enterLastName() {
		System.out.println("Введіть прізвище:");
		String lastName = scanner.next();
		return lastName;
	}
	
	public String enterFathersName() {
		System.out.println("Введіть по батькові:");
		String fname = scanner.next();
		return fname;
	}
	
	public int enterAge() {
		int age = 0;
		System.out.println("Введіть вік:");
		age = scanner.nextInt();
		return age;
	}
	
	public Date enterBirthDay() {
		System.out.println("Ведіть дату народження в форматі РРРР-ММ-ДД:");
		Date date = Date.valueOf(scanner.next());
		return date;
	}
	
	public int enterRowNumber() {
		int row = 0;
		System.out.println("Введіть номер рядка");
		row = scanner.nextInt();
		return row;
	}
	
}
