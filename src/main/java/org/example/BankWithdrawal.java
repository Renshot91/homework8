package org.example;
import java.util.Scanner;
//У вас на банковском счету N долларов.
//Вы хотите снять все, но банк разрешает снять только сумму, которая является делителем текущей суммы на счету и меньше текущей суммы.
//Если вы снимаете максимально возможную сумму каждый день, сколько дней вам понадобится, чтобы забрать все свои деньги из банка?
//Примечание: если оставшаяся сумма равна 1, вы можете снять ее.
//
//
//Ввод:  N = 21
//Выход:  7
//Объяснение:  N = 21
//Снято 7, осталось = 14
//Снято 7, осталось = 7
//Снято 1, осталось = 6
//Снято 3, осталось = 3
//Снято 1, осталось = 2
//Снято 1, Осталось = 1
//Снято 1, осталось = 0
public class BankWithdrawal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int days = 0;

        while (N > 0) {
            int amountToWithdraw = findLargestDivisor(N);
            N -= amountToWithdraw;
            days++;
        }

        System.out.println("Days needed: " + days);
    }

    public static int findLargestDivisor(int number) {
        for (int i = number - 1; i > 0; i--) {
            if (number % i == 0) {
                return i;
            }
        }
        return 1;
    }
}

