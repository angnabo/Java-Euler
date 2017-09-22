/**
 * Created by angelica on 20/09/17.
 */
public enum Days {
    MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4), FRIDAY(5), SATURDAY(6), SUNDAY(7);

    int dayNum = 0;

    Days(int d) {
        dayNum = d;
    }

    int getDayNum(){
        return dayNum;
    }

    Days getDay(){
        return this;
    }

    public Days next() {
        switch (this) {
            case MONDAY:
                return TUESDAY;
            case TUESDAY:
                return WEDNESDAY;
            case WEDNESDAY:
                return THURSDAY;
            case THURSDAY:
                return FRIDAY;
            case FRIDAY:
                return SATURDAY;
            case SATURDAY:
                return SUNDAY;
            case SUNDAY:
                return MONDAY;
            default:
                return null;
        }
    }
}