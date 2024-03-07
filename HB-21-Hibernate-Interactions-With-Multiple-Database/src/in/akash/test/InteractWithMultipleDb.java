package in.akash.test;

import in.akash.dao.ITransferDao;
import in.akash.dao.TransferDaoImpl;
import in.akash.util.mysql2hibernateUtil;
import in.akash.util.mysqlhibernateUtil;

public class InteractWithMultipleDb {

	public static void main(String[] args) throws Exception{
		
		//loose coupling as interface name is used  in place of class type (ITransferDao)
ITransferDao dao=new TransferDaoImpl();
	String result=dao.transferProductById(3);
	System.out.println(result);

	
	
	
	mysql2hibernateUtil.closeSessionFactory();
	mysqlhibernateUtil.closeSessionFactory();
	}

}
