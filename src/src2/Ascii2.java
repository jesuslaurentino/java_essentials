package src2;

import libs.Input;

public class Ascii2 {

	public static void main(String[] args) {
		for (char c = 90; c <= 97; c++)
	    {
	        Input.print(c + " is " + (int) c + "\n" );
	    }

	}

}