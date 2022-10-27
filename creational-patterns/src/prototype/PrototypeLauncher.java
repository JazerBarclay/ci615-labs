package prototype;

public class PrototypeLauncher {

  public static void main(String[] args) {
    
    ConcretePrototype p = new ConcretePrototype(10);
    ConcretePrototype p2 = (ConcretePrototype) p.clone();
    
    if (p == p2) System.out.println("Both objects are the same");
    else System.out.println("Objects are not the same");
    
    if ( p.toInt() == p2.toInt() ) System.out.println("Both objects hold the same value");
    else System.out.println("Objects contain different values");
    
  }
  
}
