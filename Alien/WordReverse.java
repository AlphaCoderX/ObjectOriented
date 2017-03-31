
public class WordReverse implements ICrypto 
{
	private static WordReverse m_instance;
	public static WordReverse getInstance()
	{
		if(m_instance == null)
			m_instance = new WordReverse();
		
		return m_instance;
	}
	@Override
	public String encrypt(String message) 
	{
		
		return decrypt(message);
	}

	@Override
	public String decrypt(String message) 
	{
		IMessageParser msg = Factory.getInstance().createParser(message);
		String decrypted = " ";
		
		for(int i = 0; i < msg.getWordCount(); i++)
		{
			IMessageParser word = Factory.getInstance().createParser(msg.getWord(i));
			char[] chars = msg.getWord(i).toCharArray();
		
		
		for(int j = 0; j < word.getCharCount() / 2; j++)
		{
			char t = word.getChar(j);
			chars[j] = chars[chars.length - 1 - j];
			chars[chars.length - 1 - j] = t; 
		}
		
		decrypted += new String(chars);
		decrypted += " ";
		
		}
		
		return decrypted;
	}

}
