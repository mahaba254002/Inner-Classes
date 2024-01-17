public class Main {
  public static void main(String[] args) {
    OuterClass outer = new OuterClass();
    outer.laugh();
    /*
     * No need to create an instance of the outer class.
     * this... OuterClass outer = new OuterClass();
     */
    OuterClass.InnerClass2 inner1 = new OuterClass.InnerClass2();// for static class

    /*
     * To create an instance of InnerClass, you need an instance of OuterClass.
     */
    OuterClass.InnerClass inner = outer.new InnerClass();// for non static class
    inner.shutUp();
    inner1.hell();
  }
}
