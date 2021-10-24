package htw.berlin.prog2.ha1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Retro calculator")
class CalculatorTest {
/*
    @Test
    @DisplayName("should display result after adding two positive multi-digit numbers")
    void testPositiveAddition() {
        Calculator calc = new Calculator();

        calc.pressDigitKey(2);
        calc.pressDigitKey(0);
        calc.pressBinaryOperationKey("+");
        calc.pressDigitKey(2);
        calc.pressDigitKey(0);
        calc.pressEqualsKey();

        String expected = "40";
        String actual = calc.readScreen();

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("should display result after getting the square root of two")
    void testSquareRoot() {
        Calculator calc = new Calculator();

        calc.pressDigitKey(2);
        calc.pressUnaryOperationKey("√");

        String expected = "1.41421356";
        String actual = calc.readScreen();

        assertEquals(expected, actual);
    }
/*
    /**
     * grüne Tests Teilaufgabe 1 - Subtraktion und Division positiver Zahlen
     */
/*
    @Test
    @DisplayName("should display result after subtraction of two positive multi-digit numbers")
    void testSubtraction() {
        Calculator calc = new Calculator();

        calc.pressDigitKey(3);
        calc.pressDigitKey(0);
        calc.pressBinaryOperationKey("-");
        calc.pressDigitKey(2);
        calc.pressDigitKey(0);
        calc.pressEqualsKey();

        String expected = "10";
        String actual = calc.readScreen();

        assertEquals(expected, actual);
    }
/*
    @Test
    @DisplayName("should display result after dividing two positive numbers")
    void testDivision() {
        Calculator calc = new Calculator();

        calc.pressDigitKey(2);
        calc.pressBinaryOperationKey("/");
        calc.pressDigitKey(2);
        calc.pressEqualsKey();

        String expected = "1";
        String actual = calc.readScreen();

        assertEquals(expected, actual);
    }

    /*
    roter Test 1 - Division 2 negative Zahlen
     */
    /*
    @Test
    @DisplayName("should display result after dividing two negative numbers")
    void testNegDivision() {
        Calculator calc = new Calculator();
        calc.pressNegativeKey();
        calc.pressDigitKey(2);
        calc.pressBinaryOperationKey("/");
        calc.pressNegativeKey();
        calc.pressDigitKey(2);
        calc.pressEqualsKey();

        String expected = "1";
        String actual = calc.readScreen();

        assertEquals(expected, actual);
    } */
    /*
    grüner Test - Division zwei negativer Zahlen mit veränderter Methode pressDigitKey
     */
    /*
    @Test
    @DisplayName("should display result after dividing two negative numbers")
    void testNDivision() {
        Calculator calc = new Calculator();
        calc.pressDigitKey(-2);
        calc.pressBinaryOperationKey("/");
        calc.pressDigitKey(-2);
        calc.pressEqualsKey();

        String expected = "1";
        String actual = calc.readScreen();

        assertEquals(expected, actual);
    }

    /*
    Test 2  - Division einer positiven und negativen Zahl
     */


    @Test
    @DisplayName("should display result after dividing one positive and one negative number")
    void testNPDivision() {
        Calculator calc = new Calculator();
        calc.pressDigitKey(2);
        calc.pressBinaryOperationKey("/");
        calc.pressNegativeKey();
        calc.pressDigitKey(2);
        calc.pressEqualsKey();

        String expected = "-1";
        String actual = calc.readScreen();

        assertEquals(expected, actual);
    }


    /*
    grüner Test - Division einer positiven und negativen Zahl mit veränderter Methode pressDigitKey
     */
    /*
    @Test
    @DisplayName("should display result after dividing one positive and one negative numbers")
    void testNPDivision() {
        Calculator calc = new Calculator();
        calc.pressDigitKey(2);
        calc.pressBinaryOperationKey("/");
        calc.pressDigitKey(-2);
        calc.pressEqualsKey();

        String expected = "-1";
        String actual = calc.readScreen();

        assertEquals(expected, actual);
    }



     */
}