public class Builder
{
	
	private static Builder m_instance;
	public static Builder getInstance() 
	{

	    if (m_instance == null)
	        m_instance = new Builder();

	      return m_instance;
	}
	public IDecision buildWizard() 
	{		
		IDecision q1 = new Decision("Do you want to buy a snowboard?");
		IDecision q2 = new Decision("Have you snowboarded before?");
		IDecision q3 = new Decision("Are you an expert?");
		IDecision q4 = new Decision("Do you like to go fast?");
		IDecision xg300 = new Decision("Buy the XG300 model.");
		IDecision xg100 = new Decision("Buy the XG100 model.");
		IDecision xg200 = new Decision("Buy the XG200 model.");
		
		IDecision s1 = new Decision("Do you want to buy downhill skis?");
		IDecision s2 = new Decision("Have you gone skiing before?");
		IDecision s3 = new Decision("Are you an expert?");
		IDecision s4 = new Decision("Do you like to	jump?");
		IDecision s5 = new Decision("What's the matter with you?\nSkiing is actually pretty fun, give it a shot!");
		IDecision zr300 = new Decision("Buy the ZR300 model.");
		IDecision zr100 = new Decision("Buy the ZR100 model.");
		IDecision zr200 = new Decision("Buy the ZR200 model.");		
			
		q1.setYes(q2);
		q1.setNo(s1);
		q2.setNo(xg100);
		q2.setYes(q3);
		q3.setYes(q4);
		q3.setNo(xg200);
		q4.setYes(xg300);
		q4.setNo(xg200);
		
		

		
		s1.setYes(s2);
		s1.setNo(s5);
		s2.setNo(zr100);
		s2.setYes(s3);
		s3.setYes(s4);
		s3.setNo(zr200);
		s4.setYes(zr300);
		s4.setNo(zr200);
		

		return q1;
	}
	



}
