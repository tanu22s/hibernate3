package in.co.rays.project_3.dto;


/**
 * @author Tanvi Singh
 *
 */
public class CollegeDTO extends BaseDTO{
	private String name;
	private String address;
	private String state;
	private String city;
	private String phoneno;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	public String getKey() {
		return id+"";
	}
	public String getValue() {
		return name;
	}

}
