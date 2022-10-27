package builder;

public class ThingBuilder implements Builder {

  Thing t;
  
  public ThingBuilder() {
    reset();
  }
  
  @Override
  public void buildPart1() {
    t.part1 = "Hello";
  }

  @Override
  public void buildPart2() {
    t.part2 = "There";
  }

  @Override
  public void buildPart3() {
    t.part3 = "Friend";
  }
  
  public Thing getResult() {
    return t;
  }

  @Override
  public void reset() {
    t = new Thing();
  }

}
