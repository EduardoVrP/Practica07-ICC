/**
 * Clase para probar las demas clases del ejercicio 2
 *
 * @author Eduardo Vargas Pérez 
 * @version 1.0
 **/
public class MainH{
    /**
     * Metodo main para probar
     * 
     * @param args Los argumentos
     **/
    public static void main(String[] args){
	//Objetos de las distintas clases, los necesarios para probar los constructores
	Empleado e = new Empleado();
	Operador op = new Operador();
	Directivo d = new Directivo();
	Directivo jefazo = new Directivo("Jefazo");
	Oficial of = new Oficial();
	Tecnico t = new Tecnico();

	//Imprimire uno por uno cada objeto
	System.out.println("\t***Programa para ilustrar las clases hechas***");
	System.out.println(e);
	System.out.println(op);
	System.out.println(d);
	System.out.println(jefazo);
	System.out.println(of + of.trabaja());
	System.out.println(t + t.trabaja());
    }
}
