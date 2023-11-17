package fintech_java.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import fintech_java.finances.balance.TotalBalance;

public class TotalBalanceDAO {
  private Connection connection;

  // INSERT do DB
  public void insert(TotalBalance totalBalance){
    PreparedStatement statement = null;
    try {
      connection = FintechDBManager.getConnection();
      String sql = "INSERT INTO T_SALDO_TOTAL(ID_SALDO, T_USUARIO_ID_USUARIO, NR_SALDO) VALUES (SQ_SALDO.NEXTVAL, SQ_ID_USER.NEXTVAL, ?)";
      statement = connection.prepareStatement(sql);
      statement.setDouble(1, totalBalance.getBalance());
      statement.executeUpdate();
      System.out.println("Operação realizada com sucesso!");
    } catch (SQLException e) {
      e.printStackTrace();
      System.out.println("Falha ao conectar no banco de dados!");
    } finally{
      try{
        FintechDBManager.closeConnection(connection);
        statement.close();
      } catch(SQLException e){
        e.printStackTrace();
      }
    }
  }

  public List<TotalBalance> getAll(){
    List<TotalBalance> listBalance = new ArrayList<TotalBalance>();
    PreparedStatement statement = null;
    ResultSet resultSet = null;
    try {
      connection = FintechDBManager.getConnection();
      statement = connection.prepareStatement("SELECT * FROM T_SALDO_TOTAL");
      resultSet = statement.executeQuery();
      while(resultSet.next()){
        String id_saldo = resultSet.getString("ID_SALDO");
        String t_usuario_id_usuario = resultSet.getString("T_USUARIO_ID_USUARIO");
        double nr_saldo = resultSet.getDouble("NR_SALDO");
        TotalBalance totalBalance = new TotalBalance(id_saldo, t_usuario_id_usuario, nr_saldo);
        listBalance.add(totalBalance);
      }
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      try{
        resultSet.close();
        statement.close();
        FintechDBManager.closeConnection(connection);
      } catch(SQLException e){
        e.printStackTrace();
      }
    }
    return listBalance;
  }
  
}
