package Singleton;

public class Logger{

    private static Logger instance;

    private Logger()
    {
        System.out.println("Creating Instance of Logger\n");
    }

    public static Logger getInstance()
    {
        if (instance == null) 
        {
            instance = new Logger(); 
        }
        return instance;
    }

    public void ShowLog( String msg) 
    {
        System.out.println("Log : " + msg);
    }
}
