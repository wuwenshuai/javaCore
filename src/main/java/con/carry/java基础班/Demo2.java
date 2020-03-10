package con.carry.java基础班;

import org.springframework.util.StringUtils;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by wuwenshuai on 2019/9/15.
 */
public class Demo2 {
    public static void main(String[] args) {

        ZonedDateTime todayZeroTime = ZonedDateTime.now();
        System.out.println(todayZeroTime);
        Map<String, String> min = getRelativeDateRangeByDate(todayZeroTime, -5, "MIN");
        System.out.println(min.get("beginDate"));
        System.out.println(min.get("endDate"));
    }

    public static Map<String, String> getRelativeDateRangeByDate(ZonedDateTime referenceDate, int offset, String datePeriod) {
        if (datePeriod == null) {
            return new HashMap<>();
        }
        Map<String, String> period = new HashMap<>();
        DateTimeFormatter ISOFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'").withZone(ZoneId.of("Z"));
        period.put("beginDate", ISOFormatter.format(referenceDate));
        switch (datePeriod) {
            case "HOURS":
                period.put("endDate", ISOFormatter.format(referenceDate.minusHours(offset)));
                break;
            case "MIN":
                period.put("endDate", ISOFormatter.format(referenceDate.minusMinutes(offset)));
                break;
            default:
                return new HashMap<>();
        }
        return period;
    }


}
