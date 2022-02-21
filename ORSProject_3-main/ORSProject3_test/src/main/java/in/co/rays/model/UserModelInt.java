package in.co.rays.model;

import java.util.List;

import in.co.rays.dto.UserDTO;

	
	public interface UserModelInt {
		public long add(UserDTO dto)throws Exception;
		
	
		public void delete(UserDTO dto)throws Exception;
		public void update(UserDTO dto)throws Exception;
		public UserDTO findByPK(long pk)throws Exception;
	
	}


