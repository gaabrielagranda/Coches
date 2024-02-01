package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    static Scanner scannerStr = new Scanner(System.in);
    static Scanner scannerNum = new Scanner(System.in).useLocale(Locale.US);
    static GestorCoche gc = new GestorCoche();
    public static void main(String[] args) {
        int opcion;
        System.out.println("crud de coches");
        boolean salir = false;
        do {
            menu();
            opcion = scannerNum.nextInt();
            switch (opcion) {
                case 1:
                    ingresarCoche();
                    break;
                case 2:
                    mostrarCoches();
                    break;
                case 9:
                    mocearCoches();
                    break;
                case 0:
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }while (!salir);
        System.out.println("Adios!");
    }
    private static void menu() {
        System.out.println("Menu de Opciones");
        System.out.println("================");
        System.out.println("1. Ingresar Coche");
        System.out.println("2. Listar Coches");
        System.out.println("9. Agredar Coches EN MASA");
        System.out.println("0. Salir");
        System.out.println();
        System.out.print("Ingrese una opcion: ");
    }
    private static void ingresarCoche() {
        String marca;
        String modelo;
        int anio;
        String color;
        System.out.println("Formulario de ingreso de Coche");
        System.out.println("==============================");
        System.out.println();
        System.out.print("Marca: ");
        marca = scannerStr.nextLine();
        System.out.print("Modelo: ");
        modelo = scannerStr.nextLine();
        System.out.print("Año: ");
        anio = scannerNum.nextInt();
        System.out.print("Color: ");
        color = scannerStr.nextLine();
        gc.agregarCoche(new coche( marca, modelo, anio, color));
        System.out.println("\nCoche agregado con exito.......!");
        pausa();
    }
    private static void cabeceraListarCoches() {
        // Salida de datos con variable local
        System.out.println("\n\n          Listado de Coches");
        System.out.println("============================================================");
        System.out.println("ID  Marca                 Modelo          Año   Color");
        System.out.println("============================================================");
    }

    private static void pausa() {
        System.out.println();
        System.out.println("Presione ENTER para continuar...");
        scannerStr.nextLine();
    }
    private static void mostrarCoches() {
        cabeceraListarCoches();
        for (coche c : gc.listarCoches()) {
            System.out.println(c.toStr());
        }
        pausa();
    }
    private static void  mocearCoches() {
        gc.agregarCoche(new coche("Toyota", "Corolla", 2018, "Azul"));
        gc.agregarCoche(new coche("Honda", "Civic", 2019, "Negro"));
        gc.agregarCoche(new coche("Chevrolet", "Camaro", 2020, "Amarillo"));
        gc.agregarCoche(new coche("Nissan", "Sentra", 2021, "Blanco"));
        gc.agregarCoche(new coche("Volkswagen", "Golf", 2017, "Verde"));
        gc.agregarCoche(new coche("BMW", "Serie 3", 2022, "Gris"));
        gc.agregarCoche(new coche("Audi", "A4", 2016, "Plata"));
        gc.agregarCoche(new coche("Mercedes-Benz", "Clase C", 2023, "Negro"));
        gc.agregarCoche(new coche("Subaru", "Impreza", 2015, "Rojo"));
        gc.agregarCoche(new coche("Mazda", "3", 2014, "Azul"));
        System.out.println("\n10 registros agrados con exito.......!");
        pausa();
    }
}