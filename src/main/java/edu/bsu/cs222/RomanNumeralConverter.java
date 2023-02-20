package edu.bsu.cs222;
import java.util.Scanner;
public class RomanNumeralConverter {
    public static void main(String[] args) {
        System.out.println("__".repeat(20));
        System.out.println("~ Roman Numeral Converter ~");
        System.out.println("Please enter a whole number: ");
        System.out.println("__".repeat(20));
        Scanner scanner = new Scanner(System.in);
        Converter converter = new Converter(Integer.parseInt(scanner.next()));
        System.out.println(converter.getRomanNumeralResult());
        System.out.println("__".repeat(20));
    }
}
