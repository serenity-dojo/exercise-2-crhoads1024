package com.serenitydojo.datatypes;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class WhenWorkingWithFloatingPointNumbers {

    //
    // Exercise 1: Convert 27 degrees Celcius to Farenheit
    // The equation is: farenheit = (9 / 5) * celcius + 32
    //
    @Test
    public void convertToFarenheit() {
        double celcius = 27.0d;
        double farenheit = 0.0d;
        double farenheitInput = 80.6d;

        // TODO: Use a floating point calculation to calculate the farenheit equivalent of the celcius value.

        double farenheitDividend = (9.0 / 5.0) ;
        double celsiusMultiplier = farenheitDividend * celcius + 32;
        double farenheitResult = celsiusMultiplier;

        farenheit = farenheitResult;
        System.out.println("Farenheit Value: " + farenheit);
        
        assertThat(farenheit, equalTo(80.6));
    }

    //
    // Exercise 2: Convert kilograms to pounds
    // There are 2.20462 pounds in a kilogram
    //
    @Test
    public void convertKilogramsToPounds() {
        int weightInKilograms = 50;
        double weightInPounds = 0;
        double kiloInPounds = 2.20462;

        // TODO: Use a floating point calculation to calculate the correct weight in pounds

        double kiloConvertedToPounds = weightInKilograms * kiloInPounds;

        weightInPounds = kiloConvertedToPounds;
        System.out.println("Weight in Pounds: " + weightInPounds);
        assertThat(weightInPounds, equalTo(110.231));

    }
}
