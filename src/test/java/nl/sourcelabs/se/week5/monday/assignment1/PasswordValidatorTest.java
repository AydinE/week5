package nl.sourcelabs.se.week5.monday.assignment1;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author Jarno Walgemoed (Sourcelabs.nl)
 */
public class PasswordValidatorTest {

    @Test
    public void goodPassword() {

        PasswordValidator validator = new PasswordValidator();

        assertTrue("Password is a match", validator.isValid("P@ssword1"));

    }

    @Test
    public void passwordTooShort() {

        PasswordValidator validator = new PasswordValidator();

        assertFalse("Passwords needs to be at least 8 characters", validator.isValid("Pswrd1@"));

    }

    @Test
    public void noNumberInPassword() {

        PasswordValidator validator = new PasswordValidator();

        assertFalse("Passwords needs to contain a number", validator.isValid("P@ssword"));

    }

    @Test
    public void noSpecialCharacter() {

        PasswordValidator validator = new PasswordValidator();

        assertFalse("Password must contain valid special character", validator.isValid("Password1"));

    }

    @Test
    public void wrongSpecialCharacter() {

        PasswordValidator validator = new PasswordValidator();

        assertFalse("Passwords contains illegal special character", validator.isValid("Password1!"));

    }

    @Test
    public void allSpecialCharacters() {

        PasswordValidator validator = new PasswordValidator();

        assertTrue("This password contains valid special characters: @", validator.isValid("Password1@"));
        assertTrue("This password contains valid special characters: #", validator.isValid("Password1#"));
        assertTrue("This password contains valid special characters: $", validator.isValid("Password1$"));
        assertTrue("This password contains valid special characters: %", validator.isValid("Password1%"));
        assertTrue("This password contains valid special characters: ^", validator.isValid("Password1^"));
        assertTrue("This password contains valid special characters: &", validator.isValid("Password1&"));
        assertTrue("This password contains valid special characters: +", validator.isValid("Password1+"));
        assertTrue("This password contains valid special characters: =", validator.isValid("Password1="));

    }

    @Test
    public void passwordTooLong() {

        PasswordValidator validator = new PasswordValidator();

        assertFalse("Passwords should be smaller than 20 character", validator.isValid("P@ssword1P@ssword1P@ssword1P@ssword1"));

    }


    @Test
    public void passwordNull() {

        PasswordValidator validator = new PasswordValidator();

        assertFalse(validator.isValid(null));

    }


}