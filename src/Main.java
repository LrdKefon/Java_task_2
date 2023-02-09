public class Main {
    public static void main(String[] args) {
        int balance = 200; // баланс
        int amount = 1730;        // сумма пополнения
        int account = amount + balance;
        int bonus;
        if (amount >= 1000) {
            bonus = amount / 100;
        } else {
            bonus = 0;
        }
        int total_bonus = bonus;
        System.out.println("Your balance: " + account + " rubles");
        System.out.println("You've received: " + total_bonus + " bonus.");

    }
}