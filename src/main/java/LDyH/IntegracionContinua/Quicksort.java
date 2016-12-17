package LDyH.IntegracionContinua;

/**
 * Clase de algoritmo Quicksort
 * @author Mauricio
 *
 */

public class Quicksort  {

	private int[] numbers;

	private int number;



/**
 * Ordena un array de enteros con el algoritmo quicksort
 * @param values - Array de enteros
 */
	public int[] sort(int[] values) {

		// Check for empty or null array

		if (values ==null || values.length==0){
          return null;

		}
		else
		{
		this.numbers = values;

		number = values.length;

		quicksort(0, number - 1);

		return numbers;
		}

	}


/**
 * Algoritmo Quicksort para la ordenación de valores enteros en un array
 * @param low - Extremo izquierdo de subparte a ordenar
 * @param high - Extremo derecho de subparte a ordenar
 */
	private void quicksort(int low, int high) {
		int i = low, j = high;
		int pivot = numbers[low + (high-low) / 2];
		while (i <= j) {
			while (numbers[i] < pivot) {
				i++;
			}
			while (numbers[j] > pivot) {
				j--;
			}
			if (i <= j) {
				exchange(i, j);
				i++;
				j--;
			}
		}
		if (low < j)

			quicksort(low, j);

		if (i < high)

			quicksort(i, high);

	}


/**
 * Intercambia los valores almacenados en los índices i y j del array
 * @param i - Índice i de array
 * @param j - Índice j de array
 */
	private void exchange(int i, int j) {
		int temp = numbers[i];
		numbers[i] = numbers[j];
		numbers[j] = temp;
	}


/**
 * @return el array de valores enteros ordenado
 */
public int[] getNumbers() {
	return numbers;
}






}