public class Variables {
    public static void main(String[] args) {
        int myInt = 557; //4байта, ≈ от 2млрд,147илн до 2млрд,147млн
        short myShort = 3266; //2байта, от -32,768 до 32,767
        long myLong = 26246246; //8байтов, ≈ от -9*10^18 до 9*10^18

        double myDouble = 235.35; //8 байтов
        float myFloat = 2362.4f; //4байта

        char c = 'a'; //2байта, от 0 до 65,535
        boolean b = true; //true или false

        byte myBite = 100; //1байт, от -128 до 127
        System.out.println(myInt);
    }
}