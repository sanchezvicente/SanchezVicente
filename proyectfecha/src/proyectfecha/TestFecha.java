package proyectfecha;
/**
 * Esta clase es una clase test que genera 4 objetos de la clase Fecha 
 * para determinar si funciona bien o no, dado el hecho de que el primero  es válido 
 * y los otros 3  no son válidos.
 * @author Vicente Sánchez Renau
 *
 */
public class TestFecha {
/**
 * Clase principal para la prueba de la clase Fecha
 * @param args
 */
	public static void main(String[] args) {
		
		Fecha Fecha1 = new Fecha(1,1,91);
		Fecha Fecha2 = new Fecha(43,1,91);
		Fecha Fecha3 = new Fecha(1,41,91);
		Fecha Fecha4 = new Fecha(1,1,-91);
		Fecha1.valida();
		Fecha2.valida();
		Fecha3.valida();
		Fecha4.valida();
		if (Fecha1.valida())
			System.out.println("La fecha: 1-1-91 es válida");
			else
			System.out.println("La fecha: 1-1-91 NO es válida");
		if (Fecha2.valida())
			System.out.println("La fecha: 43-1-91 es válida");
		else
			System.out.println("La fecha: 43-1-91 NO es válida");
		if (Fecha3.valida())
			System.out.println("La fecha: 1-41-91 es válida");
		else
			System.out.println("La fecha: 1-41-91 NO es válida");
		if (Fecha4.valida())
			System.out.println("La fecha: 1-1-(-91) es válida");
		else
			System.out.println("La fecha: 1-1-(-91) NO es válida");
	}
}


