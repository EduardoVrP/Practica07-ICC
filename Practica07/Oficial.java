//ENCABEZADO
/**
 * Clase Oficial para el ejercicio 2 de la practica 7 de ICC 2022-1
 *
 * @author Eduardo Vargas Perez
 * @version 1.0
 **/
public class Oficial extends Operador{
    //CUERPO
    //Estructura, la misma que la clase operador
    
    //Comportamiento
    //Constructores
    /**
     * Constructor con parametros. Crea un Oficial con el nombre indicado
     * 
     * @param nom El nombre del Oficial
     **/
    public Oficial(String nom){
	super(nom);
    }

    /**
     * Constructor por omision. Crea un Oficial llamado Juanito Perez
     **/
    public Oficial(){
	super("Juanito Perez");
    }
    //Metodo trabaja
    /**
     * Método trabaja. El Oficial dice que esta trabajando
     *
     * @return Un mensaje simbolico de que esta trabajando
     **/
    public String trabaja(){
	return "\tEstoy trabajando";
    }
    
    //Metodo toString
    /**
     * Metodo toString. Devuelve el nombre del Oficial
     *
     * @return Oficial: "Nombre"
     **/
    @Override
    public String toString(){
	return "Oficial: " + this.nombre;
    }
}
