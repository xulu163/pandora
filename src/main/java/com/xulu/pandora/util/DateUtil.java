package com.xulu.pandora.util;

import org.apache.commons.lang3.time.DateUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author xulu
 * @date 2018/8/3
 * @link https://github.com/xulu163
 */
public class DateUtil extends DateUtils {

    private static final String dateTimeFormatTemplate = "yyyy-MM-dd HH:mm:ss";
    private static final String dateFormatTemplate = "yyyy-MM-dd";

    /**
     * 指定日期相差天数
     */
    public static long daysBetween(Date one, Date two) {
        long difference =  (one.getTime() - two.getTime())/86400000;
        return Math.abs(difference);
    }

    /**
     * 从String转换成Date(格式: yyyy-MM-dd HH:mm:ss)
     */
    public static Date formatDateFromString(String date) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(dateTimeFormatTemplate);
        return sdf.parse(date);
    }

    /**
     * yyyy-MM-dd HH:mm:ss 转换成yyyy-MM-dd
     */
    public static Date formatToFromDate(Date date) throws ParseException{
        SimpleDateFormat sdf = new SimpleDateFormat(dateFormatTemplate);
        return sdf.parse(sdf.format(date));
    }

    /**
     * data转化成string
     * patten: “yyyy-MM-dd”
     */
    public static String formatStringFromDate(Date date, String patten) {
        SimpleDateFormat sdf = new SimpleDateFormat(patten);
        return sdf.format(date);
    }

    /**
     * 获得该月第一天
     */
    public static String getFirstDayOfMonth(int year,int month){
        Calendar cal = Calendar.getInstance();
        //设置年份
        cal.set(Calendar.YEAR,year);
        //设置月份
        cal.set(Calendar.MONTH, month-1);
        //获取某月最小天数
        int firstDay = cal.getActualMinimum(Calendar.DAY_OF_MONTH);
        //设置日历中月份的最小天数
        cal.set(Calendar.DAY_OF_MONTH, firstDay);
        //格式化日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String firstDayOfMonth = sdf.format(cal.getTime());
        return firstDayOfMonth;
    }

    /**
     * 获得该月第一天
     */
    public static String getFirstDayOfMonth(Date date){
        Calendar now = Calendar.getInstance();
        now.setTime(date);

        int year = now.get(Calendar.YEAR);
        int month = now.get(Calendar.MONTH) + 1;
        return getFirstDayOfMonth(year, month);
    }

    /**
     * 获得该月最后一天
     */
    public static String getLastDayOfMonth(int year,int month){
        Calendar cal = Calendar.getInstance();
        //设置年份
        cal.set(Calendar.YEAR,year);
        //设置月份
        cal.set(Calendar.MONTH, month-1);
        //获取某月最大天数
        int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        //设置日历中月份的最大天数
        cal.set(Calendar.DAY_OF_MONTH, lastDay);
        //格式化日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String lastDayOfMonth = sdf.format(cal.getTime());
        return lastDayOfMonth;
    }

    /**
     * 获得该月最后一天
     */
    public static String getLastDayOfMonth(Date date){
        Calendar now = Calendar.getInstance();
        now.setTime(date);

        int year = now.get(Calendar.YEAR);
        int month = now.get(Calendar.MONTH) + 1;
        return getLastDayOfMonth(year, month);
    }

    /**
     * 获取当月的天数
     */
    public static int getCurrentMonthDay(Date date) {
        Calendar now = Calendar.getInstance();
        now.setTime(date);
        int year = now.get(Calendar.YEAR);
        int month = now.get(Calendar.MONTH) + 1;
        return getDaysByYearMonth(year, month);
    }
    /**
     * 根据年 月 获取对应的月份 天数
     * */
    public static int getDaysByYearMonth(int year, int month) {

        Calendar a = Calendar.getInstance();
        a.set(Calendar.YEAR, year);
        a.set(Calendar.MONTH, month - 1);
        a.set(Calendar.DATE, 1);
        a.roll(Calendar.DATE, -1);
        int maxDate = a.get(Calendar.DATE);
        return maxDate;
    }

    /**
     * 指定日期+前后m月
     */
    public static Date getAddMonth(String inputDate, int m) throws ParseException{
        Calendar c = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(inputDate);//初始日期
        c.setTime(date);//设置日历时间
        c.add(Calendar.MONTH,m);
        return c.getTime();
    }

    /**
     * 判断是否同月
     */
    public static boolean isSameMonth(Date date1, Date date2) {
        Calendar calendar1 = Calendar.getInstance();
        calendar1.setTime(date1);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(date2);
        return calendar1.get(Calendar.YEAR) == calendar2.get(Calendar.YEAR) && calendar1.get(Calendar.MONTH) == calendar2.get(Calendar.MONTH);
    }
}
