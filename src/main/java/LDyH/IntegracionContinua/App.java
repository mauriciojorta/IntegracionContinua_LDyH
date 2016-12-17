package LDyH.IntegracionContinua;

/**
 * Main de programa
 *
 */
public class App
{
    public static void main( String[] args )
    {
    	int valores[] = {2,4,1,3,5,7,6,8};
    	for (int i = 0; i<valores.length; i++)
    		System.out.print(valores[i] + ", ");
    	System.out.println();
    	Quicksort qsort = new Quicksort();
    	int valores_ordenados[] = qsort.sort(valores);
    	for (int i = 0; i<valores_ordenados.length; i++)
    		System.out.print(valores_ordenados[i] + ", ");
    	System.out.println();

    }
}
