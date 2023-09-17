package com.itfactory.Figuri;

import com.itfactory.CalculPerimetru;

import java.io.IOException;
import java.util.Scanner;

public class Paralelogram implements CalculPerimetru {
    double latime;
    double lungime;

    public Paralelogram(double latime, double lungime) {
        this.latime = latime;
        this.lungime = lungime;
    }

    @Override
    public double perimetrul() {

        return 2 * (this.lungime + this.latime);
    }

    public static Paralelogram creeazaParalelogram() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti lungimea paralelogramului: ");
        double lungime = Double.parseDouble(scanner.nextLine());
        if (lungime <= 0) {
            throw new IOException("Valoarea introdusa trebuie sa fie mai mare de 0");
        }
        System.out.println("Introduceti latimea paralelogramului: ");
        double latime = Double.parseDouble(scanner.nextLine());
        if (latime <= 0) {
            throw new IOException("Valoarea introdusa trebuie sa fie mai mare de 0");
        }
        return new Paralelogram(latime, lungime);
    }
}
