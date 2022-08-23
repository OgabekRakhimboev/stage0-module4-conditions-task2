package school.mjc.stage0.conditions.task2;

public class GreatestNumberPrinter {
    public static void main(String [] args){
        printGreatest(5, 5);
    }
    public static void printGreatest(int first, int second) {
        if (first>second){
            System.out.println(first);
        } else if (second>first) {
            System.out.println(second);
        } else {
            System.out.println(first);
        }
    }
}
