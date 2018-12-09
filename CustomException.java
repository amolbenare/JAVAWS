class InvalidUserException extends Exception{
	InvalidUserException(String msg){
		super(msg);
	}
}

class LoginUser{
	public void loginUser(String user, String pass) throws Exception{
		if(!pass.equals("Amol")){
			throw new InvalidUserException("Incorrect user");
		}
	}
}

class ExceptionDemo{
	public static void main(String[] args) {
		try{
			new LoginUser().loginUser("user","Admin");

		}catch(Exception ex){
			System.out.println(ex); 
		}
	}
}