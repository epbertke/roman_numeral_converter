package edu.bsu.cs222;


public class RomanNumeralConverter {
    final String outOfBounds = "Converter cannot work on this number";

    //full(main) roman numeral converter
    public String convertIntToRomanNumeral(int numberToConvert) {
        String convertedRomanNumeral = "";
        int[] romanNumerals = {1, 5, 10, 50, 100, 500, 1000};
        for(int checkIndex = 0; checkIndex<=6; checkIndex++){
            if (romanNumerals[checkIndex]==numberToConvert){
                convertedRomanNumeral=convertSingleNumeral(numberToConvert);
                return convertedRomanNumeral;
            }
        }
        if(numberToConvert>3000||numberToConvert<0) {
            return outOfBounds;
        }else  if(numberToConvert>=2&&numberToConvert<=9){
            convertedRomanNumeral=convertOnesPlaceToRomanNumerals(numberToConvert);
        }else if(numberToConvert>=11&&numberToConvert<=99){
            convertedRomanNumeral = convertTensPlaceToRomanNumerals(numberToConvert);
        }else if(numberToConvert>=101&&numberToConvert<=999){
            convertedRomanNumeral = convertHundredsPlaceToRomanNumerals(numberToConvert);
        } return convertedRomanNumeral;
    }
    public String convertSingleNumeral(int numberToConvert){
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
    public String convertOnesPlaceToRomanNumerals(int numberToConvert){
        String onesNumeral = "";
        if(numberToConvert>=1&&numberToConvert<=3){
            onesNumeral= "I".repeat(numberToConvert);
        }else if(numberToConvert==4){
            onesNumeral= "IV";
        } else if (numberToConvert > 5&&numberToConvert<9) {
            onesNumeral= "V"+"I".repeat(numberToConvert-5);
        }else if(numberToConvert==9){
            onesNumeral="IX";
        }return onesNumeral;
    }
    public String convertTensPlaceToRomanNumerals(int numberToConvert){
        String tensNumeral = "";
        int onesToConvert = (numberToConvert%10);
        int tensToConvert = numberToConvert - onesToConvert;
        int count = numberToConvert/10;
        if(tensToConvert>=11&&tensToConvert<=30){
            tensNumeral = "X".repeat(count);
        }else if(tensToConvert==40){
            tensNumeral="XL";
        }else if(tensToConvert>=50&&tensToConvert<=89){
            tensNumeral="L"+"X".repeat(count-5);
        }else if(tensToConvert==90){
            tensNumeral="XC";
        }return tensNumeral+convertOnesPlaceToRomanNumerals(onesToConvert);
    }
    public String convertHundredsPlaceToRomanNumerals(int numberToConvert){
        String hundredsNumeral = "";
        int count = numberToConvert/100;
        int tensToConvert = (numberToConvert%100);
        int hundredsToConvert = numberToConvert-tensToConvert;
        if(hundredsToConvert>=100&&hundredsToConvert<400){
            hundredsNumeral = "C".repeat(count);
        }else if(hundredsToConvert==400){
            hundredsNumeral="CD";
        }else if(hundredsToConvert>=500&&hundredsToConvert<900){
            hundredsNumeral="D"+"C".repeat(count-5);
        }else if(hundredsToConvert==900){
            hundredsNumeral="CM";
        }return hundredsNumeral+convertTensPlaceToRomanNumerals(tensToConvert);
    }
/*    public String convertThousandsPlaceToRomanNumeral(int numberToConvert) {
        String thousandsNumeral = "";
        if(numberToConvert==3000){
            thousandsNumeral=thousandsNumeral+"MMM";
        }else if(numberToConvert>=2000&&numberToConvert<3000){
            thousandsNumeral=thousandsNumeral+"MM";
        }else if(numberToConvert>=1000&&numberToConvert<2000){
            thousandsNumeral=thousandsNumeral+"M";
        }return thousandsNumeral;
    }*/


}
