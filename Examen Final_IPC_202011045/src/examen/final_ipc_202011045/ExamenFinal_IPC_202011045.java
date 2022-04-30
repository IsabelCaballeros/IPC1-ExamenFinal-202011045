package examen.final_ipc_202011045;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExamenFinal_IPC_202011045 {

    static Scanner escaner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion, opcion2;
        while (!salir) {
            System.out.println("---MENÚ PRINCIPAL---");
            System.out.println("1. Problema 1");
            System.out.println("2. Problema 2");
            System.out.println("3. Problema 3");
            System.out.println("4. Salir");

            try {
                System.out.println("Ingrese una opción");
                opcion = sn.nextInt();

                switch (opcion) {
                    case 1:

                        System.out.println("Ingrese 2 números para compararlos");
                        Scanner leer = new Scanner(System.in);
                        int x,
                         y;
                        x = leer.nextInt();
                        y = leer.nextInt();
                        if (x > y) {
                            System.out.println(x + " es mayor que " + y);
                        } else {
                            System.out.println(y + " es mayor que " + x);
                        }

                        break;
                    case 2:
                        System.out.println("Opción 2");
                        Problema2();
                        break;
                    case 3:
                        System.out.println("--CÁLCULO DE LITROS DE LECHE--");
                        System.out.println("1. 8 vacas");
                        System.out.println("2. 10 vacas");
                        System.out.println("Seleccione una de las siguientes opciones");
                        opcion2 = sn.nextInt();
                        switch (opcion2) {
                            case 1:
                                int kg8[]={223,243,100,200,200,155,300,150};
                                int litros8[]={30,34,28,45,31,50,29,1};
                                int i,j,aux;
                                for (i=0;i<8;i++){
                                    for(j=0;j<8;j++){
                                        if(litros8[j]>litros8[j+1]){
                                            aux = litros8[j];
                                            litros8[j]=litros8[j+1];
                                            litros8[j+1]=aux;
                                        }
                                    }
                                }
                                for(i=7;i>=0;i--){
                                    System.out.println(litros8[i]+" ");
                                }
                                break;
                            case 2:
                                int kg10[]={340,355,223,243,130,240,260,155,302,130};
                                int litros10[]={45,50,34,39,29,40,30,52,31,1};
                                System.out.println("10 vacas");
                                break;
                            default:
                                System.out.println("Ingrese una opción correcta");

                        }
                        break;
                    case 4:
                        salir = true;
                        break;
                    default:
                        System.out.println("Ingrese una opción correcta");

                }

            } catch (InputMismatchException e) {
                System.out.println("Ingrese un valor numérico");
                sn.next();
            }
        }
    }

    public static void Problema2() {
        System.out.println("Ingrese un numero impar");
        int numero = escaner.nextInt();
        int rompedor = numero - 1;
        boolean rompeciclo = false;
        if (esPar(numero)) {
            System.out.println("El numero es par, intente otra vez");
            Problema2();
        } else {
            while (rompeciclo == false) {
                for (int i = 0; i < numero; ++i) {

                    System.out.println();

                    for (int j = 0; j < numero - i - 1; ++j) {
                        System.out.print(" ");
                    }
                    for (int j = 0; j < 2 * i + 1; ++j) {
                        System.out.print("*");
                        if (j == rompedor) {
                            System.out.println("");
                            System.exit(0);
                        }
                }
                }
                System.out.println();
                if (rompeciclo == true) {
                    System.out.println(" ");
                }
            }
        }
    }

    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }

}
