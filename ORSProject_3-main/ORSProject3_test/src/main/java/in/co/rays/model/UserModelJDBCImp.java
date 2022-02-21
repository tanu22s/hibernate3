
package in.co.rays.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import in.co.rays.dto.UserDTO;

import in.co.rays.util.JDBCDataSource;

public class UserModelJDBCImp implements UserModelInt  {

	public long add(UserDTO dto) throws Exception {
		// TODO Auto-generated method stub
		Connection con = null;
		long pk = 0;
		
		try {
			con = JDBCDataSource.getConnection();
			con.setAutoCommit(false);
			pk = nextPK();
			
			PreparedStatement ps = con
					.prepareStatement("insert into ST_USER values(?,?,?,?,?,?)");
			ps.setLong(1, pk);
			ps.setString(2, dto.getFname());
			ps.setString(3, dto.getLname());
			ps.setString(4, dto.getLogin());
			ps.setString(5, dto.getPassword());
			
			ps.setString(6, dto.getMobileNo());
			

			ps.executeUpdate();
			
			con.commit();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
			try {
				con.rollback();

			} catch (Exception e2) {
				
				e2.printStackTrace();
				e.printStackTrace();
				throw new Exception("exception: add rollback exception:" + e2.getMessage());

			}
			throw new Exception("Exception : Exception in add User");
		} finally {
			JDBCDataSource.closeConnection(con);
		}

		
		System.out.println("Add method of jdbc end");
		return pk;
		
	}

	
		

	
public long nextPK() throws Exception {
		
		Connection con = null;
		long pk = 0;
		try {
			con = JDBCDataSource.getConnection();
			PreparedStatement ps = con.prepareStatement("select max(id) from ST_USER");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				pk = rs.getLong(1);
				System.out.println(pk);
			}
		} catch (Exception e) {
			
			throw new Exception("Database Exception" + e);

		} finally {
			JDBCDataSource.closeConnection(con);
		}
	
		return pk = pk + 1;

	}





public void delete(UserDTO dto) throws Exception {
	// TODO Auto-generated method stub
	
}





public void update(UserDTO dto) throws Exception {
	// TODO Auto-generated method stub
	
}





public UserDTO findByPK(long pk) throws Exception {
	// TODO Auto-generated method stub
	return null;
}


}

