package con.carry.设计模式.模板模式;

/**
 * Created by wuwenshuai on 2019/9/25.
 */
public abstract class Game {

    abstract void start();

    abstract void end();

    //模板方法
    public final void play() {

        start();

        end();

    }
}
