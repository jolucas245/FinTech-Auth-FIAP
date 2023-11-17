package fintech_java;

import java.util.List;

import fintech_java.dao.TotalBalanceDAO;
import fintech_java.finances.balance.TotalBalance;

// Classe de teste para inserção dos dados
public class Test {

	public static void main(String[] args) {
		TotalBalanceDAO dao = new TotalBalanceDAO();
		
		//  * 5 registros adicionados, como de acordo com a atividade
		TotalBalance totalBalance1 = new TotalBalance();
	    totalBalance1.setBalance(2300.29);
	    dao.insert(totalBalance1);

	    TotalBalance totalBalance2 = new TotalBalance();
	    totalBalance2.setBalance(1230.49);
	    dao.insert(totalBalance2);

	    TotalBalance totalBalance3 = new TotalBalance();
	    totalBalance3.setBalance(20.12);
	    dao.insert(totalBalance3);

	    TotalBalance totalBalance4 = new TotalBalance();
	    totalBalance4.setBalance(100.24);
	    dao.insert(totalBalance4);

	    TotalBalance totalBalance5 = new TotalBalance();
	    totalBalance5.setBalance(467.78);
	    dao.insert(totalBalance5);
	    
	    List<TotalBalance> list = dao.getAll();
	    for(TotalBalance item : list){
	      System.out.print(item.getId_balance());
	      System.out.print(item.getId_usuario());
	      System.out.print(item.getBalance());
	      System.out.println();
	    }
	}

}
