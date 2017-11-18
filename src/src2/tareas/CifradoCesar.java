package src2.tareas;

import libs.Input;

public class CifradoCesar {

	public static void main(String[] args) {
		int seed=0;
		if(args.length == 2) {
			seed = Integer.parseInt(args[1]);
	    }
	    else {
	    	Input.print("Ingresa índice de desfase: ");
	    	seed = Input.get_int();
	    }
		Input.print("Ingresa mensaje inicial: ");
		String str1 = Input.get_string();
		String strUpper = str1.toUpperCase();
		Input.print("Mensaje inicial ingresado: "+strUpper+"\n");
		Input.print("Mensaje inicial cifrado: ");
		getCipher(strUpper,seed);
	}

	public static void getCipher(String s, int t) {
		if (s != null)
	    {
	        for (int i = 0, n = s.length(); i < n; i++)
	        {
	        	if (s.charAt(i) >= 'A' && s.charAt(i) <= 'M') {
	        	    System.out.print((char)(s.charAt(i)+t)); }
	        	else if (s.charAt(i) + t>'Z'){
	        		//System.out.print((char)(s.charAt(i)));
	        		System.out.print((char)(64 + s.charAt(i) + t - 'Z'));
	        	}
	        }
	        Input.print("\n");
	    }
    }
}
