public class OuterClass {
  // non-static inner class
  class InnerClass {
    public void shutUp() {
      System.out.println("Will you shut up");
    }
  }

  // static inner class
  static class InnerClass2 {
    public void hell() {
      System.out.println("What!!!!! i cant");
    }
  }

  public void laugh() {
    System.out.println("hahahahhahahaha");
    class Louder {
      void again_() {
        System.out.println("Lough louder🤣🤣🤣🤣🤣");
      }
    }
    Louder loud = new Louder();
    loud.again_();
  }
}