import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;
import java.io.File;
import java.util.*;

public class HomeRunTextRpt extends HomeRun
{
	protected String m_dataFile;
	protected String m_reportFile;
	
public HomeRunTextRpt(String dataFile, String reportFile)
{
	m_dataFile = dataFile;
	m_reportFile = reportFile;
}

public List<DataPair>loadData() throws FileNotFoundException
{
	List<DataPair> AryList = new ArrayList<DataPair>();
	
	Scanner reader = new Scanner(new File(m_dataFile));
	while (reader.hasNextLine()) 
	{
		String[] lines = reader.nextLine().split(",");
		if (lines.length >= 2)
		{
			AryList.add(new DataPair(lines[0], 
			Integer.parseInt(lines[1])));
		}
		else
		{
			AryList.add(new DataPair(lines[0], -1));
		}
}		
		return AryList;
}

public void generateReport(List<DataPair> data) throws FileNotFoundException 
{
	PrintWriter Filewriter = new PrintWriter(new File(m_reportFile));
	for (DataPair pair : data) {
		if (pair.getStat() != -1)
			Filewriter.printf("%s,  %d\n", pair.getName(), pair.getStat());
	}
	Filewriter.close();
	
}
}
