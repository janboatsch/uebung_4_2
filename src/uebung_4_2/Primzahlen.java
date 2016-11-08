package uebung_4_2;



public class Primzahlen 
{
	public static boolean isPrimzahl (int testzahl)
	{
		boolean prim=true;
		
		for (int i=2; i < testzahl; i++ )
		{
			double m=0;
			
			m=testzahl%i;
			
			if (m==0)
			{
				prim=false;
			}
			else
			{
				
			}
		}
		
		return prim;
		
	}
	
	public static int ermittelAnzahlPrimzahlen (int untereGrenze, int obereGrenze)
	
	{
		int b=0;
		
		for (int n=untereGrenze; n<=obereGrenze; n++)
		{
			int isteseineprimzahl=n;
			boolean ergebnis = isPrimzahl(isteseineprimzahl);
			
			if (ergebnis==true)
			{
				b++;
			}
		}
		
		System.out.println(b);
		
		return b;
			
	}
	
	public static void main(String[] args)
	
	{
		int c =3;
		int d=500;
				
		ermittelAnzahlPrimzahlen(c,d);
		
		/*int a=0;
		
		for (int n=2; n<10001; n++)
		{
			int isteseineprimzahl=n;
			boolean ergebnis = isPrimzahl(isteseineprimzahl);
			
			if (ergebnis==true)
			{
				a++;
			}
			
			System.out.println(n + " ist eine Primzahl? " + ergebnis);
			System.out.println("Es sind "+a+" Primzahlen");
			
			double anteil= a/100;
			
			System.out.println("Das sind "+anteil+"%");
			*/
			
			
		}
		
		
		
		
	}

