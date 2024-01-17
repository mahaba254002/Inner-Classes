/*Annonymous inner class
 * Is a class without a name that's defined and instantiated in a single statement at the same time
 * used for short-lived, one-time use situations where creating a separate class might be overkill.
 * Can either extend an existing class or implement an existing interface
 */
public class AnnonynmousInnerClasses {
  public static void main(String[] args) {
    // extend existing class
    Animal animal = new Animal();
    animal.makeNoise();
    Animal cat = new Animal() {
      @Override
      public void makeNoise() {
        super.makeNoise();
        System.out.println("Cat sounds: Meow Meow Meow");
      }
    };
    cat.makeNoise();
  }
}

/*
 * used in event handling, such as with GUI programming,
 */