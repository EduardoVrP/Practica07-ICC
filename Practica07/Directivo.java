//ENCABEZADO
/**
 * Clase Directivo para el ejercicio 2 de la practica 7 de ICC 2022-1
 *
 * @author Eduardo Vargas Perez
 * @version 1.0
 **/
public class Directivo extends Empleado{
    //CUERPO
    //Estructura, la misma que la clase empleado
    
    //Comportamiento
    //Constructores
    /**
     * Constructor con parametros. Crea un Directivo con el nombre indicado
     * 
     * @param nom El nombre del Directivo
     **/
    public Directivo(String nom){
	super(nom);
    }

    /**
     * Constructor por omision. Crea un Directivo llamado David Vargas
     **/
    public Directivo(){
	super("David Vargas");
    }

    //Metodo toString
    /**
     * Metodo toString. Devuelve el nombre del Directivo
     *
     * @return Directivo: "Nombre"
     **/
    @Override
    public String toString(){
	return "Directivo: " + this.nombre;
    }
}
