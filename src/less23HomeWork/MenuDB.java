package less23HomeWork;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class MenuDB {
	public static final String CONNECTION_URL = "jdbc:mysql://localhost:3306/devjava5?useSSL=false";
	
	public static final String USER = "root";
	
	public static final String PASSWORD = "qwerty";
	
	private FunctinalDB fDb = new FunctinalDB();
	
	private Scanner scanner = new Scanner(System.in);
	
	public void startProgram() {
		try (Connection connection = DriverManager.getConnection(CONNECTION_URL, USER, PASSWORD)) {
			fDb.createTable(connection);
			boolean isRun = true;

			while (isRun) {
				System.out.println("���� ��: \n" 
					+ "��� ������ �����, ������: 1 \n"
					+ "��� ���������� �����, ������: 2(������ ������ ���� �� ������ ������, � ���� id(����� �����) ��� ���� ����������� �� ����); !���� ������ �������� ��� ��� ���� ���������� ���� \n"
					+ "��� �������� �����, ������: 3 \n"
					+ "��� ������� �� ����� �������, ������: 4 \n"
					+ "��� ����� � ��������, ������: 0");

				switch (scanner.next()) {
				case "1":
					fDb.addRow(connection);
					break;
				case "2":
					fDb.updateRow(connection);
					break;
				case "3":
					fDb.deleteRow(connection);
					break;
				case "4":
					fDb.selectAllTable(connection);
					break;
				case "0":
					isRun = false;
					break;
				default:
					System.out.println("������� ����! ��������� �� ���!");
				}
			}
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
}
	}
}
