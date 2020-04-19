/**
 * @author Sajed Jalil
 * @date 20 April 2020
 *
 * Singleton Pattern Example
 */
public class SingletonPattern {

    private static volatile SingletonPattern singleInstance = null;

    private SingletonPattern(){

    }

    /*
    Lazy Initialization
    Synchronized is used in block to prevent concurrent access blocking. It only blocks at first time object creation
    */
    public static SingletonPattern getSingleInstance() {

        if( singleInstance == null ) {

            synchronized (SingletonPattern.class) {
                if( singleInstance == null)
                    singleInstance = new SingletonPattern();
            }

        }
        return singleInstance;
    }
}