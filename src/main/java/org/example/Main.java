package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a = 20;
        int b = 50;
        int c = 100;
        int d = 200;
        int e = 500;
        int x=0, f=0, g=0, h = 0, i = 0, j = 0, k = 0, l = 0, m = 0, n = 0, o = 0, p = 0, q = 0;
        do {
            System.out.println("Holaa! soy tu marranito, por favor selecciona " +
                    "la opcion que deseas realizar en el siguiente menu ");
            System.out.println("*********************************************");
            System.out.println("* 1.Agregar una moneda                      *");
            System.out.println("* 2.Saber cuantas monedas tengo de cada una *");
            System.out.println("* 3.Calcular el total ahorrado              *");
            System.out.println("* 4.Vaciar el contenido                     *");
            System.out.println("*********************************************");


            Scanner teclado = new Scanner(System.in);
            x = teclado.nextInt();
            switch (x) {
                case 1:
                    System.out.println("*******************************************************");
                    System.out.println("* Solo podemos ingresar las siguientes denominaciones *");
                    System.out.println("* 1.$20                                               *");
                    System.out.println("* 2.$50                                               *");
                    System.out.println("* 3.$100                                              *");
                    System.out.println("* 4.$200                                              *");
                    System.out.println("* 5.$500                                              *");
                    System.out.println("*******************************************************");
                    f = teclado.nextInt();
                    switch (f) {
                        case 1:
                            System.out.println("Usted eligio la moneda de " + a);
                            System.out.println("Ahora dime cuantas monedas de esta denominacion vas a " +
                                    "ingresar");
                            h = teclado.nextInt();

                            i = a * h;
                            System.out.println("usted ingreso " + g + " monedas de" + a);
                            System.out.println("Las cuales suman " + "$" + i);
                            break;
                        case 2:
                            System.out.println("Usted eligio la moneda de " + b);
                            System.out.println("Ahora dime cuanta monedas de esta denominacion vas a " +
                                    "ingresar");
                            j = teclado.nextInt();

                            k = b * j;
                            System.out.println("usted ingreso " + g + "monedas de" + b);
                            System.out.println("Las cuales suman " + "$" + k);
                            break;
                        case 3:
                            System.out.println("Usted eligio la moneda de " + c);
                            System.out.println("Ahora dime cuanta monedas de esta denominacion vas a " +
                                    "ingresar");
                            l = teclado.nextInt();

                            m = c * l;
                            System.out.println("usted ingreso " + g + "monedas de" + c);
                            System.out.println("Las cuales suman " + "$" + m);
                            break;
                        case 4:
                            System.out.println("Usted eligio la moneda de " + d);
                            System.out.println("Ahora dime cuanta monedas de esta denominacion vas a " +
                                    "ingresar");
                            n= teclado.nextInt();

                            o = d *n;
                            System.out.println("usted ingreso " + g + "monedas de" + d);
                            System.out.println("Las cuales suman " + "$" + o);
                            break;
                        case 5:
                            System.out.println("Usted eligio la moneda de " + e);
                            System.out.println("Ahora dime cuanta monedas de esta denominacion vas a " +
                                    "ingresar");
                            p = teclado.nextInt();

                            q = e * p;
                            System.out.println("usted ingreso " + p + "monedas de" + e);
                            System.out.println("Las cuales suman " + "$" + q);
                            break;
                    }
                    break;
                case 2:
                    System.out.println("tienes "+ h + " monedas de " + a);
                    System.out.println("tienes "+ j + " monedas de " + b);
                    System.out.println("tienes "+ l + " monedas de " + c);
                    System.out.println("tienes "+ n + " monedas de " + d);
                    System.out.println("tienes "+ p + " monedas de " + e);
                    break;
                case 3:
                    int r=0;
                    r=i+k+m+o+q;
                    System.out.println("tienes "+ r + " ahorrados en tu marranito");

                    break;
                case 4:
                    x=0;
                    f=0;
                    g=0;
                    h = 0;
                    i = 0;
                    j = 0;
                    k = 0;
                    l = 0;
                    m = 0;
                    n = 0;
                    o = 0;
                    p = 0;
                    q = 0;
                    break;
            }
        }while (x!=5);
    }
}
//En una alcancía es posible guardar monedas de las siguientes denominaciones: $20, $50, $100,
// $200 y $500, no se guardan ni billetes ni monedas de otras denominaciones. Al dueño de la
// alcancía le parece muy útil conocer cuánto tiene en la alcancía sin necesidad de romperla,
// es más, él quiere conocer cuántas monedas tiene en cada denominación para así romper la
// alcancía sólo cuando quiera disponer de todo su dinero ahorrado.
//Se quiere un programa que ilustre el manejo de la alcancía.
// El programa debe permitir (1) agregar una moneda de una de las denominaciones indicadas,
// (2) contar cuántas monedas tiene de cada denominación, (3) calcular el total de dinero
// ahorrado, (4) romper la alcancía vaciando su contenido
