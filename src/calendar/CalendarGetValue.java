package calendar;

import java.util.Calendar;

/**
 * 日历类常用方法
 * Created by Tyki bom on 2019/3/23.
 */
public class CalendarGetValue {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        int year = calendar.get(Calendar.YEAR);

        // month 的范围是0-11
        int month = calendar.get(Calendar.MONTH ) + 1 ;

        int day = calendar.get(Calendar.DAY_OF_MONTH);

        System.out.println("年月日："+ year + ": " + month + ":" + day);

        calendar.set(2019,2,15,13,20,30);

        System.out.println("年Year:" + calendar.get(Calendar.YEAR));
        System.out.println("月month:" + (calendar.get(Calendar.MONTH)+1));
        System.out.println("日DAY_OF_MONTH  ---" + calendar.get(Calendar.DAY_OF_MONTH));

        System.out.println("24时HOUR_OF_DAY  ---" + calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println("12时HOUR  ---" + calendar.get(Calendar.HOUR));
        System.out.println("分MINUTE  ---" + calendar.get(Calendar.MINUTE));
        System.out.println("秒SECOND  ---" + calendar.get(Calendar.SECOND));
        System.out.println("毫秒MILLISECOND ---" + calendar.get(Calendar.MILLISECOND));

        System.out.println("AM_PM  ---" + calendar.get(Calendar.AM_PM));

        // 从星期日开始
        System.out.println("星期DAY_OF_WEEK  ---" + calendar.get(Calendar.DAY_OF_WEEK));

        System.out.println("DAY_OF_WEEK_IN_MONTH  ---" + calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println("DAY_OF_YEAR  ---" + calendar.get(Calendar.DAY_OF_YEAR));

        System.out.println("WEEK_OF_MONTH  ---" + calendar.get(Calendar.WEEK_OF_MONTH));
        System.out.println("WEEK_OF_YEAR  ---" + calendar.get(Calendar.WEEK_OF_YEAR));



    }
}
