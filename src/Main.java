public class Main {
        public static void main(String[] args) {
        int current = 132; //вводим сумму текущего баланса
        int addSum = 1880; //вводим сумму пополнения счета
        int total = addSum + current;
        int bonus = addSum/100*1;
        int totalBonus = bonus + addSum + current;

        if (addSum > 1000) {
            System.out.println("Текущая сумма вашего счета составляет" + " " + total + " " + "руб." );
            System.out.println("Ваш бонус составил" + " " + bonus + " " + "руб.");
        }
        else {
            System.out.println("Текущая сумма вашего счета составляет" + " " + total + " " + "руб." );

        }
    }
    }
