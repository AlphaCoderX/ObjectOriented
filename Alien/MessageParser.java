import java.util.Arrays;
import java.util.List;

public class MessageParser implements IMessageParser
{
	//private List<String> m_words = new ArrayList<String>();
	private List<String> m_words;
	private String m_message;
	public MessageParser(String message)
	{
		m_message = message;
		m_words = Arrays.asList(message.split(" "));
	}

	@Override
	public int getCharCount()
	{	
		return m_message.length();
	}
	@Override
	public int getWordCount()
	{
		return m_words.size();
	}
	@Override
	public char getChar(int i) 
	{
		return m_message.charAt(i);
	}
	@Override
	public String getWord(int i) 
	{
		return m_words.get(i);
	}
}
