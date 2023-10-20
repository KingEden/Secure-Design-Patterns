package Singleton;
public class SingletonPatternDemo{
public static void main(String[] args) {

Logger object = Logger.getInstance();
System.out.println("This is Log # 1");
object.ShowLog("Malicious File Found");
System.out.println("This is Log # 2");
object.ShowLog("Virus Found");

}
}