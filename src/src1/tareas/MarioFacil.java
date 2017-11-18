package src1.tareas;

import libs.Input;

public class MarioFacil {

	public static void main(String[] args) {
		
		System.out.print("Altura: ");
		int altura = Input.get_int();
		int l=altura-1;
		int m=2;
		
		for (int i=1;i<=altura;i++) {
			for (int j=1;j<=l;j++) {
			System.out.print(" ");
			}
			for (int k=1;k<=m;k++) {
				System.out.print("#");
			}
			System.out.print("\n");
			l--;
			m++;
		}
	}
}