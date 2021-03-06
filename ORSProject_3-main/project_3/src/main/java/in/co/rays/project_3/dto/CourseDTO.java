package in.co.rays.project_3.dto;

/**
 * It Encapsulate Course attribute.
 * @author Tanvi Singh
 *
 */
public class CourseDTO extends BaseDTO{
	private String coursename;
	private String duration;
	private String description;
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getKey() {
		// TODO Auto-generated method stub
		return id+"";
	}
	public String getValue() {
		// TODO Auto-generated method stub
		return coursename;
	}
}
