public class Days {
    private int dayNum = 0;

    Days(int num) {
        if (num >= 1 && num <= 7) {
            dayNum = num;
        }
    }

    public int getDayNum() {
        return dayNum;
    }

    public int next() {
        switch (dayNum) {
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 1;

            default:
                return 0;
        }
    }
}
