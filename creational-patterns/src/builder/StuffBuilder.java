package builder;

public class StuffBuilder implements Builder {

  Stuff s;
  
  public StuffBuilder() {
    reset();
  }
  
  @Override
  public void buildPart1() {
    s.part1 = 1;
  }

  @Override
  public void buildPart2() {
    s.part2 = 2;
  }

  @Override
  public void buildPart3() {
    s.part3 = 5;
  }

  @Override
  public void reset() {
    s = new Stuff();
  }
  
  public Stuff getResult() {
    return s;
  }

}
