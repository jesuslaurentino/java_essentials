package src1.tareas;

import libs.Input;

public class MinimoMonedas {
    
	public static int monedas;
	public static float resto;
	
	public static void main(String[] args) {
		
		System.out.println("=====Cambio con el minimo de monedas===== \nMonedas disponibles: 10¢, 20¢, 50¢, $1, $2, $5, $10, $20");
		System.out.println("¿Cuánto te debo de cambio?");
		float cambioTotal = Input.get_float();
		setCambio(cambioTotal);
		while (resto >= 0.1) { 
			setCambio(resto);
		}
		
		System.out.println("Gracias por su redondeo "+Math.round(resto*100)+"¢ ;-)");
	}	
	
	public static void setCambio(float cambio) {	
		if(((int) (cambio/20)) > 0 ) {
			getCambio(cambio,20);
			System.out.print(monedas+" moneda(s) de $20\n");
		}else if (((int) (cambio/10)) > 0 ) {
			getCambio(cambio,10);
			System.out.print(monedas+" moneda(s) de $10\n");
		}else if (((int) (cambio/5)) > 0 ) {
			getCambio(cambio,5);
			System.out.print(monedas+" moneda(s) de $5\n");
		}else if (((int) (cambio/2)) > 0 ) {
			getCambio(cambio,2);
			System.out.print(monedas+" moneda(s) de $2\n");
		}else if (((int) (cambio/1)) > 0 ) {
			getCambio(cambio,1);
			System.out.print(monedas+" moneda(s) de $1\n");
		}else if (((int) (cambio/0.5)) > 0 ) {
			getCambio(cambio,(float) 0.5);
			System.out.print(monedas+" moneda(s) de 50¢\n");
		}else if (((int) (cambio/0.2)) > 0 ) {
			getCambio(cambio,(float) 0.2);
			System.out.print(monedas+" moneda(s) de 20¢\n");
		}else if (((int) (cambio/0.1)) > 0 ) {
			getCambio(cambio,(float) 0.1);
			System.out.print(monedas+" moneda(s) de 10¢\n");
		}
	}
	
	public static void getCambio(float cambioF,float valorMoneda) {
		monedas = (int) (cambioF / valorMoneda);
		resto = cambioF % valorMoneda;
	}

}
