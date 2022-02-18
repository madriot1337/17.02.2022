public class Main {
    public static void main(String[] args){
        System.out.println(sumNumbers(11,6));
        twoNumbers(-6);
        System.out.println(NegOrPos(-22));
        Printer("Hello, World!", 5);
        System.out.println(Year365(1920));

    }
    public static boolean sumNumbers(int a, int b){
        if ((a + b) >= 10 && (a + b) <= 20) {
            return true;
        } else {
            return false;
        }
    }
    public static void twoNumbers(int a) {
        if (a >= 0) {
            System.out.println("Positive");
        }
        else {
            System.out.println("Negative");
        }
    }
    public static boolean NegOrPos(int num){
        if (num < 0){
            return true;
        } else {
            return false;
        }
    }
    public static void Printer(String line, int x){
        for (int i = 0; i < x; i++) {
            System.out.println(line);
        }
    }
    public static boolean Year365(int num){
        if (num % 4 == 0 && num % 100 != 0){
            return true;
        } else if (num % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
