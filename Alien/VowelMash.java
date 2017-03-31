
public class VowelMash implements ICrypto
{
	public static VowelMash m_instance;
	public static VowelMash getInstance()
	{
		if(m_instance == null)
			m_instance = new VowelMash();
		
		return m_instance;
	}

	@Override
	public String encrypt(String message) 
	{
		IMessageParser parse = Factory.getInstance().createParser(message);
		String encrypted = "";
		
		for(int i = 0; i < parse.getCharCount(); i++)
		{
			char c = parse.getChar(i);
			
			if(c == 'A')
			{
				c = 'E';
			}
			
			if(c == 'E')
			{
				c = 'I';
			}
			
			if(c == 'I')
			{
				c = 'O';
			}
			
			if(c == 'O')
			{
				c = 'U';
			}

			if(c == 'U')
			{
				c = 'A';
			}
			
			
			encrypted += c;
	
					
		}
		
		return encrypted;
	}

	@Override
	public String decrypt(String message) 
	{
		IMessageParser parse = Factory.getInstance().createParser(message);
		String decrypted = "";
		
		for(int i = 0; i < parse.getCharCount(); i++)
		{
			char c = parse.getChar(i);
			
			if(c == 'A')
			{
				c = 'U';
			}
			
			if(c == 'E')
			{
				c = 'A';
			}
			
			if(c == 'I')
			{
				c = 'E';
			}
			
			if(c == 'O')
			{
				c = 'I';
			}

			if(c == 'U')
			{
				c = 'O';
			}
			
			decrypted += c;
			
						
		}
		
		return decrypted;
	}

}
