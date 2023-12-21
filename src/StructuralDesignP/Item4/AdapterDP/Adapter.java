package StructuralDesignP.Item4.AdapterDP;

public class Adapter {
	class OldUser{
		int id;
		String username;
		String name;
		String lastName;
	}
	interface OldUserService{ // eski sistemin service katmani
		OldUser getUser(int id); // id uzerinden sorgu yapiliyor
	}
	
	class User{
		int id;
		String email;
		String username;
		String name;
		String lastName;
		String location;
		Boolean isActive;
	}
	// yeni sistem REPO katmani
	interface UserRepository{
		User getUser(String email);
	}
	// yeni sistemin service katmani
	interface UserService{
		User getUser(String email);
	}
	class UserServiceAdpter implements UserService{
		UserRepository userRepository;
		OldUserService oldUSerService;
		@Override
		public User getUser(String email) {
			User user = userRepository.getUser(email);
			OldUser oldUser = oldUSerService.getUser(user.id);
			user.username=oldUser.username;
			user.lastName=oldUser.lastName;
			return user;
		}
		
	}
	
	//main icin gerekli method
	public void adapterDemo() {
		UserService userService = new UserServiceAdpter();
		User user =  userService.getUser("dev.kokadm@gmail.com");
		System.out.println(user);
	}
	
	public static void main(String[] args) {
		/*
		Adapter adapter =new Adapter();
		adapter.adapterDemo();
		*/
		
	}

}
