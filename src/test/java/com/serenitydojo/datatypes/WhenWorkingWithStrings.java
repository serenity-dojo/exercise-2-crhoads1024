package com.serenitydojo.datatypes;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class WhenWorkingWithStrings {

    @Test
    public void convertToLowerCase() {
        String bookTitle = "The Cat In The Hat";

        
        // TODO: Convert the book title to lower case and assign it to the lowerCaseTitle variable
        String lowerCaseBookTitle = bookTitle.toLowerCase();

        String lowerCaseTitle = lowerCaseBookTitle;
        assertThat(lowerCaseTitle, equalTo("the cat in the hat"));

    }

    @Test
    public void convertToUpperCase() {
        String bookTitle = "The Cat In The Hat";

       
        // TODO: Convert the book title to upper case and assign it to the lowerCaseTitle variable
        String upperCaseTitle = bookTitle.toUpperCase();
                
        assertThat(upperCaseTitle, equalTo("THE CAT IN THE HAT"));
    }

    @Test
    public void trimExtraSpaces() {
        String bookTitle = "  The Cat In The Hat    ";

        String trimmedTitle = bookTitle.trim();
        // TODO: Trim the spaces before and after the title text

        System.out.println("'Trimmed Title ='" + trimmedTitle + "'");

        assertThat(trimmedTitle, equalTo("The Cat In The Hat"));
    }

    @Test
    public void findTheLengthOfAString() {
        String bookTitle = "The Cat In The Hat";

        int length = 0;
        // TODO: Find the number of characters in the string
        int stringLength = bookTitle.length();
        length = stringLength;
        assertThat(length, equalTo(18));
    }

    @Test
    public void replacingAText() {
        String bookTitle = "The Cat In The Hat";

        String updatedTitle = "";
        // TODO: Replace the word "Cat" with "Dog
        
        updatedTitle = bookTitle.replace( "Cat", "Dog");
        
        assertThat(updatedTitle, equalTo("The Dog In The Hat"));
    }
}
