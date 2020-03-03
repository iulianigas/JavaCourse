public class EqualSumChecker {

    public static void main(String[] args) {
        System.out.println("5 + 3 = 8 ? " + hasEqualSum(5,3,8));
    }

    public static boolean hasEqualSum(int a, int b, int c) {
        if(a + b == c) {
            return true;
        }
        return false;
    }

}