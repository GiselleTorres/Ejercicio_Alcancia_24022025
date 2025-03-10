package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a=0,b=0,c=0,d=0,e=0,f=0,g=0,h=0,i=0,j=0,k=0,l=0,m=0,n=0,o=0,p=0,q=0,r=0,s=0;
        int t=0,u=0,v=0,w=0,x=0,y=0,z=0;
        do {
            System.out.println("Bienvenido al puesto de votacion de nuestro municipio PREMIER");
            System.out.println("A continuacion te presentamos las opciones que puedes elegir");
            System.out.println("*******************************************************");
            System.out.println("* 1.Registrar voto a un candidato                     *");
            System.out.println("* 2.Calcular el costo de la campaña de cada candidato *");
            System.out.println("* 3.Vaciar urnas de votacion                          *");
            System.out.println("* 4.Calcular numero total de votos                    *");
            System.out.println("* 5.Porcentaje de votos obtenidos por cada candidato  *");
            System.out.println("* 6.Costo promedio de las campañas                    *");
            System.out.println("*******************************************************");

            Scanner teclado = new Scanner(System.in);
            a= teclado.nextInt();
            switch (a) {
                case 1:
                    System.out.println("*****************************************");
                    System.out.println("* Escoge por cual candidato vas a votar *");
                    System.out.println("* 1.Candidato 1                         *");
                    System.out.println("* 2.Candidato 2                         *");
                    System.out.println("* 3.Candidato 3                         *");
                    System.out.println("*****************************************");
                    b = teclado.nextInt();
                    switch (b) {
                        case 1:
                            System.out.println("*********************************************************");
                            System.out.println("* Escoge la opcion por la cual fue influenciado tu voto *");
                            System.out.println("* 1.Internet                                            *");
                            System.out.println("* 2.Radio                                               *");
                            System.out.println("* 3.Television                                          *");
                            System.out.println("*********************************************************");
                            c = teclado.nextInt();
                            switch (c) {
                                case 1:
                                    d++;
                                    break;
                                case 2:
                                    e++;
                                    break;
                                case 3:
                                    f++;
                                    break;
                            }
                            break;
                        case 2:
                            System.out.println("*********************************************************");
                            System.out.println("* Escoge la opcion por la cual fue influenciado tu voto *");
                            System.out.println("* 1.Internet                                            *");
                            System.out.println("* 2.Radio                                               *");
                            System.out.println("* 3.Television                                          *");
                            System.out.println("*********************************************************");
                            g = teclado.nextInt();
                            switch (g) {
                                case 1:
                                    h++;
                                    break;
                                case 2:
                                    i++;
                                    break;
                                case 3:
                                    j++;
                                    break;
                            }
                            break;
                        case 3:
                            System.out.println("*********************************************************");
                            System.out.println("* Escoge la opcion por la cual fue influenciado tu voto *");
                            System.out.println("* 1.Internet                                            *");
                            System.out.println("* 2.Radio                                               *");
                            System.out.println("* 3.Television                                          *");
                            System.out.println("*********************************************************");
                            k = teclado.nextInt();
                            switch (k) {
                                case 1:
                                    l++;
                                    break;
                                case 2:
                                    m++;
                                    break;
                                case 3:
                                    n++;
                                    break;
                            }
                            break;
                    }
                    break;
                case 2:
                    //Candidato 1
                    o=(d*700000)+(e*200000)+(f*600000);
                    System.out.println("La campaña de candidato numero 1 valio : $"+ o);

                    //Candidato 2
                    p=(h*700000)+(i*200000)+(j*600000);
                    System.out.println("La campaña de candidato numero 2 valio : $"+ p);

                    //Candidato 3
                    q=(l*700000)+(m*200000)+(n*600000);
                    System.out.println("La campaña de candidato numero 3 valio : $"+ q);
                    break;
                case 3:
                    a=0; b=0; c=0; d=0; e=0; f=0; g=0; h=0; i=0; j=0; k=0; l=0; m=0; n=0;
                    o=0; p=0; q=0; r=0; s=0; t=0; u=0; v=0; w=0; x=0; y=0; z=0;
                    System.out.println("Se reiniciaron los votos");
                    break;
                case 4:
                    r=d+e+f+h+i+j+l+m+n;
                    System.out.println("El numero total de votos es de: "+ r);
                    break;
                case 5:
                    r=d+e+f+h+i+j+l+m+n;
                    //candidato 1
                    s=((d+e+f)/r)*100;
                    System.out.print("El porcentaje de votos del candidato 1 es: " + s+"%");
                    //candidato 1
                    t=((j+i+h)/r)*100;
                    System.out.print("El porcentaje de votos del candidato 2 es: " + t+"%");
                    //candidato 1
                    u=((l+m+n)/r)*100;
                    System.out.print("El porcentaje de votos del candidato 3 es: " + u+"%");
                    break;
                case 6:
                    break;
            }
        }while (a!=5);
    }
}

/*Desarrollar un software que permita escoger el representante del municipio “Premier”.
 Para tal cargo se han postulado tres candidatos, los cuales han realizado una intensa
 campaña publicitaria utilizando los principales medios de comunicación (Internet, radio,
 y televisión). Se desea conocer el costo de la campaña calculando el retorno de la inversión
 realizada en publicidad. Para esto, se determinaron los siguientes valores dependiendo del
 medio que influenció al votante:


•	Voto influenciado por publicidad en Internet: $700000
•	Voto influenciado por publicidad en radio: $200000
•	Voto influenciado por publicidad en televisión: $600000

Lo anterior quiere decir que, por cada voto que reciba un candidato influenciado por
publicidad en Internet, su costo de campaña se incrementara en $700000, del mismo modo por
cada voto influenciado por publicidad en radio, su costo de campaña se incrementara en $200000,
y finalmente, por cada voto influenciado por publicidad en televisión, su costo de campaña se
incrementar en $600000.

Las elecciones para representante del municipio “Premier” requieren una aplicación que les
permita:
1.	Votar por el candidato de su elección.
2.	Calcular el costo de campaña de un candidato dependiendo de la influencia publicitaria
de cada voto.
3.	Vaciar todas las urnas de la votación.
4.	Conocer el número total de votos.
5.	Porcentaje de votos obtenidos por cada candidato.
6.	Costo promedio de campaña en las elecciones*/