package polymorphism;

public class EmailSender extends MessageSender{
	
public void send()
{
	System.out.println("sending an email");
}

public void send(String recepient,String subject)
{
	System.out.println("email send to "+recepient+" with "+subject);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmailSender e=new EmailSender();
		e.send();
		e.send("remya");
		e.send("rem", "important");
		

	}

}
