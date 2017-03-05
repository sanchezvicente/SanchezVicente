package proyectfecha;

import junit.framework.TestCase;

public class PruebasFecha extends TestCase {
	Fecha Fecha1 = new Fecha(1,1,91);
	Fecha Fecha2 = new Fecha(43,1,91);
	Fecha Fecha3 = new Fecha(1,41,91);
	Fecha Fecha4 = new Fecha(1,1,-91);
	
	public void testfecha(){
	assertEquals(Fecha1.valida(),true);
	assertEquals(Fecha2.valida(),false);
	assertEquals(Fecha3.valida(),false);
	assertEquals(Fecha4.valida(),false);
}
}
