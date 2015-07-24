import org.apache.log4j.xml.DOMConfigurator;
import org.apache.log4j.*;

public class MainApp {
public static void main(String args[])
{
	PageLoaf po=new PageLoaf();
	DOMConfigurator.configure("Log4j.xml");
	Log.starttestcase("Load Page");
	po.PageLoad();
}
}
