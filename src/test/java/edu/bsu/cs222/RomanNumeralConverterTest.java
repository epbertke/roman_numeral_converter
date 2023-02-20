package edu.bsu.cs222;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanNumeralConverterTest {

    @Test
    public void testConvert10ToRomanNumeral(){
        Converter converter = new Converter(10);
        Assertions.assertEquals("X", converter.getRomanNumeralResult());
    }
    @Test
    public void testConvert8ToRomanNumeral(){
        Converter converter = new Converter(8);
        Assertions.assertEquals("VIII", converter.getRomanNumeralResult());
    }
    @Test
    public void testConvert99ToRomanNumeral(){
        Converter converter = new Converter(99);
        Assertions.assertEquals("XCIX", converter.getRomanNumeralResult());
    }
    @Test
    public void testConvert400ToRomanNumeral(){
        Converter converter = new Converter(400);
        Assertions.assertEquals("CD", converter.getRomanNumeralResult());
    }
    @Test
    public void testConvert999ToRomanNumeral(){
        Converter converter = new Converter(999);
        Assertions.assertEquals("CMXCIX", converter.getRomanNumeralResult());
    }
    @Test
    public void testConvert901ToRomanNumeral(){
        Converter converter = new Converter(901);
        Assertions.assertEquals("CMI", converter.getRomanNumeralResult());
    }
    @Test
    public void testConvert20ToRomanNumeral(){
        Converter converter = new Converter(20);
        Assertions.assertEquals("XX", converter.getRomanNumeralResult());
    }
    @Test
    public void testConvert30ToRomanNumeral(){
        Converter converter = new Converter(30);
        Assertions.assertEquals("XXX", converter.getRomanNumeralResult());
    }
    @Test
    public void testConvert32ToRomanNumeral(){
        Converter converter = new Converter(32);
        Assertions.assertEquals("XXXII", converter.getRomanNumeralResult());
    }
    @Test
    public void testConvert300ToRomanNumeral(){
        Converter converter = new Converter(300);
        Assertions.assertEquals("CCC", converter.getRomanNumeralResult());
    }
    @Test
    public void testConvert327ToRomanNumeral(){
        Converter converter = new Converter(327);
        Assertions.assertEquals("CCCXXVII", converter.getRomanNumeralResult());
    }
    @Test
    public void testConvert950ToRomanNumeral(){
        Converter converter = new Converter(950);
        Assertions.assertEquals("CML", converter.getRomanNumeralResult());
    }
    @Test
    public void testConvert3000ToRomanNumeral(){
        Converter converter = new Converter(3000);
        Assertions.assertEquals("MMM", converter.getRomanNumeralResult());
    }
    @Test
    public void testConvert2000ToRomanNumeral(){
        Converter converter = new Converter(2000);
        Assertions.assertEquals("MM", converter.getRomanNumeralResult());
    }
    @Test
    public void testConvert0GivesNothing(){
        Converter converter = new Converter(0);
        Assertions.assertEquals("", converter.getRomanNumeralResult());
    }
    @Test
    public void testConvert1900ToRomanNumeral(){
        Converter converter = new Converter(1900);
        Assertions.assertEquals("MCM", converter.getRomanNumeralResult());
    }
    @Test
    public void testConvert2300ToRomanNumeral(){
        Converter converter = new Converter(2300);
        Assertions.assertEquals("MMCCC", converter.getRomanNumeralResult());
    }
    @Test
    public void test4000IsOutOfBounds(){
        Converter converter = new Converter(4000);
        Assertions.assertEquals("Converter cannot work on this number", converter.getRomanNumeralResult());
    }
}
