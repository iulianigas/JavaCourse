public class LeapYear {

    public static void main(String[] args) {
        System.out.println("Is leap year -1600? " + isLeapYear(-1600));
        System.out.println("Is leap year 1600? " + isLeapYear(1600));
        System.out.println("Is leap year 2020? " + isLeapYear(2020));

    }

    public static boolean isLeapYear(int year) {
        if (!(year >= 1 && year <= 9999)) {
            return false;
        }
        else if(year %4 == 0) {
            if(year %100 == 0) {
                if(year %400 == 0) {
                    return true;
                }
            }
            else return true;
        }
        return false;
    }
}