package com.example.project;

import java.util.Scanner;

public class Exercise1 {

	public static void main(final String[] args) {

		Exercise1 obj = new Exercise1();
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese su numero");
		while (true) {
			int n = 25;
			System.out.println(obj.esCuadradoPerfecto(n));			
		}
	}

	public boolean esCuadradoPerfecto(int numero) {
		int i=2;
		if(numero==1) return true;
		if(numero==0) return false;
		if(i*i==numero) return true;
		if(i*i!=numero) {
			boolean ver=verificar(numero,i);
			if(ver==true) return true;
		}
		System.out.println("sali");
		return false;
	}
	public boolean verificar(int numero,int i) {
		i++;
		System.out.println("i:"+i);
		if(i*i==numero) {
			System.out.println("si entre");return true; 
		}
		else if(i*i<numero) {
			verificar(numero, i);
		}
		System.out.println("si");
		return false;
		
	}
}

