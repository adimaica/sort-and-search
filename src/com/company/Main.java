package com.company;

public class Main {

    public static void main(String[] args) {
	    int[] array = {8,4,9,1,2};

	    int n = array.length;
	    int aux;

	    for(int i = 0 ; i < n-1;i++) {
	        for(int j = 0 ; j < n - i - 1; j++) {
	            if(array[j] > array[j + 1]) {
	                aux = array[j];
	                array[j] = array[j + 1];
	                array[j + 1] = aux;
                }
            }
        }

	    for(int i = 0;i < n;i++) {
            System.out.print(array[i] + " ");
        }

		binarySearch(array, 0, array.length, 1);
    }

    public static void binarySearch(int[] array, int left, int right, int searchedValue) {
    	//am vazut ca mijlocul se calculeaza asa in loc de (left + right) / 2
		// De Ce ?
		//La valori cu minus crapa
    	int mid = left + (right - left) / 2;

    	if(mid < array.length) {
			if (searchedValue == array[mid]) {
				System.out.println("\nElementul a fost gasit: " + searchedValue);
			} else if (searchedValue < array[mid]) {
				binarySearch(array, left, mid - 1, searchedValue);
			} else if (searchedValue > array[mid]) {
				binarySearch(array, mid + 1, right, searchedValue);
			}
		}
    	else System.out.println("\nElementul cautat nu exista.");
	}

}
