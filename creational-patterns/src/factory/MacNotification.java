package factory;

public class MacNotification extends Notification {
  
  public MacNotification() {
    // TODO Auto-generated constructor stub
  }

  @Override
  public Button createButton(String text) {
    return new MacButton(text);
  }

  @Override
  public void render() {
    System.out.println("Mac World!!!");
  }

}
