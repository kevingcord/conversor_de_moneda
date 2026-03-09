package principal;

import modelos.Conversor;
import servicios.ConsultaMoneda;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);

        ConsultaMoneda consulta = new ConsultaMoneda();

        String json = consulta.obtenerDatos();

        Conversor conversor = new Conversor(json);

        int opcion = 0;

        while (opcion != 7) {

            System.out.println("""
                    
                    ***********************************
                    Sea bienvenido/a al Conversor de Moneda
                    
                    1) USD -> ARS
                    2) ARS -> USD
                    3) USD -> BRL
                    4) BRL -> USD
                    5) USD -> COP
                    6) COP -> USD
                    7) Salir
                    
                    Elija una opción válida
                    ***********************************
                    """);

            opcion = lectura.nextInt();

            if (opcion == 7) {
                break;
            }

            System.out.println("Ingrese el valor que desea convertir:");

            double valor = lectura.nextDouble();

            double resultado = 0;

            switch (opcion) {

                case 1 -> resultado = conversor.convertir("USD", "ARS", valor);
                case 2 -> resultado = conversor.convertir("ARS", "USD", valor);
                case 3 -> resultado = conversor.convertir("USD", "BRL", valor);
                case 4 -> resultado = conversor.convertir("BRL", "USD", valor);
                case 5 -> resultado = conversor.convertir("USD", "COP", valor);
                case 6 -> resultado = conversor.convertir("COP", "USD", valor);
                default -> System.out.println("Opción inválida");

            }

            System.out.println("Valor convertido: " + resultado);
        }

        lectura.close();
    }
}