public class Main {
    public static void main(String[] args) {
        //Переменные данные:
        int balance = 100;
        int depAmount = 9000;

        //Программа:
        int bonus;
        if (depAmount < 1000){
           bonus = 0;
       } else {bonus = depAmount / 100;
        }
       int newbalance = balance + bonus + depAmount;
        System.out.println("Бонус - " + bonus + ".");
        System.out.println("Текущий баланс - " + newbalance + ".");
    }
}