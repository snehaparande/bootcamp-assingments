package com.tw.step8.assignment3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthTest {
    @Test
    void compareEqualLengths() {
        Length length1 = new Length(1.0, Unit.FEET);
        Length length2 = new Length(1.0, Unit.FEET);

        assertEquals(0, length1.compare(length2));
    }

    @Test
    void compareUnEqualLengths() {
        Length length1 = new Length(1.0, Unit.FEET);
        Length length2 = new Length(2.0, Unit.FEET);

        assertEquals(-1, length1.compare(length2));
    }

    @Test
    void compareEqualLengthsInFeetAndInch() {
        Length length1 = new Length(1.0, Unit.FEET);
        Length length2 = new Length(12.0, Unit.INCH);

        assertEquals(0, length1.compare(length2));
    }

    @Test
    void compareUnEqualLengthsInFeetAndInch() {
        Length length1 = new Length(1.0, Unit.FEET);
        Length length2 = new Length(13.0, Unit.INCH);

        assertEquals(-1, length1.compare(length2));
    }

    @Test
    void compareEqualLengthsInInchAndCm() {
        Length length1 = new Length(2.0, Unit.INCH);
        Length length2 = new Length(5.0, Unit.CM);

        assertEquals(0, length1.compare(length2));
    }

    @Test
    void compareUnEqualLengthsInInchAndCm() {
        Length length1 = new Length(2.0, Unit.INCH);
        Length length2 = new Length(4.0, Unit.CM);

        assertEquals(1, length1.compare(length2));
    }

    @Test
    void compareEqualLengthsInCmAndMm() {
        Length length1 = new Length(1.0, Unit.CM);
        Length length2 = new Length(10.0, Unit.MM);

        assertEquals(0, length1.compare(length2));
    }

    @Test
    void compareUnEqualLengthsInCmAndMm() {
        Length length1 = new Length(2.0, Unit.CM);
        Length length2 = new Length(11.0, Unit.MM);

        assertEquals(1, length1.compare(length2));
    }

    @Test
    void compareEqualLengthsInMmAndInch() {
        Length length1 = new Length(100.0, Unit.MM);
        Length length2 = new Length(4.0, Unit.INCH);

        assertEquals(0, length1.compare(length2));
    }

    @Test
    void compareUnEqualLengthsInMmAndInch() {
        Length length1 = new Length(105.0, Unit.MM);
        Length length2 = new Length(4.0, Unit.INCH);

        assertEquals(1, length1.compare(length2));
    }

    @Test
    void shouldAddTwoLengthsInInches() {
        Length length1 = new Length(1.0, Unit.INCH);
        Length length2 = new Length(1.0, Unit.INCH);

        Length expected = new Length(2.0, Unit.INCH);

        assertEquals(0, expected.compare(length1.add(length2)));
    }

    @Test
    void shouldAddTwoLengthsOfAnyUnits() {
        Length length1 = new Length(2.0, Unit.INCH);
        Length length2 = new Length(2.5, Unit.CM);

        Length expected = new Length(3.0, Unit.INCH);

        assertEquals(0, expected.compare(length1.add(length2)));
    }

}