package in.co.rays.model;

import org.hibernate.HibernateException;

import org.hibernate.Session;
import org.hibernate.Transaction;

import in.co.rays.dto.UserDTO;


import in.co.rays.util.HibernateDataSource;

public class UserModelHibImp implements UserModelInt {

	public long add(UserDTO dto) throws Exception {
		// TODO Auto-generated method stub

		
			Session session = HibernateDataSource.getSession();
			Transaction tx = null;
			try {

				tx = session.beginTransaction();
	            session.save(dto);
				tx.commit();
			} catch (HibernateException e) {
				e.printStackTrace();
				// TODO: handle exception
				if (tx != null) {
					tx.rollback();

				}
				throw new Exception("Exception in User Add " + e.getMessage());
			} finally {
				session.close();
			}
			System.out.println("56789");
			/* log.debug("Model add End"); */
			return dto.getId();
			
		}

	public void delete(UserDTO dto) throws Exception {
		// TODO Auto-generated method stub
		
	}

	public void update(UserDTO dto) throws Exception {
		// TODO Auto-generated method stub
		
	}

	public UserDTO findByPK(long pk) throws Exception {
		// TODO Auto-generated method stub
		
			
			Session session = null;
			UserDTO dto = null;
			try {
				session = HibernateDataSource.getSession();
				dto = (UserDTO) session.get(UserDTO.class, pk);

			} catch (HibernateException e) {
				throw new Exception("Exception : Exception in getting User by pk");
			} finally {
				session.close();
			}

			return dto;
		
	}
	}


