package dz_lesson_5;

public class Pow {
    public static void main(String[] args) {
        System.out.println(pow_cyclic(2,-3));
        //System.out.println(pow_recursive(2,-2));
    }

    //возведение в степень циклическим методом
    public static double pow_cyclic(double a, double b){
        double result = 1;
        if (b > 0){
            for (int i = 0; i < b ; i++) {
                result = result * a;
            }
            return result;
        }
        if (b < 0){
            for (int i = 0; i > b; i--) {
                result = result * a;
            }
            return 1 / result;
        }
        return 1;
    }
    //возведение в степень рекурсивным методом
    public static double pow_recursive(double a, double b){
        if (b > 0){
            return a * pow_recursive(a,b - 1);
        }
        if (b < 0){
            return 1 / (a * pow_recursive(a,Math.abs(b) - 1));
        }
        return 1;
    }
}
