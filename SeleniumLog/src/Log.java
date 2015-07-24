import org.apache.log4j.*;
public class Log {

private static Logger Log=Logger.getLogger(Log.class.getName());

public static void starttestcase(String sgetclassname)
{
	Log.info("**********************************");
	Log.info("*****************"+sgetclassname+"****************");
	Log.info("*********************************");
	
}
public static void endtestcase(String etestcase)
{
	Log.info("*******************************");
	Log.info("**************"+"E--N--D"+"********");
	Log.info("X");
	Log.info("X");
	Log.info("X");
	
	
}
public static void info(String message)
{
	Log.info(message);
}
public static void error(String error)
{
	Log.info(error);
}

}
