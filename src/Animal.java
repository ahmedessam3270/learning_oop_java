public interface Animal {
    // It can not be instantiated
    // Its properties must be public static final
    // Meaning that they must have a final not changing value and public and static
    // Its methods must be abstracted and cannot hold body

//    String type = "pet"
// => public static final String type = "pet"

    // function must be abstract
    // but these abstract methods when this interface being implemented must have their own implementation
    // => it forces the class implementing them to have their own implementation for the abstract method
    // the first thing to do to Override these methods
   void walk();

   void drink();

}
