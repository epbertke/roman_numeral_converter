package edu.bsu.cs222;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanNumeralConverterTest {
    @Test
    public void convert3000ToRomanNumeral(){
        RomanNumeralConverter converter = new RomanNumeralConverter();
        String result = converter.convertThousandsToRomanNumeral(3000);
        Assertions.assertEquals("MMM", result);
    }
    @Test
    public void convert2000ToRomanNumeral(){
        RomanNumeralConverter converter = new RomanNumeralConverter();
        String result = converter.convertThousandsToRomanNumeral(2000);
        Assertions.assertEquals("MM", result);
    }
    @Test
    public void convert1000ToRomanNumeral(){
        RomanNumeralConverter converter = new RomanNumeralConverter();
        String result = converter.convertThousandsToRomanNumeral(1000);
        Assertions.assertEquals("M", result);
    }

}
