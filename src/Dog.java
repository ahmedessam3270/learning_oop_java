public class Dog implements Animal {

    @Override
    public void walk() {
        System.out.println("Dog is walking");
    }

    @Override
    public void drink() {
        System.out.println("Dog is drinking");
    }
}
