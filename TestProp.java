import java.util.*;  
import java.io.*;  

class TestProp
{
  public static void main(String[] args)
  {
    Properties prop = new Properties();
    String fileName = "config.ini";
    InputStream is = null;
    try 
    {
        is = new FileInputStream(fileName);
    } catch (FileNotFoundException ex) 
    {
        ex.printStackTrace();
    }
    try 
    {
        prop.load(is);
    } catch (IOException ex) 
    {
        ex.printStackTrace();
    }
    System.out.println(prop.getProperty("word"));
    System.out.println(prop.getProperty("freq"));
  }
}