public class Villain extends Human {

    public Villain(String name, int age) {
        super(name, age);
    }

    @Override
    public void tell(){

        System.out.println("Я " + getName() + ", мне " + getAge() + " лет, и я злодей.");

    }

}
