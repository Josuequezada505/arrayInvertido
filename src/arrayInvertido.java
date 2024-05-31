import java.util.Scanner;
import java.util.InputMismatchException;

public class arrayInvertido {

    public static void main(String[] args) {
        try {
            int[] array = fillArray();
            int[] invertedArray = reverseArray(array);
            System.out.println("Array invertido:");
            for (int num : invertedArray) {
                System.out.print(num + " ");
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: Entrada no válida. Por favor, ingrese solo números enteros.");
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
        }
    }

    // Método para llenar el array con validación de excepciones
    public static int[] fillArray() throws InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Ingrese los elementos del array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    // Método para invertir el array
    public static int[] reverseArray(int[] array) {
        int[] invertedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            invertedArray[i] = array[array.length - 1 - i];
        }
        return invertedArray;
    }
}