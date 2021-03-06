package in.co.rays.dto;

import javax.persistence.Cacheable;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.Entity;
import org.hibernate.cache.RegionFactory;



@Entity
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)

public class UserDTO {
 
	
	
	public long id;
	
	public String fname;
	
	public String lname;
	
	public String login;
	
	public String password;
	
	public String mobileNo;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

}
