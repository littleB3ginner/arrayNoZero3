package javaapplication36;

import java.util.Arrays;

/**
 *
 * @author nemanja
 */
public class JavaApplication36 {

    public static void main(String[] args) {
        int[] array = {12, 23, -22, 0, 43, 545, -4, -55, 43, 12, 0, -999, -87};
        Arrays.sort(array);
        
        int num = 0;
        
        int pozitivno = 0;
        int negativno = 0;
        
        int n = 0;
        int p = 0;
//        prolazenje kroz niz , izbacivanje nula , kopiranje i stampanje novog niza
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                array[num++] = array[i];
            }
        }
        
        int[] arr = new int[num];
        System.arraycopy(array, 0, arr, 0, num);
        System.out.println(Arrays.toString(arr));
//      Prolazimo kroz niz, brojimo broj pozitivnih i broj negativnih
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                pozitivno++;
            } else {
                negativno++;
            }
        }
//        Pravimo nove nizove sa dobijenom duzinom POZITIVNO,NEGATIVNO 
        int positive[] = new int[pozitivno];
        int negative[] = new int[negativno];
//        Postavljamo im vrednosti
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                positive[p] = arr[i];
                p++;
            } else {
                negative[n] = arr[i];
                n++;
            }
        }
        System.out.println("Positive: " + Arrays.toString(positive));
        System.out.println("Negative: " + Arrays.toString(negative));
//      Brojanje duplikata i koji brojevi su duplikati
        int numDup = 0;
        int prev = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == prev) {
                numDup++;
                System.out.println("Number that got duplicates: " + arr[i]);
            } else {
                prev = arr[i];

            }
        }
        System.out.println("Duplicate number: " + numDup);

    }

}
