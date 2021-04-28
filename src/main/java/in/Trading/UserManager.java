package in.Trading;
import java.util.ArrayList;
  public class UserManager {
		static ArrayList<User> userList = new ArrayList<User>();
		static {
			User user1 = new User();
			user1.name = "viswa";
			user1.email = "viswa@live.com";
			user1.password = "1234";
			User user2 = new User();
			user2.name = "john";
			user2.email = "john@live.com";
			user2.password = "1234";
			userList.add(user1);
			userList.add(user2);
		}
		public static void display() {
			//Display all user details
			for (User user : userList) {
				System.out.println(user.name + "-" + user.email  + "-" + user.password);	
			}
		}
		public static boolean login(String email, String password) {
			boolean exists = false;
			for(User user : userList) {
				if(user.email.equalsIgnoreCase(email) && user.password.equals(password)) {
					exists = true;
					break;
				}
			}
			return exists;
		}
	  }
  
 
  


