package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int [] array  = { 5, 7, 9, 8};
        swap(array, 1,2);
        for (int a : array)
            System.out.println(a);
    }
    static void swap ( int [] array, int ind1, int ind2)
    {
        int temp = array [ind1];
        array [ind1] = array [ind2];
        array [ind2] = temp;

    }
}
