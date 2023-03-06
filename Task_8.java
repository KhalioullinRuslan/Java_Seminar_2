import java.util.Scanner;

// Дано четное число N (>0) и символы c1 и c2. Написать метод, который 
// вернет строку длины N, которая состоит из чередующихся символов c1 и c2, начиная с c1.

public class Task_8 {
    public static void main(String[] args) {
        System.out.print("Введите число: ");
        Scanner in = new Scanner(System.in, "Cp866");
        int n = in.nextInt();
    
        System.out.print("Введите символ 1: ");
        char s1 = in.next().charAt(0);
        
        System.out.print("Введите символ 2: ");
        char s2 = in.next().charAt(0);

        System.out.print(twoChar(n, s1, s2));

        in.close();
    }

    public static String twoChar(int n, char s1, char s2) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n / 2; i++) {
            result.append(s1).append(s2);
        }

        return result.toString();
    }
}