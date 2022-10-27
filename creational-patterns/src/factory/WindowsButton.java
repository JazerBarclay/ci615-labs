package factory;

public class WindowsButton extends Button {

  public WindowsButton(String text) {
    super("[WIN] " + text);
  }
  
  @Override
  public void onClick() {
    System.out.println(text + " -> Doo dum");
  }
  
}
