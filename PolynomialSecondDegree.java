import javax.swing.*;
import java.util.Scanner;


public class PolynomialSecondDegree {
    public static void main(String[] args) {

        double a,b,c,discriminant,x0,x1,x2;

        Scanner coefficient = new Scanner(System.in);                        //coefficients are 'a', 'b' and 'c'
        System.out.print("Choose 'a' different than zero");
        System.out.println();
        System.out.print("a = ");
        a = coefficient.nextDouble();
        System.out.print("b = ");
        b = coefficient.nextDouble();
        System.out.print("c = ");
        c = coefficient.nextDouble();
        discriminant = Math.pow(b,2) - 4 * a * c;                           //discriminant(delta) of quadratic equation

        //three options concerning the sign of delta
        if (discriminant < 0) {

            System.out.println("This equation has no solution");
            System.out.println("delta = " + discriminant);

        }
        if (discriminant == 0) {
            x0 = (-b)/(2 * a);                                              //double root of quadratic equation
            System.out.println("Equation has one double solution x0 ");
            System.out.println("x0 = " + x0);
        }
        if (discriminant > 0) {
            x1 = (-b - Math.sqrt(discriminant))/(2 * a);                    //two different roots of quadratic equation
            x2 = (-b + Math.sqrt(discriminant))/(2 * a);
            System.out.println("delta = " + discriminant);
            System.out.println("Square root of delta = " + Math.sqrt(discriminant));
            System.out.println("Equation has two different roots: x1 and x2");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }



        }
                }














