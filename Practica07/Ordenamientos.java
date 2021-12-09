import java.util.Random;

/**
 * Clase para implementar los algoritmos bubblesort y quicksort solicitados en
 * el primer ejercicio de la practica
 *
 * @author Eduardo Vargas Perez
 * @version 1.0
 **/
public class Ordenamientos{
    /**
     * Metodo main para crear el arreglo e invocar a los metodos con los algoritmos
     * 
     * @param args Los argumentos
     **/
    public static void main(String[] args){
	System.out.println("***Programa para implementar los algoritmos quicksort y bubblesort***\n");
	//Obejto de la clase random que usare
	Random rnd = new Random();
 
	//Arreglo a ordenar con bubblesort
	int[] arreglo = new int[100000];

	//Ciclo for para llenar el arreglo
	for(int i = 0; i < arreglo.length; i++){
	    //Solo usare 100 numeros
	    arreglo[i] = rnd.nextInt(100);
	}

	//Cliclo for para imprimir el arreglo sin ordenar
	System.out.println("Este es el arreglo a ordenar con bubblesort: \n\n\n");
	for(int i = 0; i < arreglo.length; i++){
	    System.out.print(arreglo[i] + "  ");
	}

	//Ordena el arreglo
	bubblesort(arreglo);
	
	//Imprime el arreglo ordenado con bubblesort
	System.out.println("\n\n\nEste es el arreglo ordenado con bubblesort: \n\n");
	for(int i = 0; i < arreglo.length; i++){
	    System.out.print(arreglo[i] + "  ");
	}

	//Arreglo a ordenar con quicksort
	int[] arreglo2 = new int[100000];

	//Ciclo for para llenar el arreglo
	for(int i = 0; i < arreglo2.length; i++){
	    //Solo usare 100 numeros
	    arreglo2[i] = rnd.nextInt(100);
	}

	//Cliclo for para imprimir el arreglo sin ordenar
	System.out.println("\n\n\nEste es el arreglo a ordenar con quicksort: \n\n\n");
	for(int i = 0; i < arreglo2.length; i++){
	    System.out.print(arreglo2[i] + "  ");
	}

	//Ordena el arreglo
	quicksort(arreglo2);
	
	//Imprime el arreglo ordenado con quicksort
	System.out.println("\n\n\nEste es el arreglo ordenado con quicksort: \n\n");
	for(int i = 0; i < arreglo.length; i++){
	    System.out.print(arreglo[i] + "  ");
	}

	System.out.println(" ");
	
    }//Fin del metodo main

    //Bubblesort
    /**
     * Metodo privado bubblesort para ordenar arreglos
     *
     * @param desordenado El arreglo a ordenar
     **/
    private static void bubblesort(int[] desordenado){
	for (int i = 0; i < desordenado.length; i++){
	    for (int j = 0; j < desordenado.length - 1; j++){
		if (desordenado[j] > desordenado[j+1]){
		    int temp = desordenado[j];
		    desordenado[j] = desordenado[j+1];
		    desordenado[j+1] = temp;
		}//Fin de if
	    }//Fin del for (j)
	}//Fin del for (i)
    }//Fin de bubblesort

    //Quicksort

    /**
     * Metodo privado quicksort, ordena el arreglo dado
     *
     *
     * @param desordenado El arreglo a ordenar
     **/
    private static void quicksort(int[] desordenado){
	quicksortAuxiliar(desordenado, 0, desordenado.length - 1);
    }//Fin de quicksort
    
    /**
     * Metodo privado quicksortAuxiliar para ordenar arreglos
     *
     * @param desordenado el arreglo a ordenar 
     * @param i Un indice (inicio del arreglo)
     * @param j Otro indice (fin del arreglo)
     **/
    private static void quicksortAuxiliar(int[] desordenado, int i, int j){
	// i y j son los indices del arreglo
	if (i < j){
	    //Agarra el pivote
	    int pivote = particion(desordenado, i, j);
	    //Ordena los subarreglos
	    quicksortAuxiliar(desordenado, i, pivote - 1);
	    quicksortAuxiliar(desordenado, pivote + 1, j);
	}//Fin de if
    }//Fin de quicksortAuxiliar

    /**
     * Metodo particion. Este es el que hace la chamba fuerte
     * 
     * @param arreglo El arreglo que estamos analizando
     * @param inicio Desde donde lo analizamos (inicio)
     * @param fin Donde termina el arreglo (fin)
     **/
    private static int particion(int arreglo[], int inicio, int fin) {
	//Como pivote agarrare el ultimo elemento del arreglo
	int pivote = arreglo[fin];
	//Esta variable es para otro indice
	int i = inicio - 1;

	//Ciclo for para "comparar" los elementos
	for (int j = inicio; j < fin; j++) {
	    //¿arreglo[j] <= pivote?
	    if (arreglo[j] <= pivote) {
		i++;//Este representa el indice del ultimo elemento que fue menor 
		int temporal = arreglo[i];//Intercambia el que esta despues de ese elemento con
		arreglo[i] = arreglo[j];// el siguiente menor al pivote que encuentres
		arreglo[j] = temporal;
	    }
	}

	//Agarra el pivote y pasalo a la mitad del arreglo
	int temporal = arreglo[i+1];
	arreglo[i+1] = arreglo[fin];
	arreglo[fin] = temporal;
	
	return i+1; //regresa el indice del pivote
    }//Fin de particion
    
}
