public class Human {

    private String name;

    private int age;

    public Human(String name, int age){

        this.name = name;
        this.age = age;

    }

    public String getName() { return name; }

    public int getAge() { return age; }

    public void tell(){

        System.out.println("Я " + name + ", мне " + age + " лет.");

    }

}