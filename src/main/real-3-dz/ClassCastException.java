public class ClassCastException {

    public static void main(String[] args) throws WorkerException {

        Human human = new Villain("Злодей", 30);

        try {
            Worker worker = (Worker) human;
        } catch (java.lang.ClassCastException e){
            throw new WorkerException("ClassCastException");
        }
    }

}
