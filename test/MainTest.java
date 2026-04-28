import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Массив өлшемін енгізу
        System.out.print("Элементтер санын енгізіңіз: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Массив элементтерін енгізу
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + "-элементті енгізіңіз: ");
            arr[i] = sc.nextInt();
        }

        // Жұп сандарды санау
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }

        // Нәтиже
        System.out.println("Жұп сандар саны: " + count);
    }
}
