/**
 * Created by angelica on 20/09/17.
 */
public enum Months {
    JANUARY(1, 31), FEBRUARY(2, 28), MARCH(3, 31), APRIL(4, 30), MAY(5, 31), JUNE(6, 30), JULY(7, 31),
    AUGUST(8, 31), SEPTEMBER(9, 30), OCTOBER(10, 31), NOVEMBER(11, 30), DECEMBER(12, 31);

    int days = 0;
    int monthNum = 0;

    Months(int n, int d) {
        monthNum = n;
        days = d;
    }

    int getMonthNum(){
        return monthNum;
    }

    int getDays(){
        return days;
    }

    boolean isThirtyOneDays(){
        return getDays() == 31;
    }

    boolean isThirtyDays(){
        return getDays() == 30;
    }

    boolean isFeb(){
        return getDays() == 28;
    }

    public Months next(Months m) {
        switch (m) {
            case JANUARY:
                return FEBRUARY;
            case FEBRUARY:
                return MARCH;
            case MARCH:
                return APRIL;
            case APRIL:
                return MAY;
            case MAY:
                return JUNE;
            case JUNE:
                return JULY;
            case JULY:
                return AUGUST;
            case AUGUST:
                return SEPTEMBER;
            case SEPTEMBER:
                return NOVEMBER;
            case OCTOBER:
                return NOVEMBER;
            case NOVEMBER:
                return DECEMBER;

            default:
                return null;
        }
    }



}
