package com.itfactory.Figuri;

import com.itfactory.FormaGeometrica;

import java.io.IOException;
import java.util.Scanner;

public class Patrat implements FormaGeometrica {
    double latura;

    public Patrat(double latura) {
        this.latura = latura;
    }

    @Override
    public double perimetrul() {
        return 4 * this.latura;
    }

    public static Patrat creeazaPatrat() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti latura patratului: ");
        double latura = Double.parseDouble(scanner.nextLine());
        if (latura <= 0) {
            throw new IOException("Valoarea introdusa trebuie sa fie mai mare de 0");
        }

        return new Patrat(latura);
    }
}
