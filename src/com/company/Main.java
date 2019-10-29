package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Ingrese el Mensaje: ");
        String mensaje  = scanner.nextLine();

        String codigo =CodificarCesar(mensaje);
        String codigo1=codigo;
        codigo = codigo.substring(codigo.length()-1, codigo.length()-1);
        System.out.println(codigo);

        //String frase=DecodificarCesar(cifra);
    }
    public static String CodificarCesar(String mensaje){

        String cifra = "";
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Dime el número de pasos: ");
        int pasos = scanner1.nextInt();
        String num  =Integer.toString(pasos);
        char [] letras = mensaje.toCharArray();


        for(int i=0;i<letras.length;i++)
            cifra += (char)( ((int) letras[i])+pasos) ;
            String codigo=cifra+num;
        return codigo;
    }


}
