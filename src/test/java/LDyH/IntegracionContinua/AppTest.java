package LDyH.IntegracionContinua;

import static org.junit.Assert.assertEquals;

import org.junit.*;

/**
 * Clase de pruebas unitarias para clase de algoritmo de ordenación Quicksort
 * @author Mauricio
 *
 */
public class AppTest
{
	private Quicksort qs;
	/**
	 * Inicialización de objeto de clase de algoritmo QuickSort antes de cada test
	 */
	@Before
	public void inicializarCalculador() {
		qs = new  Quicksort();
	}

	/**
	 * Terminación de objeto tras la ejecución de cada test
	 */
	@After
	public void cerrarCalculador()
	{
		qs = null;
	}

	@Test
	public void ordenacionArrayDesordenados()
	{
		int[] array1 = {2,1};
		int[] array2 = {-5, 2, 1, 8};
		int[] array3 = {4, 3, 9, 2, 0, 10};
		int[] array4 = {1, 7, 2, 5, 4, 3, 6, 8, 9};
		int[] array5 = {4, 2, 2, 1};
		Assert.assertArrayEquals(new int[]{1,2}, qs.sort(array1));
		Assert.assertArrayEquals(new int[]{-5,1,2,8}, qs.sort(array2));
		Assert.assertArrayEquals(new int[]{0,2,3,4,9,10}, qs.sort(array3));
		Assert.assertArrayEquals(new int[]{1,2,3,4,5,6,7,8,9}, qs.sort(array4));
		Assert.assertArrayEquals(new int[]{1,2,2,4}, qs.sort(array5));
	}

	@Test
	public void ordenacionArrayOrdenados()
	{
		int[] array1 = {1,2,3};
		int[] array2 = {1,1,1,4,6};
		int[] array3 = {5,6,7,8,12,14};
		int[] array4 = {1,2,3,4,5,6,7,8,9,10};
		Assert.assertArrayEquals(array1, qs.sort(array1));
		Assert.assertArrayEquals(array2, qs.sort(array2));
		Assert.assertArrayEquals(array3, qs.sort(array3));
		Assert.assertArrayEquals(array4, qs.sort(array4));
	}

	@Test
	public void deteccionEntradaInvalida()
	{
		int[] array = {};
		int[] array2 = null;
		assertEquals(null, qs.sort(array));
		assertEquals(null, qs.sort(array2));
	}










}
