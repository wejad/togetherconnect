import javax.swing.*;

class CreateAccount{
	String UserName,s;
	float Password;
	int count=0;
	
	public void Entering(String UserName,float Password){
	UserName=JOptionPane.showInputDialog("Enter User Name");
	s=JOptionPane.showInputDialog("Enter The Password");
	Password=Float.parseFloat(s);
	}
	
	public void AddUser(String UserName,float Password){
		String p;
		UserName=JOptionPane.showInputDialog("Enter The name of User your Create");
		p=findUser(UserName);
		if(p==null){
		
	    s=JOptionPane.showInputDialog("Enter The Password");
	    Password=Float.parseFloat(s);
	    count++;}
		
	}
	
	public String findUser(String name){
		name=JOptionPane.showInputDialog("Enter the name");
		if(UserName==name){
			return name;
		}
		name=null;
		return name;
}
}