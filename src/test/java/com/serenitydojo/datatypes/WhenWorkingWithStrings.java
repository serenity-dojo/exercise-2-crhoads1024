package com.serenitydojo.datatypes;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class WhenWorkingWithStrings {

    @Test
    public void convertToLowerCase() {
        String bookTitle = "The Cat In The Hat";

<<<<<<< HEAD
        String lowerCaseTitle = "";
        // TODO: Convert the book title to lower case and assign it to the lowerCaseTitle variable

=======
        
        // TODO: Convert the book title to lower case and assign it to the lowerCaseTitle variable
        String lowerCaseBookTitle = bookTitle.toLowerCase();

        String lowerCaseTitle = lowerCaseBookTitle;
>>>>>>> c7202ee (Completed datatypes homework assignments)
        assertThat(lowerCaseTitle, equalTo("the cat in the hat"));

    }

    @Test
    public void convertToUpperCase() {
        String bookTitle = "The Cat In The Hat";

<<<<<<< HEAD
        String upperCaseTitle = "";
        // TODO: Convert the book title to upper case and assign it to the lowerCaseTitle variable

=======
       
        // TODO: Convert the book title to upper case and assign it to the lowerCaseTitle variable
        String upperCaseTitle = bookTitle.toUpperCase();
                
>>>>>>> c7202ee (Completed datatypes homework assignments)
        assertThat(upperCaseTitle, equalTo("THE CAT IN THE HAT"));
    }

    @Test
    public void trimExtraSpaces() {
        String bookTitle = "  The Cat In The Hat    ";

<<<<<<< HEAD
        String trimmedTitle = "";
        // TODO: Trim the spaces before and after the title text

=======
        String trimmedTitle = bookTitle.trim();
        // TODO: Trim the spaces before and after the title text

        System.out.println("'Trimmed Title ='" + trimmedTitle + "'");

>>>>>>> c7202ee (Completed datatypes homework assignments)
        assertThat(trimmedTitle, equalTo("The Cat In The Hat"));
    }

    @Test
    public void findTheLengthOfAString() {
        String bookTitle = "The Cat In The Hat";

        int length = 0;
        // TODO: Find the number of characters in the string
<<<<<<< HEAD

=======
        int stringLength = bookTitle.length();
        length = stringLength;
>>>>>>> c7202ee (Completed datatypes homework assignments)
        assertThat(length, equalTo(18));
    }

    @Test
    public void replacingAText() {
        String bookTitle = "The Cat In The Hat";

        String updatedTitle = "";
        // TODO: Replace the word "Cat" with "Dog
<<<<<<< HEAD

=======
        
        updatedTitle = bookTitle.replace( "Cat", "Dog");
        
>>>>>>> c7202ee (Completed datatypes homework assignments)
        assertThat(updatedTitle, equalTo("The Dog In The Hat"));
    }
}
