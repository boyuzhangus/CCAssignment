//Standard implementation for record
public class StackWithMin extends Stack<NodeWithMin> {
  public void push(int value) {
    int newMin = Math.min(value, min());
    super.push(new NodeWithMin(value, newMin));
  }
  
  public int min() {
    if (this.isEmpty()){
      return Integer.MAX_VALUE;
    } else {
      return peek().min;
    }
  }
}

class NodeWithMin {
  public int value;
  public int min;
  publi NodeWithMin(int v, int min){
    value = v;
    this.min = min;
  }
}
//Standard additional Stack Implementation for record
public class StackWithMin2 extends Stack<Integer> {
  Stack<Integer> s2;
  public StackWithMin2() {
    s2 = new Stack<Integer>();
  }
  
  public void push(int value) {
    if (value <= min()) {
      s2.push(value);
    }
    super.push(value);
  }
  
  public Integer pop() {
    int value = super.pop();
    if (value == s2.pop()) {
      s2.pop();
    }
    return value;
  }
  
  public int min() {
    if (s2.isEmpty()){
      return Integer.MAX_VALUE;
    } else {
      return s2.peek();
    }
  }
}
  
      
