package factory;

public abstract class Notification {

  public abstract Button createButton(String text);
  
  public abstract void render();
  
}
