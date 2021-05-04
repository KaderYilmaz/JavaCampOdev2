
public class Student extends User {

	private String courseName;
	public Student(int id, String firstName, String lastName, String password) {
		super(id, firstName, lastName, password);
		
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	

}
