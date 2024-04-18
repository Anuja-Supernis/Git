package com.example;
import java.util.Arrays;
import java.util.Scanner;

class Program {
		
		private static Scanner sc = new Scanner(System.in);
		private static <Array> void acceptRecord(int arr[]) {
			if  ( arr != null) {
				for(int index =0; index < arr.length ; index++) {
					System.out.print("Enter element : ");
					arr [ index ]= sc.nextInt();
				}
			}
		}
		private static void printRecord(int [] arr) {
			
			if ( arr != null ) {
				Arrays.stream(arr)
				.forEach(System.out::println);
			}
		}
		public static void main(String[] args) {
			int arr[] = new int[3];
			Program.printRecord( arr );
			Program.acceptRecord(arr);
		}
		
		
		public static void main11(String[] args) {
			int arr[] = new int[] {10,20,30};
			Arrays.stream(arr)
			.forEach(System.out::println);
			/*
			OUTPUT :10
					20
					30

			 */
		}


		public static void main10(String[] args) {
			int arr[] = new int [] {10,20,30};
			System.out.println(Arrays.toString(arr));
			//output : [10, 20, 30]
		}
		public static void main9(String args[]) {
			int arr[] = new int[] {10,20,30};
			System.out.println(arr);
			//output : [I@573f2bb1
			
		}
		public static void main8(String args[]) {
			int [] arr = new int[] {1,2,3,4};
			for(int element : arr) {
				System.out.println(element);
			}
		}
		
		
		public static void main7(String[] args) {
			int[] arr = new int[ ] { 10, 20, 30 };
			for( int index = 0; index < arr.length; ++ index ) 
				System.out.println(arr[ index ]);
		}
		
		
		public static void main6(String[] args) {
			int[] arr = new int[ ] { 10, 20, 30 };
			int index = 0;
			while( index < arr.length ) {
				System.out.print( arr[ index ]+"	");
				index = index + 1;
			}
			System.out.println();
		}
		
		
		public static void main5(String[] args) {
			int[] arr = new int[ ] { 10, 20, 30 };
			int index = 0;
			do {
				System.out.print(arr[ index ]+"	");
				index = index + 1;
			}while( index < arr.length );
			System.out.println();
		}
		
		
		@SuppressWarnings("unused")
		public static void main4(String[] args) {
			
			int[] arr = new int[] { 10, 20, 30 };
			
			//System.out.println( arr1[ -1 ]);	//ArrayIndexOutOfBoundsException
			//System.out.println( arr1[ 3 ]);	//ArrayIndexOutOfBoundsException
			//System.out.println( arr1[ arr.length ]);	//ArrayIndexOutOfBoundsException
		}
		
		
		public static void main3(String[] args) {
			int[] arr = new int[ ] { 10, 20, 30 };
			System.out.println("Length	:	"+arr.length);
			
			System.out.println( arr[ 0 ]);
			System.out.println( arr[ 1 ]);
			System.out.println( arr[ 2 ]);
		}
}

