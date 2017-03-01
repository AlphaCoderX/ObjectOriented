import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;
public class HomeRunHTMLRpt extends HomeRunTextRpt {

	public HomeRunHTMLRpt(String dataFile, String reportFile) 
	{
		super(dataFile, reportFile);
	}

	@Override
	public void generateReport(List<DataPair> data) throws FileNotFoundException
	{
		PrintWriter Filewriter = new PrintWriter(new File(m_reportFile));
		Filewriter.printf("<html>\n");
		Filewriter.printf("<body>\n");
		Filewriter.printf("<table>\n");
		for (DataPair pair : data) {
			if (pair.getStat() != -1)
			{
				Filewriter.printf("<tr><td>%s</td><td>%d</td></tr>\n", pair.getName(), pair.getStat());
			}
		}
		Filewriter.printf("</table>\n");
		Filewriter.printf("</html>\n");
		Filewriter.printf("</body>\n");
		Filewriter.close();
		

}

}
