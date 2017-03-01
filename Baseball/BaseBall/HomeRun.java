import java.util.*;
import java.io.*;

public class HomeRun
{
    public static void main(String args[]) throws IOException
    {
        new HomeRun().go();
    }
    
    public void go() throws IOException
    {
        List<HomeRunTextRpt> reports = new ArrayList<HomeRunTextRpt>();
        reports.add(new HomeRunTextRpt("players.txt", "Runreport1.txt"));
        reports.add(new HomeRunHTMLRpt("players.txt", "Runreport2.html"));
        reports.add(new RBITextRpt("players.txt", "RBIreport3.txt"));
        reports.add(new RBIHTMLRptA("players.txt", "RBIreport4.html"));
        reports.add(new RBIHTMLRptB("players.txt", "RBIreport5.html"));
        makeReports(reports);
    }
    
    private void makeReports(List<HomeRunTextRpt> reports) throws IOException
    {
        for (HomeRunTextRpt rpt : reports)
        {
            List<DataPair> data = rpt.loadData();
            rpt.generateReport(data);
        }
    }
}
