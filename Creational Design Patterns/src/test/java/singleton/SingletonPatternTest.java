package singleton;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import singleton.SingletonPattern;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Sajed Jalil
 * @date 20 April 2020
 */
class SingletonPatternTest {

    private SingletonPattern singletonPattern = null;

    @BeforeEach
    void setUp() {
        singletonPattern = SingletonPattern.getSingleInstance();
    }

    @AfterEach
    void tearDown() {
        System.out.println("Test Case Completed");
    }

    // Repeat the same test case 10 times
    @RepeatedTest( value = 10)
    void getSingleInstance( RepetitionInfo repetitionInfo ) {
        System.out.print( "Repetition: "+ repetitionInfo.getCurrentRepetition() + " of "+ repetitionInfo.getTotalRepetitions());
        SingletonPattern singletonPatternTest = SingletonPattern.getSingleInstance();
        assertEquals( singletonPattern.hashCode(), singletonPatternTest.hashCode() );
    }
}