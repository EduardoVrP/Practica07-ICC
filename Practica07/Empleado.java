//ENCABEZADO
/**
 * Clase Empleado para el ejercio 2 de la practica 7 de ICC 2022-1
 * 
 * @author Eduardo Vargas Perez 
 * @version 1.0
 **/
public class Empleado{
    //CUERPO
    //Estructura (atributos)

    //Representa el nombre del empleado
    protected String nombre;
    
    //Comportamiento (metodos)
    
    //Constructores
    /**
     * Constructor con parametros. Crea un empleado con el nombre indicado
     *
     * @param nombre El nombre del empleado
     **/
    public Empleado(String nombre){
	this.nombre = nombre;
    }

    /**
     * Constructor por omision. Crea un empleado con nombre Juan Perez
     **/
    public Empleado(){
	this("Juan Perez");
    }

    //Metodos observadores
    /**
     * Metodo que permite conocer el nombre del empleado
     *
     * @return El nombre del empleado
     **/
    public String getNombre(){
	return this.nombre;
    }

    //Metodos modificadores
    /**
     * Metodo que permite modificar el nombre del empleado
     *
     * @param nombre El nuevo nombre del empleado
     **/
    public void setNombre(String nombre){
	this.nombre = nombre; 
    }

    //Metodos especiales

    /**
     * Metodo toString. Devuelve el nombre del empleado
     *
     * @return Empleado: "Nombre"
     **/
    @Override
    public String toString(){
	return "Empleado: " + this.nombre;
    }

    /**
     * Metodo equals. Permite saber si dos empleados son iguales
     *
     * @param e El empleado contra el que se va a comparar 
     * @return Un valor boolean, true si son iguales, false en otro caso
     **/
    public boolean equals(Object e){
	Empleado x = (Empleado) e;
	return this.nombre.equals(x.nombre);
    }
    
}
