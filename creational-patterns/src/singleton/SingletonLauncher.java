package singleton;

public class SingletonLauncher {
  
  public static void main(String[] args) {
    Singleton s = Singleton.getInstance();
    Singleton s2 = Singleton.getInstance();

    if (s == s2) System.out.println("Both singleton objects are the same");
    else System.out.println("Singleton objects are not the same");
  }

}
