package factory;

import factory.toy.Aeroplane;
import factory.toy.BabyElephant;
import factory.toy.RacingCar;
import factory.toy.Toy;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
/**
 * @author sajed
 * @date 4/30/20
 */
class ToyFactoryTest {

    ToyFactory toyFactory = null;
    ArrayList<String> toyNames = new ArrayList<String>(
            Arrays.asList("donkey", "aeroplane", "racing car", "baby elephant"));

    @BeforeEach
    void setUp() {
        toyFactory = new ToyFactory();
    }

    @RepeatedTest(4)
    void createToy(RepetitionInfo repetitionInfo) {

        Toy actual = toyFactory.createToy( toyNames.get( repetitionInfo.getCurrentRepetition()-1) );
        ArrayList<Toy> expected = new ArrayList<Toy>(
                Arrays.asList( null, new Aeroplane(), new RacingCar(), new BabyElephant()));

        System.out.print( "Repetition: "+ repetitionInfo.getCurrentRepetition()
                + " of "+ repetitionInfo.getTotalRepetitions());
        assertEquals(expected.get( repetitionInfo.getCurrentRepetition()-1), actual);
    }


}