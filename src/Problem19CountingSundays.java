import java.util.Optional;

/**
 * Created by angelica on 20/09/17.
 */
public class Problem19CountingSundays {

    int sundays;
    int currentYear;
    //int currentDay;
    Days currentDay;


    public int countSundays() {
        Days currentDay = new Days(1);
        Months currentMonth = Months.JANUARY;
        currentMonth = Months.MARCH;
        currentMonth = currentMonth.next(currentMonth);
        for(int y = 1; y < 100; y++) {
            for(int m = 1; m < 12; m++) {

                if (currentMonth.isThirtyDays()) {
                    loopDays();
                } else if (currentMonth.isThirtyOneDays()) {
                    loopDays();
                }
            }
        }

        return 0;
    }

    public void loopDays(){
        for (int d = 1; d < 30; d++) {
            if(currentDay.getDayNum() == 7) {
                sundays++;
                currentDay.next();
            } else {
                currentDay.next();
            }
        }
    }

    public static void main(String[] args) {
        //Problem19CountingSundays prob19 = new Problem19CountingSundays();
        Months currentMonth = Months.JANUARY;
        currentMonth = currentMonth.next(currentMonth);
        System.out.print(currentMonth.getMonthNum());
    }

}
