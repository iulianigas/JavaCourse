public class DecimalComparator {

    public static void main(String[] args) {
        System.out.println("Are 3.175 and 3.176 equal by three decimals? " + areEqualByThreeDecimalPlaces(3.175, 3.176));
    }

    public static boolean areEqualByThreeDecimalPlaces(double first, double second) {
        first = first * 1000;
        second = second * 1000;
        int x = (int) first;
        int y = (int) second;
        if (x == y) {
            return true;
        } else {
            return false;
        }

    }

}