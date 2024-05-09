package com.luv2code.junitdemo;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class DemoUtilsTest {

    DemoUtils demoUtils;
    @BeforeEach
void setupBeforeEach(){
        demoUtils = new DemoUtils();
        System.out.println("Setup Before Each execution");
    }
    @Test
    @DisplayName("Equals and Not equals")
    void testEqualsAndNotEquals() {
        System.out.println("Running test: testEqualsAndNotEquals");

        assertEquals(6, demoUtils.add(2, 4), "2+4 must be 6");
        assertNotEquals(6, demoUtils.add(1, 9), "1+9 must not be 9");
    }

    @Test
    @DisplayName("Nulls and not nulls")
    void testNullAndNotNull(){
        System.out.println("Running test: testNullAndNotNull");


        String str1 = null;
        String str2 = "luv2code";

        assertNull(demoUtils.checkNull(str1), "Object should be null");
        assertNotNull(demoUtils.checkNull(str2), "Object should be null");
    }

    @DisplayName("Same and Not Same")
    @Test
    void testSameAndNotSame(){
        System.out.println("Running test: testSameAndNotSame");

        String str = "luv2code";
        assertSame(demoUtils.getAcademy(), demoUtils.getAcademyDuplicate(), "Object should refere to the same object");
        assertNotSame(str, demoUtils.getAcademy(), "Object should not refere to the same object");
    }
    @DisplayName("True and False")
    @Test
    void testTrueFalse(){
   int gradeOne = 10;
   int gradeTwo = 5;

   assertTrue(demoUtils.isGreater(gradeOne, gradeTwo), "Object should be true");
   assertFalse(demoUtils.isGreater(gradeTwo, gradeOne), "Object should not be true");
    }

    @DisplayName("Array Equals")
  @Test
    void testArrayEqual(){
        System.out.println("Array Equals");

        String [] stringArray = {"A", "B" , "C"};

        assertArrayEquals(stringArray, demoUtils.getFirstThreeLettersOfAlphabet());
    }
//@AfterEach
//    void tearDownAfterEAch() {
//    System.out.println("Tear Down After Each execution");
//    System.out.println();
//}
//@BeforeAll
//        static void setupBeforeEachClass(){
//    System.out.println("Setup Before All execution");
//    }
//
//
//    @AfterAll
//    static void tearDownAfterEachClass(){
//        System.out.println("Tear Down After All execution");
//    }

}