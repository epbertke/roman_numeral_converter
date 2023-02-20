package edu.bsu.cs222;
public class RomanNumeral {
    protected String convertSingleNumeral(int numberToConvert){
        String romanNumeral = "";
        switch (numberToConvert) {
            case 1 -> {
                romanNumeral = "I";
                return romanNumeral;
            }
            case 5 -> {
                romanNumeral = "V";
                return romanNumeral;
            }
            case 10 -> {
                romanNumeral = "X";
                return romanNumeral;
            }
            case 50 -> {
                romanNumeral = "L";
                return romanNumeral;
            }
            case 100 -> {
                romanNumeral = "C";
                return romanNumeral;
            }
            case 500 -> {
                romanNumeral = "D";
                return romanNumeral;
            }
            case 1000 -> {
                romanNumeral = "M";
                return romanNumeral;
            }
        }
        return romanNumeral;
    }
}
