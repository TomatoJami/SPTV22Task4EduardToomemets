package sptv22task4eduardtoomemets;
import java.util.Random;
import java.util.Arrays;


public class SPTV22Task4EduardToomemets {


    public static void main(String[] args) {
        int[] array = new int[100];
        Random random = new Random();
        System.out.println("Неотсортированный массив:");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50) * 2 + 1;
            System.out.printf("%3d", array[i]);
            if ((i+1) % 10 == 0) {
                System.out.println();
            }
        }
        
        System.out.println("Отсортированный массив:");
        
        int sum = 0;
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            System.out.printf("%3d", array[i]);
            if ((i+1) % 10 == 0) {
                System.out.println();
            }
        }
        
        int averageNumber = sum / array.length;
        System.out.println("Среднее арифметичесое число массива: " + averageNumber);
    }
}
    
