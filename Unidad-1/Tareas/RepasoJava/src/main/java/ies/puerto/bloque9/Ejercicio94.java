package ies.puerto.bloque9;

import java.util.Calendar;
import java.util.Scanner;

public class Ejercicio94 {

    //Escribe un programa que, dado un mes y año ingresados por el usuario, calcule y muestre cuántos
    // días faltan hasta el final del mes.

    public static void main(String[] args) {

        ingresarDatos();
    }

    public static void ingresarDatos() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Dame el mes: ");
        int mes = sc.nextInt();

        System.out.println("Dame el año: ");
        int anio=sc.nextInt();


        calcularDiasHastaFinDeMes(mes,anio);

    }

    public static void calcularDiasHastaFinDeMes(int mes, int anio) {

        Calendar calendar = Calendar.getInstance();

        calendar.set(anio, mes - 1, 1);

        int ultimoDiaMes = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        int diaActual = calendar.get(Calendar.DAY_OF_MONTH);
        int diasRestantes = ultimoDiaMes - diaActual;

        System.out.println("Faltan " + diasRestantes + " días hasta el final del mes.");
    }

}
