package factory;

public class WindowsNotification extends Notification {

  public WindowsNotification() {
    // TODO Auto-generated constructor stub
  }
  
  @Override
  public Button createButton(String text) {
    return new WindowsButton(text);
  }

  @Override
  public void render() {
    System.out.println("Windoze World!!!");
  }

}
