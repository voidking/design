package chapter08;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Properties;

public class LogManager
{
    private static final String DefaultLogFilePathName = "D:\\GF.log";
    private static LogManager logManager;
    private static InputStream fin;
    private static Properties pro;
    private static PrintWriter out;
    private static String logFileName;

    private LogManager()
    {
        outInit();
    }

    public static synchronized void log(String message)
    {
        if (logManager == null || out == null)
        {
            logManager = new LogManager();
        }
        if (out != null)
        {
            out.println(new Date() + ":" + message);
        }
    }

    public static synchronized void log(Exception ex)
    {
        if (logManager == null || out == null)
        {
            logManager = new LogManager();
        }
        if (out != null)
        {
            out.println(new Date() + ":");
            ex.printStackTrace(out);
        }
    }

    private void outInit()
    {
        if (logFileName == null)
        {
            logFileName = getLogFileName();
        }
        try
        {
            if (out == null)
            {
                out = new PrintWriter(new FileWriter(logFileName, true), true);
            }
        } catch (IOException ex)
        {
            System.out.println("无法打开日志文件"+ logFileName);
            ex.printStackTrace();
            out = null;
        }
    }

    private String getLogFileName()
    {
        try
        {
            if (pro == null)
            {
                pro = new Properties();
                fin = getClass().getResourceAsStream("log.properties");
                pro.load(fin);
                fin.close();
            }
        } catch (IOException ex)
        {
            System.err.println("无法打开属性配置文件: log.properties");
            ex.printStackTrace();
        }
        return pro.getProperty("logFile", DefaultLogFilePathName);
    }

    public void destroy()
    {
        try
        {
            this.logManager = null;
            if (out != null)
            {
                this.out.close();
            }
            if (fin != null)
            {
                this.fin.close();
            }
        } catch (IOException ex)
        {
            ex.printStackTrace();
        }
    }
}