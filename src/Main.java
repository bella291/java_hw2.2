public class Main {
        public static void main(String[] args) {
        int current = 100; //вводим сумму текущего баланса
        int addSum = 300; //вводим сумму пополнения счета
        int total = addSum + current;

        if (addSum > 1000) {
            int bonus = addSum/100;
            int totalBonus = addSum + current + bonus;
            System.out.println("Ваш бонус составил" + " " + bonus + " " + "руб.");
            System.out.println("Текущая сумма вашего счета составляет" + " " + totalBonus + " " + "руб." );
        }
        else {
            System.out.println("Текущая сумма вашего счета составляет" + " " + total + " " + "руб." );
        }
    }
    }
