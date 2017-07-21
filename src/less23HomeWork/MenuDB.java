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
				System.out.println("Меню дій: \n" 
					+ "Щоб додати рядок, введіть: 1 \n"
					+ "Щоб редагувати рядок, введіть: 2(Спершу введіть поля що хочете змінити, а потім id(номер рядка) для кого застосувати ці зміни); !якщо хочете залишити без змін поле перепешіть його \n"
					+ "Щоб видалити рядок, введіть: 3 \n"
					+ "Щоб вивести на екран таблицю, введіть: 4 \n"
					+ "Щоб вийти з програми, введіть: 0");

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
					System.out.println("Невірний вибір! Спробуйте ще раз!");
				}
			}
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
}
	}
}
