package src2.tareas;

import libs.Input;

public class InicialesFacil {

	public static void main(String[] args) {
		String name, initials;
		System.out.print("Ingrese su nombre completo:");
		//Input.get_string solo está tomando la cadena hasta el espacio.
		name=Input.get_line();
		initials=getInitials(name);
		System.out.print("Sus iniciales son:"+initials);
	}

	private static String getInitials(String name) {
		String initS="";	
		for (int i = 0, n = name.length(); i < n; i++)
        {   //validación para el primer caracter despues de un espacio o tabulador.
			if (name.charAt(i)==' ' || name.charAt(i)=='\t') {
        		if (name.charAt(i+1) >= 'A' && name.charAt(i+1) <= 'Z') {
        			initS+=name.charAt(i+1); 
        			i++;
        		}
            }else 
            {//validación de cualquier caracter
            	if (name.charAt(i) >= 'A' && name.charAt(i) <= 'Z') {
            		initS+=name.charAt(i);
            	}
            }
        }		
        return initS;
	}

}
