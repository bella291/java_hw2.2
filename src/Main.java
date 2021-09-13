public class Main {
        public static void main(String[] args) {
        int current = 132; //вводим сумму текущего баланса
        int addSum = 1890; //вводим сумму пополнения счета
        int bonus = addSum/100*1;

        if (addSum > 1000) {
            int total = bonus + addSum + current;
            System.out.println("Текущая сумма вашего счета составляет" + " " + total + " " + "руб." );
            System.out.println("Ваш бонус составил" + " " + bonus + " " + "руб.");
        }
        else {
            int total = addSum + current;
            System.out.println("Текущая сумма вашего счета составляет" + " " + total + " " + "руб." );
            System.out.println("Пополните баланс счета вашего телефона на сумму более 1000 руб. и получите бонус в 1 рубль за каждые 100 рублей!");
        }
    }
    }
