package ua.edu.chmnu.fks.oop.lab05;

public class Lab05 {

    private static final int MAX_NUMBER = 100;
    private static final int MIN_NUMBER = 10;

    private static boolean isPalindrome(int number) {
        int result = 0;
        int n = number;
        while (n > 0) {
            int digit = n % 10;
            result = result * 10 + digit;
            n /= 10;
        }
        return result == number;
    }

    public static int getBiggestPalindrome() {
        int biggest = -1;

        for (int i = MAX_NUMBER; i >= MIN_NUMBER; i--) {
            // если квадрат первого числа меньше уже найденного палиндрома
            // искать дальше не имеет смысла
            // так как числа будут становиться только меньше
            if (i * i < biggest) {
                break;
            }


            // второе число можно начинать перебирать начиная с первого
            for (int j = i; j >= MIN_NUMBER; j--) {
                int product = j * i;
                // если произведение меньше уже найденного палиндрома,
                // перебирать второе число дальше не имеет смысла,
                // так как числа будут становиться только меньше
                if (product < biggest) {
                    break;
                }
                if (isPalindrome(product)) {
                    biggest = product;
                }
            }
        }
        return biggest;
    }

    public static void main(String[] args) {
        System.out.println(getBiggestPalindrome());
    }
}

