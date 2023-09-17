package com.itfactory.Figuri;


import com.itfactory.CalculPerimetru;

import java.io.IOException;
import java.util.Scanner;

public class Triunghi implements CalculPerimetru {
    double latura1;
    double latura2;
    double latura3;

    public Triunghi(double latura1, double latura2, double latura3) {
        this.latura1 = latura1;
        this.latura2 = latura2;
        this.latura3 = latura3;
    }

    @Override
    public double perimetrul() {

        return latura1 + latura2 + latura3;
    }

    public static Triunghi creeazaTriunghi() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti prima latura: ");
        double latura1 = Double.parseDouble(scanner.nextLine());
        if (latura1 <= 0) {
            throw new IOException("Valoarea introdusa trebuie sa fie mai mare de 0");
        }
        System.out.println("Introduceti a doua latura: ");
        double latura2 = Double.parseDouble(scanner.nextLine());
        if (latura2 <= 0) {
            throw new IOException("Valoarea introdusa trebuie sa fie mai mare de 0");
        }
        System.out.println("Introduceti a treia latura: ");
        double latura3 = Double.parseDouble(scanner.nextLine());
        if (latura3 <= 0) {
            throw new IOException("Valoarea introdusa trebuie sa fie mai mare de 0");
        }
        return new Triunghi(latura1, latura2, latura3);
    }
}
