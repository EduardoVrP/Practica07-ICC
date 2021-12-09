//ENCABEZADO
/**
 * Clase Operador para el ejercicio 2 de la practica 7 de ICC 2022-1
 *
 * @author Eduardo Vargas Perez
 * @version 1.0
 **/
public class Operador extends Empleado{
    //CUERPO
    //Estructura, la misma que la clase empleado
    
    //Comportamiento
    //Constructores
    /**
     * Constructor con parametros. Crea un Operador con el nombre indicado
     * 
     * @param nom El nombre del Operador
     **/
    public Operador(String nom){
	super(nom);
    }

    /**
     * Constructor por omision. Crea un Operador llamado Eduardo Vargas
     **/
    public Operador(){
	super("Eduardo Vargas");
    }

    //Metodo toString
    /**
     * Metodo toString. Devuelve el nombre del Operador
     *
     * @return Operador: "Nombre"
     **/
    @Override
    public String toString(){
	return "Operador: " + this.nombre;
    }
}
