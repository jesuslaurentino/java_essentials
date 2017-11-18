package src1.tareas;

import libs.Input;

public class MarioDificil {

	public static void main(String[] args) {
		

		System.out.print("Altura: ");
		int altura = Input.get_int();
		ladderUp(altura);

	}
	
	public static void ladderUp(int Alt){
		int l=Alt-1;
		int m=1;
		
		for (int i=1;i<=Alt;i++) {
			for (int j=1;j<=l;j++) {
			System.out.print(" ");
			}
			for (int k=1;k<=m;k++) {
				System.out.print("#");
			}
			System.out.print("  ");
			ladderDown(m);
			l--;
			m++;
		}
	}
	
	public static void ladderDown(int m2) {
		for (int k=1;k<=m2;k++) {
			System.out.print("#");
		}
		System.out.print("\n");
	}
}
