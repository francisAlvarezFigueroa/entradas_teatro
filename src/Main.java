import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int opc;
        int opcContinuar;
        int ubicacion;
        int edad;
        String continuar;


        // mensaje de bienvenida

        System.out.println("Bienvenido al sistema de gestión de entradas del Teatro Moro");

        //  do{

        // menu principal
        do{
            System.out.println("Ingrese la opción de la acción que desea ejecutar");
            System.out.println("Opción 1: Comprar entrada");
            System.out.println("Opción 2: Salir");
            opc=scan.nextInt();

            //validar que la asistencia sea incorrecta
            if(opc!=1 && opc!=2){
                System.out.println("Opción inválida, intente nuevamente");
            }else if(opc==2){
                System.out.println("Saliendo del programa...");
                break;
            }
        }while(opc!=1 && opc!=2);

        if(opc==1) {

            //comprar entrada
            do {

                do {
                    // menu ubicación asiento
                    System.out.println("Estas son las zonas disponibles: ");
                    System.out.println("Ingrese la opción de la zona que desea seleccionar:");
                    System.out.println("Opción 1: Zona A. Precio entrada: $20.000");
                    System.out.println("Opción 2: Zona B. Precio entrada: $15.000");
                    System.out.println("Opción 3: Zona C. Precio entrada: $10.000");
                    // scan.nextLine(); // limpiar el buffer
                    ubicacion = scan.nextInt();

                    if (ubicacion < 1 || ubicacion > 3) {
                        System.out.println("Opción inválida, intente nuevamente");
                    }
                }while(ubicacion < 1 || ubicacion > 3);


                System.out.println("Ingrese su edad en números:");
                scan.nextLine(); //limpiar el buffer
                edad = scan.nextInt();

                switch (ubicacion) {

                    case 1:
                        EntradaZonaA entradaZonaA = new EntradaZonaA("Zona A", 20000);
                        C
                        break;
                    case 2:
                        EntradaZonaB entradaZonaB = new EntradaZonaB(EntradaZonaB.getNombreZona(), EntradaZonaB.getPrecioEntrada());
                        entradaZonaB.seleccionarTarifaCorrecta(entradaZonaB,edad);
                        break;
                    case 3:
                        EntradaZonaC entradaZonaC = new EntradaZonaC(EntradaZonaC.getNombreZona(), EntradaZonaC.getPrecioEntrada());
                        entradaZonaC.seleccionarTarifaCorrecta(entradaZonaC,edad);
                        break;
                }
                //repetir sistema o comprar entrada
                System.out.println("¿Qué desea hacer?: Ingrese su opción");
                System.out.println("Opción 1: Finalizar compra");
                System.out.println("Opción 2: Comprar otra entrada");
                System.out.println("Opción 3: Salir");
                scan.nextLine(); //limpiar el buffer
                opcContinuar = scan.nextInt();

            } while (opcContinuar==2);

            if(opcContinuar==3){
                System.out.println("Saliendo...");
            }

            do{
                System.out.println("Total a pagar es:");


            }while(opcContinuar==1);

        }

        //}while();
        System.out.println("Programa finalizado. Gracias por visitar Teatro Moro");
        // scan.close();
    }
}