package p4;

import java.util.Scanner;

public class Project {
	public static int sumacifre(int nr) {
		int suma=0;
		while(nr != 0)
		{
			suma+=nr%10;
			nr/=10;
		}
		return suma;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner t = new Scanner(System.in);
		//Se contruieste matricea introducand elementele
		int m,n;
		System.out.println("Nr linii n= " );
		n=t.nextInt();
		System.out.println("Nr coloane m= ");
		m=t.nextInt();
		
		int matrice[][] = new int [n][m];
		for(int i=0; i<matrice.length; i++)
		{
			for(int j=0; j<matrice[i].length; j++)
			{
				System.out.println("matrice["+i+"]["+j+"]=");
				matrice[i][j]=t.nextInt();
			}
		}
		for(int i=0; i<matrice.length; i++)
		{
			for(int j=0; j<matrice[i].length; j++)
			{
				System.out.print(matrice[i][j]+" ");
			}
			System.out.println();
		}
		
		//se cere un numar k mai mic decat nr de coloane
		int k;
		System.out.println("k=");
		k=t.nextInt();
		while(k<0 || k>m)
		{
			System.out.println("k nu este compatibil. Introduceti alt k: ");
			k=t.nextInt();
		}
		int contor;
		
		for(int i =0; i<matrice.length; i++)
		{
			contor=0;
		
			for(int j=0; j<matrice[i].length; j++)
			{
				if(matrice[i][j]==0)
					contor++;
			}
			if(contor==k)
				System.out.println("Linia " +i+ " are " +k+ " elemente nule");
		}
		
		//suma cifrelor maximului de pe randul i
		int[] tab = new int[m];
		int max;
		for(int i=0; i<matrice.length; i++)
		{
			max=matrice[i][0];
			for(int j=1; j<matrice[i].length; j++)
			{
				if(matrice[i][j] > max)
					max = matrice[i][j];
			}
		   System.out.println("Suma cifrelor maximului de pe randul "+i+ " : " +sumacifre(max)); 
		}
		

	}

}
