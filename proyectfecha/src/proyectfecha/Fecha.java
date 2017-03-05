package proyectfecha;


import java.io.*;

/**
 * Esta clase indica si una fecha introducida por teclado por el usuario 
 * es v�lida o NO es v�lida
 * @author Vicente S�nchez Renau
 *
 */
public class Fecha {
	private int dia;
	private	int mes;
	private int	anio;
	
	/**
	 * Este m�todo indica si el mes de febrero del a�o de la fecha introducida es 
	 * bisiesto o no y
	 * @return retorna un valor true si el mes es bisiesto o false si no lo es.
	 */
	private boolean bisiesto(){
		if ( (anio % 400 == 0) || ( (anio % 4 == 0) && (anio % 100 != 0)))
			return true;
		else return false;
			}
	
	/**
	 * Este m�todo resuelve  la cantidad de d�as que tiene cada mes y
	 * @return retorna el n�mero de d�as de cada mes 
	 */
	private int diasMes(){
		// determinamos la cantidad de d�as del mes:
		int diasMes = 0;
		switch (mes) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12: diasMes = 31;
			break;
			case 4:
			case 6:
			case 9:
			case 11 : diasMes = 30;
			break;
			case 2 : // verificaci�n de a�o bisiesto
				 if (bisiesto())
					diasMes = 29;
				 else
					diasMes = 28;
					break;
		}
		return diasMes;
	}
	
	/**
	 * Este m�todo genera un objeto tipo fecha a traves de los par�metros recibidos
	 * @param dia el par�metro dia es un entero introducido por teclado que indica el d�a del mes
	 * @param mes el par�metro mes es un entero introducido por teclado que indica el mes del a�o
	 * @param anio el par�metro anio es un entero introducido por teclado que indica el a�o 
	 */
	public Fecha(int dia, int mes, int anio) {
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
		}
	
	/**
	 * Este m�todo resuelve si el objeto  fecha recibido es una fecha v�lida o NO v�lida y
	 * @return retorna True si la fecha es v�lida o False si NO el v�lida
	 */
	public boolean valida ( ) {
		if (dia < 1 || dia > 31) return false;
		if (mes < 1 || mes > 12) return false;
		if (anio < 0) return false;
		if (dia>diasMes()) return false;
		else return true;
		}
		
		/**
		 *Este es el m�todo principal en el que se generan los objetos Fecha 
		 *a traves de de la introducci�n de los parametros dia,mes y anio por el teclado 
		 * @param args
		 * @throws NumberFormatException
		 * @throws IOException
		 */
	public static void main(String[] args) throws NumberFormatException, IOException  {
		int dia, mes, anyo;
		System.out.println ("Introduce un d�a: ");
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		dia = Integer.parseInt(entrada.readLine());
		System.out.println ("Introduce un mes: ");
		mes = Integer.parseInt(entrada.readLine());
		System.out.println ("Introduce un a�o: ");
		anyo = Integer.parseInt(entrada.readLine());
		Fecha f1 = new Fecha(dia,mes,anyo);
		if (f1.valida())
		System.out.println("La fecha: "+dia+"/"+mes+"/"+anyo+" es v�lida");
		else
		System.out.println("La fecha: "+dia+"/"+mes+"/"+anyo+"	NO es v�lida");
	}
}
