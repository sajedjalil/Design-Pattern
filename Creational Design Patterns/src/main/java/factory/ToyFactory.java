package factory;

import factory.toy.Aeroplane;
import factory.toy.BabyElephant;
import factory.toy.RacingCar;
import factory.toy.Toy;

import java.util.Objects;

/**
 * @author sajed
 * @date 4/30/20
 */
public class ToyFactory {

    public Toy createToy(String toyType){

        Toy toy = null;

        if( toyType.equalsIgnoreCase("Racing car")) toy = new RacingCar();
        else if( toyType.equalsIgnoreCase( "Baby elephant") ) toy = new BabyElephant();
        else if( toyType.equalsIgnoreCase("Aeroplane")) toy = new Aeroplane();

        //Objects.requireNonNull(toy).recharge();

        return toy;
    }

}
