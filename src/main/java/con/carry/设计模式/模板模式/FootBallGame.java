package con.carry.设计模式.模板模式;

/**
 * Created by wuwenshuai on 2019/9/25.
 */
public class FootBallGame extends Game {
    @Override
    void start() {
        System.out.println("足球比赛开始了");
    }

    @Override
    void end() {

        System.out.println("足球比赛结束了");
    }
}
