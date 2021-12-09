//ENCABEZADO
/**
 * Clase Tecnico para el ejercicio 2 de la practica 7 de ICC 2022-1
 *
 * @author Eduardo Vargas Perez
 * @version 1.0
 **/
public class Tecnico extends Operador{
    //CUERPO
    //Estructura, la misma que la clase operador
    
    //Comportamiento
    //Constructores
    /**
     * Constructor con parametros. Crea un Tecnico con el nombre indicado
     * 
     * @param nom El nombre del Tecnico
     **/
    public Tecnico(String nom){
	super(nom);
    }

    /**
     * Constructor por omision. Crea un Tecnico llamado El mencho
     **/
    public Tecnico(){
	super("El mencho");
    }
    //Metodo trabaja
    /**
     * Método trabaja. El Tecnico dice que esta trabajando
     *
     * @return Un mensaje simbolico de que esta trabajando
     **/
    public String trabaja(){
	return "\tEstoy trabajando";
    }
    
    //Metodo toString
    /**
     * Metodo toString. Devuelve el nombre del Tecnico
     *
     * @return Tecnico: "Nombre"
     **/
    @Override
    public String toString(){
	return "Tecnico: " + this.nombre;
    }
}
