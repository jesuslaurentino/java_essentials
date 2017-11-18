package src1.tareas;

import libs.Input;

public class BotellasAgua {

	public static void main(String[] args) {
	int mins;
		do{
			System.out.print("Minutos: ");
			mins = Input.get_int();
			if (mins>=0) {
				int botellas = mins * 12;
				System.out.print("Botellas: "+botellas);
			}
			else System.out.print("Numero de minutos debe ser positivo.\n");
		}while(mins<0);
	

	}
	
}