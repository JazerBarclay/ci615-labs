package builder;

public class BuilderLauncher {

  public static void main(String[] args) {
    ThingBuilder tb = new ThingBuilder();
    StuffBuilder sb = new StuffBuilder();
    
    Director d = new Director(tb);
    
    d.make(1);
    Thing t1 = tb.getResult();
    
    tb.reset();
    
    d.make(3);
    Thing t2 = tb.getResult();

    
    System.out.println("T1: " + t1.part1+" "+t1.part2+" "+t1.part3);
    System.out.println("T2: " + t2.part1+" "+t2.part2+" "+t2.part3);
    
    
    d.changeBuilder(sb);
    
    d.make(1);
    Stuff s1 = sb.getResult();
    
    sb.reset();
    
    d.make(3);
    Stuff s2 = sb.getResult();
    

    System.out.println("S1: " + s1.part1+" "+s1.part2+" "+s1.part3);
    System.out.println("S2: " + s2.part1+" "+s2.part2+" "+s2.part3);
    
    
  }
  
}
