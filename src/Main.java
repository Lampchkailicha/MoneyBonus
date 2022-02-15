public class Main {
    public static void main(String[] args) {
        int startAccount = 100;
        int amount = 1500;
        int finalAccount;
        int moneyBonus;

        if (amount > 1000) {
            moneyBonus = amount / 100;
            finalAccount = startAccount + amount + moneyBonus;
        } else {
            moneyBonus = 0;
            finalAccount = startAccount + amount;
        }
            System.out.println("Итоговый счет: " + finalAccount);
            System.out.println("Бонус: " + moneyBonus);
    }
}
