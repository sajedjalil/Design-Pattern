package factory.toy;

import lombok.Data;

/**
 * @author sajed
 * @date 4/30/20
 */
@Data
public abstract class Toy {

    private int fuel;

    public abstract void recharge();
    public abstract void play();

}
