import java.util.Scanner;


public class Decision implements IDecision {
	
	private String m_question;
	private IDecision m_yes;
	private IDecision m_no;
	private String m_yesTerminal;
	private String m_noTerminal;
	private Scanner keyboard = new Scanner(System.in);
	private String reply;
	
	public Decision(String ask)
	{
		m_question = ask;
	}
	@Override
	public void setYes(IDecision yes) 
	{
		m_yes = yes;
	}
	@Override
	public void setNo(IDecision no) 
	{
		m_no = no;
	}
	@Override
	public void setYesTerminal(String terminal) 
	{
		m_yesTerminal = terminal;
	}
	@Override
	public void setNoTerminal(String terminal) 
	{
		m_noTerminal = terminal;
	}
	@Override
	public IDecision ask() 
	{		
		System.out.println(m_question);
		reply = keyboard.next();
		
		if (reply.equals("yes"))
		{
			if(m_yes == null)
			System.out.print(m_yesTerminal);
			return m_yes;
		}
		else if(reply.equals("no"))
		{	
			if(m_no == null)
			System.out.print(m_noTerminal);
			return m_no;
		}
				
		else
		{
			System.out.print("Incorrect command entered");
		}
		return null;
	
		
	}
	
	

}
