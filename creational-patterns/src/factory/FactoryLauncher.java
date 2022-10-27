package factory;

public class FactoryLauncher {

  public static void main(String[] args) {

//    Notification n = new WindowsNotification();
    Notification n = new MacNotification();
    Button b = n.createButton("Close");
    
    n.render();
    b.onClick();
    
    // No need to know the button since notification will create the one we need
    
  }
  
}
