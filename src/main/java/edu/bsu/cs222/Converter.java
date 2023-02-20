package edu.bsu.cs222;
public class Converter {
    private final String RomanNumeralResult;
    final String outOfBounds = "Converter cannot work on this number";
    public Converter(int numberToConvert) {
        this.RomanNumeralResult = convertIntToRomanNumeral(numberToConvert);
    }

    public String convertIntToRomanNumeral(int numberToConvert) {
        RomanNumeral oneDigitRomanNumeral = new RomanNumeral();
        String convertedRomanNumeral = "";
        int[] romanNumerals = {1, 5, 10, 50, 100, 500, 1000};
        for(int checkIndex = 0; checkIndex<=6; checkIndex++){
            if (romanNumerals[checkIndex]==numberToConvert){
                return oneDigitRomanNumeral.convertSingleNumeral(numberToConvert);
            }
        }
        DecimalPlaceConverter placeConverter = new DecimalPlaceConverter();
        if(numberToConvert>3000||numberToConvert<0) {
            return outOfBounds;
        }else  if(numberToConvert>=2&&numberToConvert<=9){
            return placeConverter.convertOnesPlaceToRomanNumerals(numberToConvert);
        }else if(numberToConvert>=11&&numberToConvert<=99){
            return placeConverter.convertTensPlaceToRomanNumerals(numberToConvert);
        }else if(numberToConvert>=101&&numberToConvert<=999){
            return placeConverter.convertHundredsPlaceToRomanNumerals(numberToConvert);
        }else if(numberToConvert>1000){
            return placeConverter.convertThousandsPlaceToRomanNumeral(numberToConvert);
        }return convertedRomanNumeral;
    }
    public String getRomanNumeralResult() {
        return RomanNumeralResult;
    }
}
