package fintech_java.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FintechDBManager {

  private static final String URL = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL";
  private static final String USER = "RM551504";
  private static final String PASSWORD = "250203";

  public static Connection getConnection(){
    Connection connection = null;
    try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("Conectado");
		} catch(SQLException exception){
			System.out.println("Não foi possível conectar no DB:");
			exception.printStackTrace();
		} catch (ClassNotFoundException exception){
			System.out.println("Driver JDBC não encontrado!");
			exception.printStackTrace();

		}
    return connection;
  } 

  public static void closeConnection(Connection connection) throws SQLException {
    if(connection != null && !connection.isClosed()){
      connection.close();
    }
  }
}
