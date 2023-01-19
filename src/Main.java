public class Main {
    public static void main(String[] args) {
        int initialAccount = 1000;
        int refill = 400;
        int bonus = 0;

        if (refill > 1000) {
            bonus = refill / 100;
        }
        int finalAccount = initialAccount + refill + bonus;
        System.out.println(" Итоговый счет: " + finalAccount);
        System.out.println(" Бонус: " + bonus);
    }

}

