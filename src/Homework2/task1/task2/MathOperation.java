package Homework2.task1.task2;

import java.util.Arrays;

public class MathOperation {
    public static void main(String[] args) {
        int[] array = new int[11];
        array[0] = 36;
        array[1] = 12;
        array[2] = 5;
        array[3] = 14;
        array[4] = 15;
        array[5] = 1;
        array[6] = 71324;
        array[7] = 7144;
        array[8] = 7151;
        array[9] = 716;
        array[10] = 80011;

        sum(array);
        minMax(array);
        maxPositive(array);
        System.out.println("Multiplication of array " + multiplication(array));
        System.out.println("Modulus first and last element is: " + modulus(array));
        secondLargest(array);
    }


    public static void sum(int[] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            result += array[i];

        }
        System.out.println("Sum of element is: " + result);

    }

    public static void minMax(int[] array) {
        int min = array[0];
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) min = array[i];
            if (array[i] > max) max = array[i];
        }
        System.out.println("min value is: " + min);
        System.out.println("max value is: " + max);
    }

    public static void maxPositive(int[] array) {

        int maxPos = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxPos) maxPos = array[i];
            if (maxPos != 0) ;
        }
        System.out.println("max positive value is: " + maxPos);

    }

    public static long multiplication(int[] array) {
        long result = 1;
        for (int i = 0; i < array.length; i++) {
            result = result * array[i];

        }
        return result;

    }

    public static int modulus(int[] array) {
        int mod = array[0] % array[array.length - 1];

        return mod;

    }

    public static void secondLargest(int array[]) {
        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max2 = max;
                max = array[i];
            } else if (array[i] > max2 && array[i] != max) {
                max2 = array[i];
            }
        }
        if (max2 != Integer.MIN_VALUE) {
            System.out.println("The second largest element of array is : " + max2);
        } else {
            System.out.println("the second largest element isn`t exist!");
        }
        System.out.println("The largest element is: " + max);

    }


}

//          int min = Integer.MAX_VALUE;
//        int min2 = Integer.MAX_VALUE;
//        for (int i = 1; i < array.length; i++) {
//            if (array[i] < min) {
//                min2 = min;
//                min = array[i];
//            } else if (array[i] < min2 && array[i] != min) {
//                min2 = array[i];
//            }
//        }
//        if (min2 != Integer.MIN_VALUE) {
//            System.out.println("Второй по минимальности елемент в массиве: " + min2);
//        } else {
//            System.out.println("Второго по минимальности елемента нету");
//        }
//        System.out.println(" Минимальный елемент в массиве: " + min);
//
//
//