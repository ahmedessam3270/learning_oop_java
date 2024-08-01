public class Boy extends Person {
    private String militaryStatus;

    public String getMilitaryStatus() {
        return militaryStatus;
    }

    public void setMilitaryStatus(String militaryStatus) {
        this.militaryStatus = militaryStatus;
    }

    @Override
    public String sayHello(){
        return "Hello Iam a boy";
    }

    public Boy (){
        System.out.println("Boy created");
    }
//    public Boy(String militaryStatus,String name, int age ){
//        super(name,age);
//        this.militaryStatus = militaryStatus;
//    }


    public Boy(String name, int age, String militaryStatus) {
        super(name, age);
        this.militaryStatus = militaryStatus;
    }
}
