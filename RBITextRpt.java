import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RBITextRpt extends HomeRunTextRpt 
{

	public RBITextRpt(String dataFile, String reportFile) 
	{
		super(dataFile, reportFile);
	}
	
	@Override
	public List<DataPair>loadData() throws FileNotFoundException
	{
	List<DataPair> AryList = new ArrayList<DataPair>();
	
	Scanner reader = new Scanner(new File(m_dataFile));
	while (reader.hasNextLine()) 
	{
		int len = 3;
		
		String[] lines = reader.nextLine().split(",");
		if (lines.length >= len)
		{
			AryList.add(new DataPair(lines[0], 
			Integer.parseInt(lines[2])));
		}
		else
		{
			AryList.add(new DataPair(lines[0], -1));
		}
}		
		return AryList;

}
	
}