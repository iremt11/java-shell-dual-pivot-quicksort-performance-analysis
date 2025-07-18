import java.util.Scanner;
import java.util.Random;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sort sortingClass = new Sort();
        System.out.println("1-Equal Integers\n2-Decreasing Integers\n3-Increasing Integers\n4-Random Integers");
        System.out.println("Your choice: ");

        while(true) {
            while(!sc.hasNextInt()) {
                System.out.println("ERROR!! Please enter a valid integer.");
                sc.next();
            }

            int number = sc.nextInt();
            if (number >= 1 && number <= 4) {
                System.out.println("Choose 1.000(a),10.000(b),100.000(c): ");
                long startTime;
                long endTime;
                int[] array1;
                int[] array2;
                
                switch (sc.next()) {
                    case "a":
                        if (number == 1) {
                            array1 = sortingClass.equal(1000);
                            startTime = System.nanoTime();
                            sortingClass.shellSort(array1);
                            endTime = System.nanoTime();
                            System.out.println("Shell Sort Equal 1.000: " + (double)(endTime - startTime) / 1000000.0 + " ms");
                            
                            array2 = sortingClass.equal(1000);
                            startTime = System.nanoTime();
                            sortingClass.dualPivotQuickSort(array2, 0, array2.length - 1);
                            endTime = System.nanoTime();
                            System.out.println("Dual Pivot Quick Sort Equal 1.000: " + (double)(endTime - startTime) / 1000000.0 + " ms");
                        } else if (number == 2) {
                            array1 = sortingClass.decreasing(1000);
                            startTime = System.nanoTime();
                            sortingClass.shellSort(array1);
                            endTime = System.nanoTime();
                            System.out.println("Shell Sort Decreasing 1.000: " + (double)(endTime - startTime) / 1000000.0 + " ms");
                            
                            array2 = sortingClass.decreasing(1000);
                            startTime = System.nanoTime();
                            sortingClass.dualPivotQuickSort(array2, 0, array2.length - 1);
                            endTime = System.nanoTime();
                            System.out.println("Dual Pivot Quick Sort Decreasing 1.000: " + (double)(endTime - startTime) / 1000000.0 + " ms");
                        } else if (number == 3) {
                            array1 = sortingClass.increasing(1000);
                            startTime = System.nanoTime();
                            sortingClass.shellSort(array1);
                            endTime = System.nanoTime();
                            System.out.println("Shell Sort Increasing 1.000: " + (double)(endTime - startTime) / 1000000.0 + " ms");
                            
                            array2 = sortingClass.increasing(1000);
                            startTime = System.nanoTime();
                            sortingClass.dualPivotQuickSort(array2, 0, array2.length - 1);
                            endTime = System.nanoTime();
                            System.out.println("Dual Pivot Quick Sort Increasing 1.000: " + (double)(endTime - startTime) / 1000000.0 + " ms");
                        } else {
                            array1 = sortingClass.random(1000);
                            startTime = System.nanoTime();
                            sortingClass.shellSort(array1);
                            endTime = System.nanoTime();
                            System.out.println("Shell Sort Random 1.000: " + (double)(endTime - startTime) / 1000000.0 + " ms");
                            
                            array2 = sortingClass.random(1000);
                            startTime = System.nanoTime();
                            sortingClass.dualPivotQuickSort(array2, 0, array2.length - 1);
                            endTime = System.nanoTime();
                            System.out.println("Dual Pivot Quick Sort Random 1.000: " + (double)(endTime - startTime) / 1000000.0 + " ms");
                        }
                        break;
                    case "b":
                        if (number == 1) {
                            array1 = sortingClass.equal(10000);
                            startTime = System.nanoTime();
                            sortingClass.shellSort(array1);
                            endTime = System.nanoTime();
                            System.out.println("Shell Sort Equal 10.000: " + (double)(endTime - startTime) / 1000000.0 + " ms");
                            
                            array2 = sortingClass.equal(10000);
                            startTime = System.nanoTime();
                            sortingClass.dualPivotQuickSort(array2, 0, array2.length - 1);
                            endTime = System.nanoTime();
                            System.out.println("Dual Pivot Quick Sort Equal 10.000: " + (double)(endTime - startTime) / 1000000.0 + " ms");
                        } else if (number == 2) {
                            array1 = sortingClass.decreasing(10000);
                            startTime = System.nanoTime();
                            sortingClass.shellSort(array1);
                            endTime = System.nanoTime();
                            System.out.println("Shell Sort Decreasing 10.000: " + (double)(endTime - startTime) / 1000000.0 + " ms");
                            
                            array2 = sortingClass.decreasing(10000);
                            startTime = System.nanoTime();
                            sortingClass.dualPivotQuickSort(array2, 0, array2.length - 1);
                            endTime = System.nanoTime();
                            System.out.println("Dual Pivot Quick Sort Decreasing 10.000: " + (double)(endTime - startTime) / 1000000.0 + " ms");
                        } else if (number == 3) {
                            array1 = sortingClass.increasing(10000);
                            startTime = System.nanoTime();
                            sortingClass.shellSort(array1);
                            endTime = System.nanoTime();
                            System.out.println("Shell Sort Increasing 10.000: " + (double)(endTime - startTime) / 1000000.0 + " ms");
                            
                            array2 = sortingClass.increasing(10000);
                            startTime = System.nanoTime();
                            sortingClass.dualPivotQuickSort(array2, 0, array2.length - 1);
                            endTime = System.nanoTime();
                            System.out.println("Dual Pivot Quick Sort Increasing 10.000: " + (double)(endTime - startTime) / 1000000.0 + " ms");
                        } else {
                            array1 = sortingClass.random(10000);
                            startTime = System.nanoTime();
                            sortingClass.shellSort(array1);
                            endTime = System.nanoTime();
                            System.out.println("Shell Sort Random 10.000: " + (double)(endTime - startTime) / 1000000.0 + " ms");
                            
                            array2 = sortingClass.random(10000);
                            startTime = System.nanoTime();
                            sortingClass.dualPivotQuickSort(array2, 0, array2.length - 1);
                            endTime = System.nanoTime();
                            System.out.println("Dual Pivot Quick Sort Random 10.000: " + (double)(endTime - startTime) / 1000000.0 + " ms");
                        }
                        break;
                    case "c":
                        if (number == 1) {
                            array1 = sortingClass.equal(100000);
                            startTime = System.nanoTime();
                            sortingClass.shellSort(array1);
                            endTime = System.nanoTime();
                            System.out.println("Shell Sort Equal 100.000: " + (double)(endTime - startTime) / 1000000.0 + " ms");
                            
                            array2 = sortingClass.equal(100000);
                            startTime = System.nanoTime();
                            sortingClass.dualPivotQuickSort(array2, 0, array2.length - 1);
                            endTime = System.nanoTime();
                            System.out.println("Dual Pivot Quick Sort Equal 100.000: " + (double)(endTime - startTime) / 1000000.0 + " ms");
                        } else if (number == 2) {
                            array1 = sortingClass.decreasing(100000);
                            startTime = System.nanoTime();
                            sortingClass.shellSort(array1);
                            endTime = System.nanoTime();
                            System.out.println("Shell Sort Decreasing 100.000: " + (double)(endTime - startTime) / 1000000.0 + " ms");
                            
                            array2 = sortingClass.decreasing(100000);
                            startTime = System.nanoTime();
                            sortingClass.dualPivotQuickSort(array2, 0, array2.length - 1);
                            endTime = System.nanoTime();
                            System.out.println("Dual Pivot Quick Sort Decreasing 100.000: " + (double)(endTime - startTime) / 1000000.0 + " ms");
                        } else if (number == 3) {
                            array1 = sortingClass.increasing(100000);
                            startTime = System.nanoTime();
                            sortingClass.shellSort(array1);
                            endTime = System.nanoTime();
                            System.out.println("Shell Sort Increasing 100.000: " + (double)(endTime - startTime) / 1000000.0 + " ms");
                            
                            array2 = sortingClass.increasing(100000);
                            startTime = System.nanoTime();
                            sortingClass.dualPivotQuickSort(array2, 0, array2.length - 1);
                            endTime = System.nanoTime();
                            System.out.println("Dual Pivot Quick Sort Increasing 100.000: " + (double)(endTime - startTime) / 1000000.0 + " ms");
                        } else {
                            array1 = sortingClass.random(100000);
                            startTime = System.nanoTime();
                            sortingClass.shellSort(array1);
                            endTime = System.nanoTime();
                            System.out.println("Shell Sort Random 100.000: " + (double)(endTime - startTime) / 1000000.0 + " ms");
                            
                            array2 = sortingClass.random(100000);
                            startTime = System.nanoTime();
                            sortingClass.dualPivotQuickSort(array2, 0, array2.length - 1);
                            endTime = System.nanoTime();
                            System.out.println("Dual Pivot Quick Sort Random 100.000: " + (double)(endTime - startTime) / 1000000.0 + " ms");
                        }
                }
                return;
            }
            System.out.println("ERROR!! Please make the right choice (1-4)");
        }
    }
}