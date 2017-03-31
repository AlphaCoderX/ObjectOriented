
public class Factory 
{
	public static Factory m_instance;
	public static Factory getInstance()
	{
		if(m_instance == null)
			m_instance = new Factory();
		
		return m_instance;
	}
	
	public IMessageParser createParser(String text)
	{
		return new MessageParser(text);
		
	}

}
