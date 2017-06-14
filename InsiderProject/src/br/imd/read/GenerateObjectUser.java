package br.imd.read;

public class GenerateObjectUser extends GenerateObject{
	
	public GenerateObjectUser(){}
		
	public static User createUser(String[] userLine){
		User user = new User(userLine);
		/**for(int i=0; i< userLine.length; i++){
		System.out.println(user.getName());
		System.out.println(user.getUserId());
		System.out.println(user.getEmail());
		System.out.println(user.getDomain());
		System.out.println(user.getRole());
		}
		return user;
	}*/

		return user;
	}
	
}
