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

        assertTrue("Password is a match", PasswordValidator.isValid("P@ssword1"));

    }

    @Test
    public void passwordTooShort() {

        assertFalse("Passwords needs to be at least 8 characters", PasswordValidator.isValid("Pswrd1@"));

    }

    @Test
    public void noNumberInPassword() {

        assertFalse("Passwords needs to contain a number", PasswordValidator.isValid("P@ssword"));

    }

    @Test
    public void noSpecialCharacter() {

        assertFalse("Password must contain valid special character", PasswordValidator.isValid("Password1"));

    }

    @Test
    public void wrongSpecialCharacter() {

        assertFalse("Passwords contains illegal special character", PasswordValidator.isValid("Password1!"));

    }

    @Test
    public void allSpecialCharacters() {

        assertTrue("This password contains valid special characters: @", PasswordValidator.isValid("Password1@"));
        assertTrue("This password contains valid special characters: #", PasswordValidator.isValid("Password1#"));
        assertTrue("This password contains valid special characters: $", PasswordValidator.isValid("Password1$"));
        assertTrue("This password contains valid special characters: %", PasswordValidator.isValid("Password1%"));
        assertTrue("This password contains valid special characters: ^", PasswordValidator.isValid("Password1^"));
        assertTrue("This password contains valid special characters: &", PasswordValidator.isValid("Password1&"));
        assertTrue("This password contains valid special characters: +", PasswordValidator.isValid("Password1+"));
        assertTrue("This password contains valid special characters: =", PasswordValidator.isValid("Password1="));

    }

    @Test
    public void passwordTooLong() {

        assertFalse("Passwords should be smaller than 20 character", PasswordValidator.isValid("P@ssword1P@ssword1P@ssword1P@ssword1"));

    }


    @Test
    public void passwordNull() {

        assertFalse(PasswordValidator.isValid(null));

    }


}