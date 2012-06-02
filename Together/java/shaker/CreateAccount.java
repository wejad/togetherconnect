import javax.swing.*;

class CreateAccount{
	static  String UserName,s;
	static float Password;
	int count=0;
	
	public CreateAccount(String UserName,float Password){
		this.UserName=UserName;
		this.Password=Password;
	}
	
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
	    s=JOptionPane.showInputDialog("Enter your Age");
	    int age = Integer.parseInt(s);
	    String City = JOptionPane.showInputDialog("Enter your City");
	    count++;
	    JOptionPane.showMessageDialog(null,"Creating Account ^_^");
	    }
		
	}
	
	public String findUser(String name){
		if(UserName==name){
			return name;
		}
		name=null;
		return name;
}
public static void main (String[] args) {
	CreateAccount a = new CreateAccount(UserName,Password);
	a.AddUser(UserName,Password);
}
}