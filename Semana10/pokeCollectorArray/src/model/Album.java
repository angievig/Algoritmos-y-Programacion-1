package model;

public class Album {
	
	private String regionName;
	private int numPokemons;
	
	//Relations with multiple cardinality
	private Pokemon[] pokemons;
	
	
	
	
	public Album(String regionName, int numPokemons) {
		
		this.regionName = regionName;
		this.numPokemons = numPokemons;
		
		// initializing the array for Pokemon objects
		pokemons = new Pokemon[numPokemons];
		
	}

	
	/**
	 * 
	 * @param name
	 * @return
	 */
	public String deletePokemon(String name) {
		String answer="";
		
		return answer;
		
	}
	
	
	public String toString() {
		String album="";
		
		album += "Name of the region: " + regionName + "\n";
		album += "contains "+ numPokemons + " cards\n";

		
		return album;
	}
	

	/**
	 * Método que recibe el nombre del pokemon si lo encuentra retorna el objeto, sino retorna null
	 * PRE: el arreglo está inicializado
	 * POS: No tiene, no modifica ningún atributo!! (solo lo escribí para que quede claro)
	 * @param name es un string con el nombre del pokemon que se desea buscar
	 * @return retorna el objeto pokemon si está en el arreglo, null en el caso contrario
	 */
	public Pokemon searchPokemon(String name) {

		//Declaramos una variable temporal de tipo Pokemon para guardar la respuesta y retornarla
		Pokemon tmp= null; // el valor inicial de la variable es null (pq es un objeto)

		boolean encontrado =false; // encontrado es una variable bandera (flag) que se usa para que el recorrido sea parcial, inicialmente es falsa


		for (int i = 0; //inicio del ciclo, la variable i (también le decimos indice en la explicación) se declara eninicializa en cero

				i < pokemons.length && !encontrado;  //condición del ciclo, es un recorrido parcial
				//mientras que i sea menor que la longitud del arreglo Y
				// el valor de encontrado es falso (not falso es igual a verdadero!!)

				i++) //Avance del ciclo, i se incrementa de uno en uno 
		{//Cuerpo del ciclo
			tmp= pokemons[i]; //se asigna el contenido de la posición i del arreglo pokemons en la variable tmp

			// Condicional
			if(tmp !=null // si tmp es distinto de null (es decir, hay un objeto de la clase pokemon)
					&& tmp.getName().equals(name)) // Y si el nombre de ese objeto es igual al nombre que se pasó como parámetro (name)
			{ //Entonces encontramos el pokemon que estábamos buscando
				encontrado = true; // se cambia el valor de encotrado a true para terminar el ciclo
			}//No hay else, no es necesario
		}// al terminar el ciclo la variable tmp contiene el pokemon buscado (si existe), o null

		return tmp;//retornamos tmp que es la variable que guarda la respuesta
	}
	
	/**
	Método que agrega el pokemon que se pasa como parámetro en la primera posición vacía del arreglo
	PRE: el pokemon no existe en el arreglo y el arreglo está inicializado
	POS: el arreglo contienen un nuevo pokemon
	@param poke es un objeto de la clase Pokemon que se debe agregar al arreglo de pokemones
	*/
	public void addPokemon(Pokemon poke) {
		
		//Para encontrar la primera posición vacía en el arreglo
		int pos =0; //variable  para guardar la posición, icialmente es cero
		boolean encontrado= false; // variable flag para que el recorrido sea parcial, inicialmente es falso
		
		
		for (int i = 0; //inicio del ciclo, la variable i se declara eninicializa en cero
				
				i < pokemons.length && !encontrado; //condición del ciclo, es un recorrido parcial
				//mientras que i sea menor que la longitud del arreglo Y
				// el valor de encontrado es falso (not falso es igual a verdadero!!)

				i++)//Avance del ciclo, i se incrementa de uno en uno 
		{//cuerpo del ciclo
			if (pokemons[i]==null) { // si el objeto en la posición i es null, entonces es el primero vacío
				pos= i; // se guarda el índice en la variable pos
				encontrado =true; // se cambia el valor de encotrado a true para terminar el ciclo
			}
		}
		//Cuando el ciclo termina, la variable pos tiene el índice de la primera posición vacía
		
		//agregando el pokemon en la primera posición vacía
		pokemons[pos]= poke;
	}
	
	/**
	 * Método para consultar si el arreglo de pokemones de un album tiene espacio 
	 * para agregar un nuevo pokemon
	 * @return un valor booleano, true si el arreglo tiene pocisiones vacías (null), 
	 * false en el caso contrario
	 */
	public boolean hasSpace() {
		boolean space = false;  
		for (int i = 0; i < pokemons.length && !space; i++) {
			if(pokemons[i]==null) {
				space= true;
			}
		}
		return space;
	}


	
	/*
	 * ================================= Getters & Setters
	 */
	public String getRegionName() {
		return regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

	public int getNumPokemons() {
		return numPokemons;
	}

	public void setNumPokemons(int numPokemons) {
		this.numPokemons = numPokemons;
	}

	




}
