package com.itfactory.Figuri;

import com.itfactory.FormaGeometrica;

import java.io.IOException;
import java.util.Scanner;

public class Dreptunghi implements FormaGeometrica {
    double lungime;
    double latime;

    public Dreptunghi(double lungime, double latime) {
        this.lungime = lungime;
        this.latime = latime;
    }

    @Override
    public double perimetrul() {
        return 2 * (this.lungime + this.latime);
    }


    public static Dreptunghi creeazaDreptunghi(Scanner scanner) throws IOException {
        System.out.println("Introduceti lungimea dreptunghiului: ");
        double lungime = Double.parseDouble(scanner.nextLine());
        if (lungime <= 0) {
            throw new IOException("Valoarea introdusa trebuie sa fie mai mare de 0");
        }
        System.out.println("Introduceti latimea dreptunghiului: ");
        double latime = Double.parseDouble(scanner.nextLine());
        if (latime <= 0) {
            throw new IOException("Valoarea introdusa trebuie sa fie mai mare de 0");
        }
        return new Dreptunghi(lungime, latime);

    }
}

