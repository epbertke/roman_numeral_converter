package edu.bsu.cs222;
public class DecimalPlaceConverter {
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
    public String convertThousandsPlaceToRomanNumeral(int numberToConvert) {
        String thousandsNumeral = "";
        int hundredsToConvert = numberToConvert%1000;
        if(numberToConvert==3000){
            thousandsNumeral=thousandsNumeral+"MMM";
        }else if(numberToConvert>=2000&&numberToConvert<3000){
            thousandsNumeral=thousandsNumeral+"MM";
        }else if(numberToConvert>=1000&&numberToConvert<2000){
            thousandsNumeral=thousandsNumeral+"M";
        }return thousandsNumeral+convertHundredsPlaceToRomanNumerals(hundredsToConvert);
    }
}
