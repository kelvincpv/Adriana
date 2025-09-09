package br.papaya.e1;

import java.util.Locale;
import java.util.Scanner;

public class MediaCalculator {
    public static double media(double P1, double E1, double E2, double X, double SUB, double API) {
        double S = P1*0.5 + E1*0.2 + E2*0.3 + X + (SUB*0.15);
        double bonusAPI = (S > 5.9) ? (API * 0.5) : 0.0;
        return (S * 0.5) + bonusAPI;
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("P1: "); double P1 = sc.nextDouble();
        System.out.print("E1: "); double E1 = sc.nextDouble();
        System.out.print("E2: "); double E2 = sc.nextDouble();
        System.out.print("X: "); double X = sc.nextDouble();
        System.out.print("SUB: "); double SUB = sc.nextDouble();
        System.out.print("API: "); double API = sc.nextDouble();
        double S = P1*0.5 + E1*0.2 + E2*0.3 + X + (SUB*0.15);
        double m = media(P1,E1,E2,X,SUB,API);
        System.out.printf("S (parcial) = %.2f%n", S);
        System.out.printf("Média final = %.2f%n", m);
        sc.close();
    }
}
