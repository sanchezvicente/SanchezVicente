package proyectfecha;


import java.io.*;

/**
 * Esta clase indica si una fecha introducida por teclado por el usuario 
 * es válida o NO es válida
 * @author Vicente Sánchez Renau
 *
 */
public class Fecha {
	private int dia;
	private	int mes;
	private int	anio;
	
	/**
	 * Este método indica si el mes de febrero del año de la fecha introducida es 
	 * bisiesto o no y
	 * @return retorna un valor true si el mes es bisiesto o false si no lo es.
	 */
	private boolean bisiesto(){
		if ( (anio % 400 == 0) || ( (anio % 4 == 0) && (anio % 100 != 0)))
			return true;
		else return false;
			}
	
	/**
	 * Este método resuelve  la cantidad de días que tiene cada mes y
	 * @return retorna el número de días de cada mes 
	 */
	private int diasMes(){
		// determinamos la cantidad de días del mes:
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
			case 2 : // verificación de año bisiesto
				 if (bisiesto())
					diasMes = 29;
				 else
					diasMes = 28;
					break;
		}
		return diasMes;
	}
	
	/**
	 * Este método genera un objeto tipo fecha a traves de los parámetros recibidos
	 * @param dia el parámetro dia es un entero introducido por teclado que indica el día del mes
	 * @param mes el parámetro mes es un entero introducido por teclado que indica el mes del año
	 * @param anio el parámetro anio es un entero introducido por teclado que indica el año 
	 */
	public Fecha(int dia, int mes, int anio) {
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
		}
	
	/**
	 * Este método resuelve si el objeto  fecha recibido es una fecha válida o NO válida y
	 * @return retorna True si la fecha es válida o False si NO el válida
	 */
	public boolean valida ( ) {
		if (dia < 1 || dia > 31) return false;
		if (mes < 1 || mes > 12) return false;
		if (anio < 0) return false;
		if (dia>diasMes()) return false;
		else return true;
		}
		
		/**
		 *Este es el método principal en el que se generan los objetos Fecha 
		 *a traves de de la introducción de los parametros dia,mes y anio por el teclado 
		 * @param args
		 * @throws NumberFormatException
		 * @throws IOException
		 */
	public static void main(String[] args) throws NumberFormatException, IOException  {
		int dia, mes, anyo;
		System.out.println ("Introduce un día: ");
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		dia = Integer.parseInt(entrada.readLine());
		System.out.println ("Introduce un mes: ");
		mes = Integer.parseInt(entrada.readLine());
		System.out.println ("Introduce un año: ");
		anyo = Integer.parseInt(entrada.readLine());
		Fecha f1 = new Fecha(dia,mes,anyo);
		if (f1.valida())
		System.out.println("La fecha: "+dia+"/"+mes+"/"+anyo+" es válida");
		else
		System.out.println("La fecha: "+dia+"/"+mes+"/"+anyo+"	NO es válida");
	}
}
