package polymorphism;

public class MessageSender {
	public void send()
	{
		System.out.println("sending a general message");
	}
public void send(String recepient)
{
	System.out.println("sending message to "+recepient);
}
}
