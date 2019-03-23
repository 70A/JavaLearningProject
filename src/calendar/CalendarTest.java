package calendar;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Tyki bom on 2019/3/23.
 */
public class CalendarTest {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("Date当前时间：" + date);

        // Calendar 是抽象类，不能实例化，通过getInstance()获取通用对象
        // 返回的是Calendar的子类对象
        Calendar calendar = Calendar.getInstance();
        System.out.println("calendar当前时间" + calendar.getTime());

        // 日期格式转换 DateFormat
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("转换后的date:" + dateFormat.format(date));

        // 解析日期字符串
        try {
            System.out.println("解析后的日期：" + dateFormat.parse("2018-11-13 05:10:36"));
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
