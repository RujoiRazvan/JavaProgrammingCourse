package Part7.Sorting;

import java.util.Arrays;

public class MainProgram {
	public static void main(String[] args) {
		int array[]= {55, 11, 1, 99, 3, 12, 3, 8, 33, 2};
		System.out.println(Arrays.toString(array));
		System.out.println("Smallest" + smallest(array));
		System.out.println("Index of smallest: " + indexOfSmallest(array));
		System.out.println("Index of smallest from:" + indexOfSmallestFrom(array, 4));
		swap(array, 2, 5);
		System.out.println(Arrays.toString(array));
		swap(array, 0, 8);
		System.out.println(Arrays.toString(array));
		sort(array);
		System.out.println(Arrays.toString(array));
		System.out.println();
	}
	
	public static int smallest(int[] array) {
		int min = array[0];
		for(int entry : array) {
			if(entry < min)
				min = entry;
		}
		return min;
	}
	public static int indexOfSmallest(int array[]) {
		int index = -1, min = array[0];
		for(int i = 0; i < array.length; i++){
			if(array[i] < min) {
				min = array[i];
				index = i;
			}
		}
		return index;
	}
	public static int indexOfSmallestFrom(int array[], int from) {
		int index = -1, min = array[0];
		for(int i = from; i < array.length; i++) {
			if(array[i] < min) {
				min = array[i];
				index = i;
			}
		}
		return index;
	}
	public static void swap(int[] array, int index1, int index2) {
		int aux;
		aux = array[index1];
		array[index1] = array[index2];
		array[index2]=aux;
	}
	public static void list(int array[]) {
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] +  " ");
		}
		System.out.println();
	}
	public static void sort(int[] array) {
		for(int i = 0; i < array.length - 1; i++) {
			for(int j = i + 1; j < array.length; j++) {
				if(array[i] < array[j]) {
					int aux;
					aux = array[i];
					array[i]=array[j];
					array[j]=aux;
				}
			}
		}
	}
	public static void sortM2(int[] array) {
		for(int i = 0; i < array.length; i++) {
	}
	
}
