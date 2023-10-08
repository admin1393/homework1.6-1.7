import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    }

    void task15_1(){
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.UK);
        double x = scanner.nextDouble();
        if (x >= 3 && x <= 8){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }

    void task15_2(){
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.UK);
        double x = scanner.nextDouble();
        if ((x >= -3 && x <= 5) || (x >= 9 && x <= 15)){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }

    void task15_3(){
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.UK);
        double x = scanner.nextDouble();
        if ((x < -2 && x > 3) || (x < 6 && x > 9)){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }

    void task15_4(){
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.UK);
        int x = scanner.nextInt();
        if (x > 0 && (x > 99 && x < 1000) && x % 5 == 0){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }

    void task15_5(){
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.UK);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        if ((a + b == 0) || (a + c == 0) || (a + d == 0)){
            System.out.println("true");
        } else if ((b + c == 0) || (b + d == 0)) {
            System.out.println("true");
        } else if (c + d == 0) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }

    void task15_6(){
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.UK);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a % 2 == 0 && b % 2 == 0 && c % 2 == 0){
            System.out.println("true");
        } else if (b % 2 == 0 && c % 2 == 0) {
            System.out.println("true");
        } else if (a % 2 == 0 && c % 2 == 0) {
            System.out.println("true");
        } else if (a % 2 == 0 && b % 2 == 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    void task16_1(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n > -1 && n < 10){
            System.out.println("DIGIT");
        }else if (n > 9 && n < 100){
            System.out.println("NUM");
        }else{
            System.out.println("OTHER");
        }
    }

    void task16_2(){
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.UK);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a > b && b > c){
            System.out.print(c+" "+b+" "+a);
        } else if (a > c && c > b) {
            System.out.println(b+" "+c+" "+a);
        } else if (b > a && a > c) {
            System.out.println(c+" "+a+" "+b);
        } else if (b > c && c > a) {
            System.out.println(a+" "+c+" "+b);
        } else if (c > a && a > b) {
            System.out.println(b+" "+a+" "+c);
        } else if (c > b && b > a) {
            System.out.println(a+" "+b+" "+c);
        }
    }

    void task16_3(){
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.UK);
        int a = scanner.nextInt();

        if (a % 10 == 1 && (a/10)%10 != 1){
            System.out.println(a+" TORT");
        } else if (a % 10 > 1 && a % 10 < 5) {
            if ((a / 10)%10 == 1){
                System.out.println(a+" TORTOV");
            }
            else{
                System.out.println(a+" TORTA");
            }
        }
        else {
            System.out.println(a+" TORTOV");
        }
    }

    void task16_4(){
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.UK);
        double a = scanner.nextInt();
        double b = scanner.nextInt();
        String formatdouble = String.format("%.1f",b/a);
        String formatdoubleotric = String.format("%.1f",-(b/a));
        if (a <= 0 && b <= 0){
            System.out.println("no such x");
        } else if (a > 0 && b > 0 || (a >= 0 && b > 0) || (a > 0 && b >= 0)) {
            System.out.println("any x");
        } else if (a > 0 && b < 0) {
            System.out.println("x<"+formatdouble+" or x>"+formatdoubleotric);
        } else if (a < 0 && b > 0) {
            System.out.println(formatdouble+"<x<"+formatdoubleotric);
        }
    }
}
