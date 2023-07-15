public class main_5_dzs {

    public static void main(String[] args) {

        BoxLocker boxLocker1 = new BoxLocker.Builder()
                .forLenght(40)
                .forWidth(40)
                .forHeight(60)
                .forCost(600)
                .forColor("White Wood")
                .build();
        BoxLocker boxLocker2 = new BoxLocker.Builder()
                .forLenght(40)
                .forWidth(40)
                .forHeight(60)
                .forCost(600)
                .forColor("White Wood")
                .build();

        if (boxLocker1.hashCode() == boxLocker2.hashCode()) {
            System.out.println("Хеш-коды этих объектов одинаковы.");

            if (boxLocker1.equals(boxLocker2)) {
                System.out.println("Сами объекты тоже одинаковы.");
            } else {
                System.out.println("А сами объекты неодинаковы.");
            }

        } else {
            System.out.println("Хеш-коды этих объектов неодинаковы." + "\n"
                    + "А следовательно, и объекты тоже.");
        }

    }

}