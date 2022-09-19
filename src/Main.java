import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int element : arr) {
            sum += element;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");

        System.out.println("Задание 2");
        int [] spent={31,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,1};
        int max = 2;
        int min = 1000000;
        for (int i = 0; i < spent.length; i++) {
            final int current = spent[i];
            if (current > max) {
                max = current;
            }
        }
        for (int i = 0; i < spent.length; i++) {
            final int current = spent[i];
            if (current < min) {
                min = current;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min+ " рублей.");
        System.out.println("Максимальная сумма трат за день составила " + max+ " рублей.");

        System.out.println("Задание 3");
        int [] bspent={31,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,58,19,20,21,22,23,24,25,26,27,28,29,30,1};
        int bsum=0;
        int average=0;
        for (int element : bspent) {
            bsum += element;
        }
        average=bsum/31;
        System.out.println("Средняя сумма трат за месяц составила " + average+ " рублей.");

        System.out.println("Задание 4");
        char [] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        //Arrays.sort(reverseFullName, Collections.reverseOrder());
        for (int index=10; index>=0; index=index-1) {
           char revers=reverseFullName[index];
            System.out.println(revers);
       }
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}