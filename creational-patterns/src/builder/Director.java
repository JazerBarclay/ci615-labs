package builder;

public class Director {

  Builder b;
  
  public Director(Builder b) {
    changeBuilder(b);
  }
  
  public void changeBuilder(Builder b) {
    this.b = b;
  }
  
  public void make(int complexity) {
    switch (complexity) {
      case 3:
        b.buildPart3();
      case 2:
        b.buildPart2();
      case 1:
      default:
        b.buildPart1();
        break;
    }
  }
  
}
