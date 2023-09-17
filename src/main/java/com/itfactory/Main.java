package com.itfactory;

import com.itfactory.Figuri.*;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Buna ziua,\nAti accesat calculatorul de perimetrul!");


        while (true) {
            System.out.println("""
                
                Alegeti din urmatoarele optiuni:\s
                1 - Calculator perimetru dreptunghi
                2 - Calculator perimetru paralelogram
                3 - Calculator perimetru patrat
                4 - Calculator perimetru trapez
                5 - Calculator perimetru triunghi
                0 - Ies din program""");

            int optiune = sc.nextInt();

            switch (optiune) {
                case 1:
                    Dreptunghi dreptunghi = Dreptunghi.creeazaDreptunghi();
                    double p1 = dreptunghi.perimetrul();
                    System.out.println("Perimetrul dreptunghiului este egal cu " + p1);
                    break;

                case 2:
                    Paralelogram paralelogram = Paralelogram.creeazaParalelogram();
                    double p2 = paralelogram.perimetrul();
                    System.out.println("Perimetrul paralelogramului este egal cu " + p2);
                    break;

                case 3:
                    Patrat patrat = Patrat.creeazaPatrat();
                    double p3 = patrat.perimetrul();
                    System.out.println("Perimetrul patratului este egal cu " + p3);
                    break;

                case 4:
                    Trapez trapez = Trapez.creeazaTrapez();
                    double p4 = trapez.perimetrul();
                    System.out.println("Perimetrul trapezului este egal cu " + p4);
                    break;

                case 5:
                    Triunghi triunghi = Triunghi.creeazaTriunghi();
                    double p5 = triunghi.perimetrul();
                    System.out.println("Perimetrul triunghiului este egal cu " + p5);
                    break;

                case 0:
                    System.exit(0);
                default:
                    System.out.println("Nu ati introdus o optiune viabila! Incercati din nou. ");
            }
        }
    }
}
