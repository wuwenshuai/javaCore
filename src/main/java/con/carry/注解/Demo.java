package con.carry.注解;

/**
 * Created by wuwenshuai on 2019/10/25.
 */
public class Demo {

    public static void main(String[] args) {


        City city = new City();
        Class<? extends City> clazz = city.getClass();
        Entity annotation = clazz.getAnnotation(Entity.class);
        String value = annotation.value();
        System.out.println(value);

    }
}
