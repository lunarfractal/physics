public class Main {
    private static int numDigits(int num) {
        return (int) Math.floor(Math.log10(Math.abs(num))) + 1;
    }
    
    public static void main(String[] args) {
        System.out.println(numDigits(67757));
    }
}
