/**
 * Autor kodu: Sewery Adamczyk
 * Pochodzenie: http://pl.spoj.com/problems/KC001/
 */

import java.util.*;

public class Main {

	public static void main(String[] args) 
	{
		Scanner liczba = new Scanner(System.in);
		int suma=0;
		for(int i=0;i<3;i++)
		{
			int n = liczba.nextInt();
			suma += n;
		}
		System.out.println(suma);
		liczba.close();

	}

}
