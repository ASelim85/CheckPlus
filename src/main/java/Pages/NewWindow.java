package Pages;

import java.util.Date;

public class NewWindow {


    private int calculateDaysBetweenDates(Date date1, Date date2) {
        long difference = date2.getTime() - date1.getTime();
        return (int) (difference / (1000 * 60 * 60 * 24));
    }

// create a set of unit tests to test calculateDaysBetweenDates method
    @org.testng.annotations.Test
    public void testCalculateDaysBetweenDates() {
        Date date1 = new Date(2021, 1, 1);
        Date date2 = new Date(2021, 1, 10);
        assert calculateDaysBetweenDates(date1, date2) == 9;
    }

    @org.testng.annotations.Test
    public void testCalculateDaysBetweenDates2() {
        Date date1 = new Date(2021, 1, 1);
        Date date2 = new Date(2021, 1, 1);
        assert calculateDaysBetweenDates(date1, date2) == 0;
    }

    @org.testng.annotations.Test
    public void testCalculateDaysBetweenDates3() {
        Date date1 = new Date(2021, 1, 1);
        Date date2 = new Date(2021, 1, 2);
        assert calculateDaysBetweenDates(date1, date2) == 1;
    }

    @org.testng.annotations.Test
    public void testCalculateDaysBetweenDates4() {
        Date date1 = new Date(2021, 1, 1);
        Date date2 = new Date(2021, 1, 3);
        assert calculateDaysBetweenDates(date1, date2) == 2;
    }

    @org.testng.annotations.Test
    public void testCalculateDaysBetweenDates5() {
        Date date1 = new Date(2021, 1, 1);
        Date date2 = new Date(2021, 1, 4);
        assert calculateDaysBetweenDates(date1, date2) == 3;
    }

    @org.testng.annotations.Test
    public void testCalculateDaysBetweenDates6() {
        Date date1 = new Date(2021, 1, 1);
        Date date2 = new Date(2021, 1, 5);
        assert calculateDaysBetweenDates(date1, date2) == 4;
    }

    @org.testng.annotations.Test
    public void testCalculateDaysBetweenDates7() {
        Date date1 = new Date(2021, 1, 1);
        Date date2 = new Date(2021, 1, 6);
        assert calculateDaysBetweenDates(date1, date2) == 5;
    }

    @org.testng.annotations.Test
    public void testCalculateDaysBetweenDates8() {
        Date date1 = new Date(2021, 1, 1);
        Date date2 = new Date(2021, 1, 7);
        assert calculateDaysBetweenDates(date1, date2) == 6;
    }

}
