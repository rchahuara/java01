package com.senati.clase01;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Realizar un ejercicio que intercambie el valor de dos variables, es decir crearemos e inicializaremos la variable x igual 5 y la variable y a 2. Cuando finalice el programa y deberá contener 5 y x contendrá 2.
		int x =5; //Declarando y dando un valor
		int y =2; //Declarando y dando un valor
		int aux = 0;
		//Proceso
		aux = x;
		x = y;
		y = aux;
		//Salida
		System.out.println(x);
		System.out.println(y);
				
	}

}
