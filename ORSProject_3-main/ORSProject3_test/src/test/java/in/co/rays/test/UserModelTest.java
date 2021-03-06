package in.co.rays.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import in.co.rays.dto.UserDTO;
import in.co.rays.model.UserModelHibImp;
import in.co.rays.model.UserModelInt;
import in.co.rays.util.HibernateDataSource;

public class UserModelTest {
	public static UserModelInt model = new UserModelHibImp();

	public static void main(String[] args) throws Exception {
		// tsetregisterUser();
		testgetUser(5);
	}

	public static void testgetUser(long id) {
		// first level cache
		SessionFactory sf = HibernateDataSource.getSessionFactory();
		Session session = HibernateDataSource.getSession();
		
		/*
		 * UserDTO user =(UserDTO) session.get(UserDTO.class, id);
		 * 
		 * System.out.println(user.getFname()); System.out.println(user.getLname());
		 * System.out.println(user.getLogin()); System.out.println(user.getPassword());
		 * 
		 * UserDTO user1 =(UserDTO) session.get(UserDTO.class, id);
		 * System.out.println(user1.getFname()); System.out.println(user1.getLname());
		 * System.out.println(user1.getLogin());
		 * System.out.println(user1.getPassword());
		 * 
		 * session.close();
		 */

		
		  UserDTO user =(UserDTO) session.get(UserDTO.class, id);
		  
		  System.out.println(user.getFname()); System.out.println(user.getLname());
		  System.out.println(user.getLogin()); System.out.println(user.getPassword());
		  session.close();
		  
		  Session session1 = HibernateDataSource.getSession();
		
		  UserDTO user1 =(UserDTO) session1.get(UserDTO.class, id);
		  System.out.println(user1.getFname()); System.out.println(user1.getLname());
		  System.out.println(user1.getLogin());
		  System.out.println(user1.getPassword());
		  
		  session1.close();
		  sf.close();
		 

	}

	/*
	 * public static void tsetregisterUser() throws Exception { // TODO
	 * Auto-generated method stub UserDTO DTO = new UserDTO();
	 * DTO.setFname("KHUSHI"); DTO.setLname("RAJPUT");
	 * DTO.setLogin("KHUSHI88@GMAIL.COM"); DTO.setPassword("SUCCESS123");
	 * DTO.setMobileNo("9898653265");
	 * 
	 * long pk= model.add(DTO);
	 * 
	 * 
	 * }
	 */

}
