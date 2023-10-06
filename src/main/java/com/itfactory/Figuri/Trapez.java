package com.itfactory.Figuri;

import com.itfactory.FormaGeometrica;

import java.io.IOException;
import java.util.Scanner;

public class Trapez implements FormaGeometrica {
    double bazaMare;
    double bazaMica;
    double latura1;
    double latura2;

    public Trapez(double bazaMare, double bazaMica, double latura1, double latura2) {
        this.bazaMare = bazaMare;
        this.bazaMica = bazaMica;
        this.latura1 = latura1;
        this.latura2 = latura2;
    }

    @Override
    public double perimetrul() {

        return bazaMare + bazaMica + latura1 + latura2;
    }

    public static Trapez creeazaTrapez() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti baza mica a trapezului: ");
        double bazaMica = Double.parseDouble(scanner.nextLine());
        if (bazaMica <= 0) {
            throw new IOException("Valoarea introdusa trebuie sa fie mai mare de 0");
        }
        System.out.println("Introduceti baza mare a trapezului: ");
        double bazaMare = Double.parseDouble(scanner.nextLine());
        if (bazaMare <= 0) {
            throw new IOException("Valoarea introdusa trebuie sa fie mai mare de 0");
        }
        System.out.println("Introduceti prima latura a trapezului: ");
        double latura1 = Double.parseDouble(scanner.nextLine());
        if (latura1 <= 0) {
            throw new IOException("Valoarea introdusa trebuie sa fie mai mare de 0");
        }
        System.out.println("Introduceti a doua latura a trapezului: ");
        double latura2 = Double.parseDouble(scanner.nextLine());
        if (latura2 <= 0) {
            throw new IOException("Valoarea introdusa trebuie sa fie mai mare de 0");
        }
        return new Trapez(bazaMare, bazaMica, latura1, latura2);
    }
}
