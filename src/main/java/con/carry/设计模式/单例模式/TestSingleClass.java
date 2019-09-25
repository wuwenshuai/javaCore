package con.carry.设计模式.单例模式;

/**
 * Created by wuwenshuai on 2019/9/23.
 */
public class TestSingleClass {

    public static void main(String[] args) {


        LazySingleClass instance1 = LazySingleClass.getInstance();
        LazySingleClass instance2 = LazySingleClass.getInstance();
        System.out.println(instance1 == instance2);

        System.out.println("---------------------------");
        HungerSingleClass instance3 = HungerSingleClass.getInstance();
        HungerSingleClass instance4 = HungerSingleClass.getInstance();
        System.out.println(instance3 == instance4);


        System.out.println("---------------------------");
        DclSingleClass instance5 = DclSingleClass.getInstance();
        DclSingleClass instance6 = DclSingleClass.getInstance();
        System.out.println(instance5 == instance6);

        System.out.println("---------------------------");
        StaticInerSingleClass instance7 = StaticInerSingleClass.getInstance();
        StaticInerSingleClass instance8 = StaticInerSingleClass.getInstance();
        System.out.println(instance7 == instance8);

        System.out.println("---------------------------");
        EnumSingleClass instance9 = EnumSingleClass.INSTANCE;
        EnumSingleClass instance10 = EnumSingleClass.INSTANCE;
        System.out.println(instance9 == instance10);




    }
}
