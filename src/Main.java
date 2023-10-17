import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        System.out.println("\n");

        char start = 'A';
        char end = 'Z';
        char saveLetter;
        for (char letter = start; letter <= end; letter++) {
            saveLetter = Character.toUpperCase(letter);
            System.out.print(saveLetter + " ");
        }
        System.out.println("\n");

        for (int i = 1; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("\n");

        for (int i = 1; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        System.out.println("\n");

        Scanner in = new Scanner(System.in);
        int sum = 0;//змінна для обчислення суми чисел
        int inputNumber = 999;
        while (inputNumber != 0) {
            System.out.println("Enter number: ");
            inputNumber = in.nextInt();
            sum += inputNumber;
        }
        System.out.println("Result: " + sum);
        System.out.println("\n");

        String inputName;
        while (true) {
            System.out.println("What's your name?" + "\nMy name is ");
            inputName = in.nextLine();
            System.out.println("Hello " + inputName);
            if (inputName.equals("exit")) {
                break;
            }
        }
        System.out.println("\n");

        Random random = new Random();
        int randNumber;
        do {
            randNumber = random.nextInt(100) + 1;
            System.out.println(randNumber);
        } while (randNumber != 50);
        System.out.println("\n");

        String inputPassword;
        final String password = "MyPassword";
        do {
            System.out.println("Enter password");
            inputPassword = in.nextLine();
        } while (!inputPassword.equals(password));
        System.out.println("\n");

        String[] colors = {"Blue", "Red", "Green", "Violet", "Purple", "Black"};
        for (String color : colors) {
            System.out.println(color);
        }
        System.out.println("\n");

        System.out.print("Enter line: ");
        String inputString = in.nextLine();
        int count = 0; // Змінна для підрахунку кількості символів
        for (char character : inputString.toCharArray()) {
            System.out.println("Symbol: " + character);
            count++;
        }
        System.out.println("Number of symbols in the line: " + count);
        System.out.println("\n");

        int size;
        System.out.println("Enter size of array: ");
        size = in.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(1000);
            System.out.println("arr[ " + i + " ] = " + array[i]);
        }
        int min = array[0];
        int max = array[0];
        for (int i = 1; i < size; i++) {
            if (min > array[i]) {
                min = array[i];
            }
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println("Minimum element in an array" + min);
        System.out.println("Maximum element in an array" + max);
        System.out.println("\n");

        int temp;//поточний елемент
        for (int i = 0; i < size / 2; i++) {
            temp = array[i];
            array[i] = array[size - i - 1];
            array[size - i - 1] = temp;
        }
        for (int i = 0; i < size; i++) {
            System.out.println("arr[ " + i + " ] = " + array[i]);
        }

        int[] arr1 = {1, 100, 24, 12, -55};
        int[] arr2 = {33, 22, 999, 12, 88};
        int sumSize = arr1.length + arr2.length;
        int[] sumArray = new int[sumSize];
        for (int i = 0; i < arr1.length; i++) {
            sumArray[i] = arr1[i];
        }
        for (int j = 0; j < arr2.length; j++) {
            sumArray[arr1.length - 1 + j] = arr2[j];
        }
        for (int i = 0; i < sumSize - 1; i++) {
            for (int j = 0; j < sumSize - i - 1; j++) {
                if (sumArray[j] > sumArray[j + 1]) {
                    // Обмін значень, якщо поточний елемент більший за наступний
                    temp = sumArray[j];
                    sumArray[j] = sumArray[j + 1];
                    sumArray[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < sumSize; i++) {
            System.out.println("sumArray[ " + i + " ] = " + sumArray[i]);
        }
        in.close();
    }
}