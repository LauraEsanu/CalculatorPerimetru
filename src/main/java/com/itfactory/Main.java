package com.itfactory;

import com.itfactory.Figuri.*;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        System.out.print("Buna ziua,\nAti accesat calculatorul de perimetrul!");


        while (true) {
            System.out.println("""
                
                Alegeti din urmatoarele optiuni:\s
                1 - Calculator perimetru dreptunghi
                2 - Calculator perimetru patrat
                3 - Calculator perimetru trapez
                4 - Calculator perimetru triunghi
                0 - Ies din program""");


            int optiune = Integer.parseInt(sc.nextLine());

            switch (optiune) {
                case 1:
                    Dreptunghi dreptunghi = Dreptunghi.creeazaDreptunghi();
                    double p1 = dreptunghi.perimetrul();
                    System.out.print("Perimetrul dreptunghiului este egal cu " + p1);
                    break;

                case 2:
                    Patrat patrat = Patrat.creeazaPatrat();
                    double p2 = patrat.perimetrul();
                    System.out.print("Perimetrul patratului este egal cu " + p2);
                    break;

                case 3:
                    Trapez trapez = Trapez.creeazaTrapez();
                    double p3 = trapez.perimetrul();
                    System.out.print("Perimetrul trapezului este egal cu " + p3);
                    break;

                case 4:
                    Triunghi triunghi = Triunghi.creeazaTriunghi();
                    double p4 = triunghi.perimetrul();
                    System.out.print("Perimetrul triunghiului este egal cu " + p4);
                    break;

                case 0:
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Nu ati introdus o optiune viabila! Incercati din nou. ");
            }
        }
    }
}
