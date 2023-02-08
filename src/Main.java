public class Main {
    public static void main(String[] args) {
        int account_1 = 100; // баланс
        int x = 1200;        // сумма пополнения
        int account_2 = x + account_1;
        int bonus;
        if ( x >= 1000 ) {
            bonus = x / 100;
        }else {
            bonus = 0;
        }
        int total_bonus = bonus;
        System.out.println("Your balance: " + account_2 + " rubles");
        System.out.println("You've received: " + total_bonus + " bonus.");

    }
}