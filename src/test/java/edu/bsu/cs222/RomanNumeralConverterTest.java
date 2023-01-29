package edu.bsu.cs222;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanNumeralConverterTest {

    @Test
    public void testConvert10ToRomanNumeral(){
        RomanNumeralConverter converter = new RomanNumeralConverter();
        String result = converter.convertSingleNumeral(10);
        Assertions.assertEquals("X", result);
    }
    @Test
    public void testConvert8ToRomanNumeral(){
        RomanNumeralConverter converter = new RomanNumeralConverter();
        String result = converter.convertOnesPlaceToRomanNumerals(8);
        Assertions.assertEquals("VIII", result);
    }
    @Test
    public void testConvert99ToRomanNumeral(){
        RomanNumeralConverter converter = new RomanNumeralConverter();
        String result = converter.convertTensPlaceToRomanNumerals(99);
        Assertions.assertEquals("XCIX", result);
    }
    @Test
    public void testConvert400ToRomanNumeral(){
        RomanNumeralConverter converter = new RomanNumeralConverter();
        String result = converter.convertHundredsPlaceToRomanNumerals(400);
        Assertions.assertEquals("CD", result);
    }
    @Test
    public void testConvert999ToRomanNumeral(){
        RomanNumeralConverter converter = new RomanNumeralConverter();
        String result = converter.convertHundredsPlaceToRomanNumerals(999);
        Assertions.assertEquals("CMXCIX", result);
    }
    @Test
    public void testConvert901ToRomanNumeral(){
        RomanNumeralConverter converter = new RomanNumeralConverter();
        String result = converter.convertHundredsPlaceToRomanNumerals(901);
        Assertions.assertEquals("CMI", result);
    }
    @Test
    public void testConvert10ToRomanNumeralWithMainMethod(){
        RomanNumeralConverter converter = new RomanNumeralConverter();
        String result = converter.convertSingleNumeral(10);
        Assertions.assertEquals("X", result);
    }
    @Test
    public void testConvert8ToRomanNumeralWithMainMethod(){
        RomanNumeralConverter converter = new RomanNumeralConverter();
        String result = converter.convertOnesPlaceToRomanNumerals(8);
        Assertions.assertEquals("VIII", result);
    }
    @Test
    public void testConvert99ToRomanNumeralWithMainMethod(){
        RomanNumeralConverter converter = new RomanNumeralConverter();
        String result = converter.convertIntToRomanNumeral(99);
        Assertions.assertEquals("XCIX", result);
    }
    @Test
    public void testConvert400ToRomanNumeralWithMainMethod(){
        RomanNumeralConverter converter = new RomanNumeralConverter();
        String result = converter.convertIntToRomanNumeral(400);
        Assertions.assertEquals("CD", result);
    }
    @Test
    public void testConvert999ToRomanNumeralWithMainMethod(){
        RomanNumeralConverter converter = new RomanNumeralConverter();
        String result = converter.convertIntToRomanNumeral(999);
        Assertions.assertEquals("CMXCIX", result);
    }
    @Test
    public void testConvert901ToRomanNumeralWithMainMethod(){
        RomanNumeralConverter converter = new RomanNumeralConverter();
        String result = converter.convertIntToRomanNumeral(901);
        Assertions.assertEquals("CMI", result);
    }
    @Test
    public void testConvert3000ToRomanNumeral(){
        RomanNumeralConverter converter = new RomanNumeralConverter();
        String result = converter.convertIntToRomanNumeral(3000);
        Assertions.assertEquals("MMM", result);
    }
    @Test
    public void testConvert2000ToRomanNumeral(){
        RomanNumeralConverter converter = new RomanNumeralConverter();
        String result = converter.convertIntToRomanNumeral(2000);
        Assertions.assertEquals("MM", result);
    }
    @Test
    public void testConvert0GivesNothing(){
        RomanNumeralConverter converter = new RomanNumeralConverter();
        String result = converter.convertIntToRomanNumeral(0);
        Assertions.assertEquals("", result);
    }
    @Test
    public void testConvert1900ToRomanNumeral(){
        RomanNumeralConverter converter = new RomanNumeralConverter();
        String result = converter.convertIntToRomanNumeral(1900);
        Assertions.assertEquals("MCM", result);
    }
    @Test
    public void testConvert2300ToRomanNumeral(){
        RomanNumeralConverter converter = new RomanNumeralConverter();
        String result = converter.convertIntToRomanNumeral(2300);
        Assertions.assertEquals("MMCCC", result);
    }
}
