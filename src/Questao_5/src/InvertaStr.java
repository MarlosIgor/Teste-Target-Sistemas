package Questao_5.src;

import java.util.Scanner;

public class InvertaStr {
    public static String rev(String str)
    {
        if (str == null || str.equals("")) {
            return str;
        }
        int n = str.length();

        char[] temp = new char[n];

        for (int i = 0; i < n; i++) {
            temp[n - i - 1] = str.charAt(i);
        }
        return String.copyValueOf(temp);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String in = input.nextLine();

        in = rev(in);

        System.out.println(in);
    }
}
