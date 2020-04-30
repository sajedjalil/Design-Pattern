package factory;

import factory.toy.Toy;

import java.util.ArrayList;

/**
 * @author sajed
 * @date 4/30/20
 */
public class FactoryPattern {

    ToyFactory toyFactory = new ToyFactory();

    public static void main(String[] args) {

        FactoryPattern factoryPattern = new FactoryPattern();
        factoryPattern.makeToys( );
    }

    private void makeToys( ) {

        ArrayList<Toy> toyCollections = new ArrayList<>();
        toyCollections.add( toyFactory.createToy("aeroplane"));
        toyCollections.add( toyFactory.createToy("racing car"));
        toyCollections.add( toyFactory.createToy("baby elephant"));

        for( Toy toy: toyCollections) toy.recharge();
        for( Toy toy: toyCollections) toy.play();

    }
}
