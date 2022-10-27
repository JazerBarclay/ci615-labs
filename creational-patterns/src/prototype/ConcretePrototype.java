package prototype;

public class ConcretePrototype implements Prototype {

  int fieldExample;
  
  public ConcretePrototype(int fieldExampleValue) {
    this.fieldExample = fieldExampleValue;
  }
  
  public ConcretePrototype(ConcretePrototype p) {
    this.fieldExample = p.fieldExample;
  }
  
  public Prototype clone() {
    return new ConcretePrototype(this);
  }
  
  public int toInt() {
    return fieldExample;
  }
  
}
