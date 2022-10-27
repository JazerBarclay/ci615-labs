package factory;

public class MacButton extends Button {

  public MacButton(String text) {
    super(text + " [MAC]");
  }
  
  @Override
  public void onClick() {
    System.out.println(text + " -> Laa dee");
  }

}
