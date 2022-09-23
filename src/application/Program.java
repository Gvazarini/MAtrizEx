package application;

import java.util.Locale;
import java.util.Scanner;

import javax.net.ssl.SSLContext;

public class Program {

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int n = sc.nextInt();
		
		int[] [] mat = new int [n][n];
		
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < n; j++) 
			{
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Diagonal princiapl: ");
		for( int i =0; i<n; i++)
		{
			System.out.print(mat[i][i] + " ");
		}
		
		System.out.println();
		
		int count = 0;
		
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < n; j++) 
			{
				if(mat[i][j] < 0)
				{
					count++;
				}
			}
		}
		
		System.out.print("Existem " + count + " numeros negativos na matriz.");
		
		sc.close();
		
	}
}
