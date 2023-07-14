public class main_4_dz {

    public static int i1;

    public static String s1;

    public static int[] m1 = new int[10];

    public static char c1;

    public static void main(String[] args) {

        main_4_dz.i1 = 1;
        main_4_dz.s1 = "Я первая строка.";
        System.out.println(main_4_dz.i1 +"\n" + main_4_dz.s1);

        for ( int i = 0; i < 10; i++ ) {
            main_4_dz.m1[i] = (i + 1) * 10;
            System.out.println(main_4_dz.m1[i]);
        }

        main_4_dz.c1 = '&';
        System.out.println(main_4_dz.c1);

        int i2 = 2;
        String s2 = "Я вторая строка.";
        System.out.println("\n" + i2 + "\n" + s2);

        int[] m2 = new int[5];
        for ( int j = 0; j < 5; j++ ) {
            m2[j] = (j + 1) * 20;
            System.out.println(m2[j]);
        }

        char c2 = '$';
        System.out.println(c2);

    }

}
