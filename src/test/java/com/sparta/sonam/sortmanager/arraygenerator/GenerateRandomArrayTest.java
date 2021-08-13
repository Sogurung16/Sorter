package com.sparta.sonam.sortmanager.arraygenerator;

import jdk.jfr.Description;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Description("Generates random array of provided length")
class GenerateRandomArrayTest {

    @Test
    @Description("Returns random array of length 20")
    void generateRandomArray() {
        int[] unsortedArray = GenerateRandomArray.generateRandomArray(20);
        Assertions.assertEquals(20, unsortedArray.length);
    }
}