public class Main {
    public static void main(String[] args) {
        try {
            int result = getFactorial(-9);
            System.out.println(result);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static int getFactorial(int num) throws Exception {
        if (num < 1) throw new Exception("The number is less than 1");
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }
}