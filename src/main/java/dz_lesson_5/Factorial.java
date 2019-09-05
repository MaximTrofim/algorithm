package dz_lesson_5;

public class Factorial {
    public static int factorial(int a){
        if (a <= 1){
            return 1;
        }
        return a * factorial(a - 1);
    }
}
