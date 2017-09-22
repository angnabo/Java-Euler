/**
 * You are given the following information, but you may prefer to do some research for yourself.
 *
 * 1 Jan 1900 was a Monday.
 * Thirty days has September,
 * April, June and November.
 * All the rest have thirty-one,
 * Saving February alone,
 * Which has twenty-eight, rain or shine.
 * And on leap years, twenty-nine.
 * A leap year occurs on any year evenly divisible by 4, but not on a century unless it is divisible by 400.
 * How many Sundays fell on the first of the month during the twentieth century (1 Jan 1901 to 31 Dec 2000)?
 *
 * Answer: 171
 *
 * Created by angelica on 20/09/17.
 *
 */
public class Problem19CountingSundays {

    private int sundays;
    private Days currentDay = Days.MONDAY;

    public int countSundays() {
        int START_YEAR = 1900;
        int END_YEAR = 2000;
        boolean isLeap = false;

        for(int y = START_YEAR; y < END_YEAR; y++) {
            if(y > START_YEAR) {//don't count 1900
                if (y % 4 == 0){ //If the year is evenly divisible by 4 it's a leap year
                    isLeap = true;
                }
                for (Months m : Months.values()) {
                    if (m.isThirtyOneDays()) {
                        loopDays(m.getDays());
                    } else if (m.isThirtyDays()) {
                        loopDays(m.getDays());
                    } else if (m.isFeb() && !isLeap) {
                        loopDays(m.getDays());
                    } else {
                        loopDays(m.getDays()+1); //Add extra day on Feb when it's leap year
                        isLeap = false;
                    }
                }
            }
        }
        return sundays;
    }

    public void loopDays(int days){
        for (int d = 0; d < days; d++) {
            assert currentDay != null;
            if(d == 0 && currentDay.equals(Days.SUNDAY)) { //Determine if the first day is a Sunday
                sundays++;
                currentDay = currentDay.next();//move onto next day
            } else {
                currentDay = currentDay.next();//move onto next day
            }
        }
    }

    public static void main(String[] args) {
        Problem19CountingSundays prob19 = new Problem19CountingSundays();
        int s = prob19.countSundays();
        System.out.print(s);
    }
}
