public class main_3_dzs {

    public static void main(String[] args) {

        Human human = new Human("Саша", 25);
        Worker worker = new Worker("Влад", 30, "учитель");

        human.tell();

        System.out.println();

        worker.tell();

    }

}