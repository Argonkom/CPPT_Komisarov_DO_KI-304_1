import java.io.*;
import java.util.*;

/**
 * Клас Lab1 реалізує роботу програми до лабораторної роботи №1
 * Реалізує програму для генерації квадратної матриці із заштрихованою областю (згідно з варіантом).
 */
public class Lab1KomisarovKI_304 {
    /**
     * Головний метод Lab1KomisarovKI_304 є точкою входу в програму
     *
     * @param args Shows how long matrix we have to do
     * @throws FileNotFoundException If file cannot be created
     */
    public static void main(String[] args) throws FileNotFoundException {
        int nRows;
        char[][] arr;
        String filler;
        Scanner in = new Scanner(System.in);
        File dataFile = new File("MyFile.txt");// Сюди зберігаємо
        PrintWriter fout = new PrintWriter(dataFile);

        System.out.print("Введіть розмір квадратної матриці: ");
        nRows = in.nextInt();
        in.nextLine();

        arr = new char[nRows][nRows];

        System.out.print("\nВведіть символ-заповнювач: ");
        filler = in.nextLine();

        if (filler.isEmpty()) {
            System.out.println("Не введено символ заповнювач");
            return;
        }
        if (filler.length() > 1) {
            System.out.println("Забагато символів заповнювачів");
            return;
        }

        char symbol = filler.charAt(0);

        for (int i = 0; i < nRows; i++) {
            for (int j = 0; j < nRows; j++) {
                if (j <= nRows - i - 1) {
                    arr[i][j] = symbol;
                } else {
                    arr[i][j] = ' ';
                }
                System.out.print(arr[i][j] + " ");
                fout.print(arr[i][j] + " ");
            }
            System.out.println();
            fout.println();
        }

        fout.flush();
        fout.close();
    }
}
