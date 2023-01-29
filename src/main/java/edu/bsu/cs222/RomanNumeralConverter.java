package edu.bsu.cs222;

public class RomanNumeralConverter {
    private String romanNumeral = "";
    public String convertThousandsToRomanNumeral(int numberToConvert) {
        if(numberToConvert==3000||numberToConvert>=2900){
            romanNumeral=romanNumeral+"MMM";
        }else if(numberToConvert>=2000&&numberToConvert<2900){
            romanNumeral=romanNumeral+"MM";
        }else if(numberToConvert>=1000&&numberToConvert<1900){
            romanNumeral=romanNumeral+"M";
        }
        return romanNumeral;
    }

/*    public String convertFollowingSubtractionRules(int numberToConvert){

    }*/
}
