package proyectfecha;

public class TestFecha {

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


