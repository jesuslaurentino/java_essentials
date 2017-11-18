package src2.tareas;

import libs.Input;

public class InicialesDificil {

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
        {   if (i>0) {
        		if ((name.charAt(i) >= 'A' && name.charAt(i) <= 'Z')||(name.charAt(i) >= 'a' && name.charAt(i) <= 'z')){
        			if ((name.charAt(i-1) < 'A' || name.charAt(i-1) > 'z')) {//esto no valida los caracteres del 91 al 96 ([ is 91, \ is 92, ] is 93,^ is 94,_ is 95,` is 96)
        				initS+=name.charAt(i);
        			}        			
        		}
        	}
        	else {
        		if ((name.charAt(i) >= 'A' && name.charAt(i) <= 'Z')||(name.charAt(i) >= 'a' && name.charAt(i) <= 'z')){
        			initS+=name.charAt(i);
        		}
        	}
        		
        }		
        return initS.toUpperCase();
	}

}
