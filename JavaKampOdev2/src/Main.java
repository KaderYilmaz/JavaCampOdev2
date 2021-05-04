
public class Main {

	public static void main(String[] args) {
		User user1 = new Student (1, "Engin", "Demiroğ", "1234");
		User user2 = new Student (2, "Kader", "Yılmaz", "1356");
		User user3 = new Student (3, "Ayşe", "Kaya", "963852");
		User user4 = new Student (4, "Burak", "Tekin", "74185");

        
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.login(user2);
		instructorManager.courseAdd(user2);
		
		StudentManager studentManager = new StudentManager();
		studentManager.login(user2);
		studentManager.add(user3);
		studentManager.delete(user4);
		studentManager.login(user1);

	}

}
