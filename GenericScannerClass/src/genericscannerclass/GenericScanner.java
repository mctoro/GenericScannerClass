/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericscannerclass;

import java.util.Scanner;

/**
 *
 * @author mcorralest
 */
public class GenericScanner {
    
    Scanner sc = new Scanner(System.in);
	
	public static int leerEntero(){
		return new Scanner(System.in).nextInt();
	}
	public static int leerEntero(String mensaje){
		System.out.println(mensaje);
		return leerEntero();
	}

	public static double leerDouble(){
		return new Scanner(System.in).nextInt();
	}
	public static double leerDouble(String mensaje){
		System.out.println(mensaje);
		return leerDouble();
	}

	public static String leerString(){
		return new Scanner(System.in).nextLine();
	}
	public static String leerString(String mensaje){
		System.out.println(mensaje);
		return leerString();
	}
    
}
