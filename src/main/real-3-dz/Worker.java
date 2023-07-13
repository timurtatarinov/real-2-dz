public class Worker extends Human {

    String profession;

    public Worker(String name, int age, String profession) {

        super(name, age);
        this.profession = profession;

    }

    @Override
    public void tell(){

        System.out.println("Я " + getName() + ", мне " + getAge() + " лет, и я " + profession + ".");

    }

}