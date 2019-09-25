package con.carry;

import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.util.Date;

/**
 * Created by wuwenshuai on 2019/7/26.
 */
public class JodaTimeTest {


    public static void main(String[] args) {


        // 初始化时间
        DateTime dateTime = new DateTime(2019, 07, 04, 11, 8, 55);
        // 当前时间
        DateTime nowTime = new DateTime();
        // 转换(date---->String)
        String str1 = dateTime.toString("yyyy-MM-dd HH:mm:ss");
        // 转换(String---->date)
        DateTimeFormatter format = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss");
        Date date1 = DateTime.parse(str1, format).toDate();
        // 获取当天零点时间
        DateTime startOfDay = nowTime.withTimeAtStartOfDay();
        System.out.println(startOfDay.toString());
        // 获取当天结束时间
        DateTime endOfDay = nowTime.millisOfDay().withMaximumValue();
        System.out.println(endOfDay);
        // 获取之后时间
        DateTime dateTime3 = dateTime.plusDays(1) // 增加天
                .plusYears(1)// 增加年
                .plusMonths(1)// 增加月
                .plusWeeks(1)// 增加星期
                .minusMillis(1)// 减分钟
                .minusHours(1)// 减小时
                .minusSeconds(1); // 减秒数
        // 获取下周1的时间
        DateTime dateTime4 = dateTime.dayOfWeek()// get dayOfWeek property
                .setCopy(1)//设置为周一
                .plusWeeks(1);//增加一周

        // 五年后的第二个月的最后一天
        DateTime then = dateTime.minusYears(5) // five years ago
                .monthOfYear()     // get monthOfYear property
                .setCopy(2)        // set it to February
                .dayOfMonth()      // get dayOfMonth property
                .withMaximumValue();// the last day of the month

        // 计算相隔天数
        int days = Days.daysBetween(nowTime, dateTime).getDays();
        System.out.println(days);
    }
}
