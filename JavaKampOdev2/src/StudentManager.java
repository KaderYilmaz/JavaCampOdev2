
public class StudentManager {

	public void login(User user) {
		System.out.println(user.getFirstName()+" "+ user.getLastName()+" giri� yap�ld�.");
	}
	public void add(User user) {
		System.out.println(user.getFirstName()+ " kursu eklendi.");
	}
	public void delete(User user) {
		System.out.println(user.getFirstName()+" kursu sildi.");
	}
}
