package Test;

import java.util.HashMap;
import java.util.Scanner;

import Basic_java.Bai17_char.Char;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] a = s.split(" ");
        String res = "";
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
    }
}
