package calendar;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Tyki bom on 2019/3/23.
 */
public class CalendarSetValue {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
//        calendar.add(Calendar.YEAR,2);
//        calendar.add(Calendar.MONTH,2);
        System.out.println(calendar.getTime());

        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String currentTime = dateFormat.format(date);
        System.out.println("当前时间为：" + currentTime);

        // 当前3h
        calendar.add(Calendar.HOUR_OF_DAY,-3);
        String current3h = dateFormat.format(calendar.getTime());
        System.out.println("当前3h:" + current3h);

        // 今日0时
        calendar.set(Calendar.HOUR_OF_DAY,0);
        calendar.set(Calendar.MINUTE,0);
        calendar.set(Calendar.SECOND,0);
        String today = dateFormat.format(calendar.getTime());
        System.out.println("今日0时：" + today);

        // 前一天0时
        calendar.add(Calendar.DAY_OF_MONTH,-1);
        String yesterday = dateFormat.format(calendar.getTime());
        System.out.println("前一天0时：" + yesterday);

        //前一周0时
        calendar.add(Calendar.WEEK_OF_YEAR,-1);
        String week = dateFormat.format(calendar.getTime());
        System.out.println("前一周0时：" + week);

        // 前一个月0时
        calendar.add(Calendar.MONTH,-1);
        String month = dateFormat.format(calendar.getTime());
        System.out.println("前一个月0时：" + month);

        // 前一年0时
        calendar.set(Calendar.YEAR,calendar.get(Calendar.YEAR)-1);
        System.out.println(dateFormat.format(calendar.getTime()));

    }

}
