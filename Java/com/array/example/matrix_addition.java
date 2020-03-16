package com.array.example;

import java.util.Scanner;

class addMatrix
{
	Scanner scan;
	int matrix1[][], matrix2[][], sum[][];
	int row, column;
	void create()
	{
		scan = new Scanner(System.in);
		System.out.println("Enter number of rows and columns");
		row = Integer.parseInt(scan.nextLine());
		column = Integer.parseInt(scan.nextLine());
		matrix1 = new int[row][column];
		matrix2 = new int[row][column];
		
		sum = new int[row][column];
		System.out.println("Enter the data for thr first matrix");
		for(int i = 0; i < row; i++)
		{
			for(int j = 0; j < column; j++)
			{
				matrix1[i][j] = scan.nextInt();
			}
		}
		
		//Second Matrix Creation
		for(int i = 0; i < row; i++)
		{
			for(int j = 0; j < column; j++)
			{
				matrix2[i][j] = scan.nextInt();
			}
		}
	}
	void display()
	{
		System.out.println("\nThe First Matrix is :");
		for(int i = 0; i < row; i++)
		{
			for(int j = 0; j < column; j++)
			{
				System.out.println("\t"+matrix1[i][j]);
			}
			System.out.println();
		}
		System.out.println("\nThe Second Matrix is :");
		for(int i = 0; i < row; i++)
		{
			for(int j = 0; j < column; j++)
			{
				System.out.println("\t"+matrix2[i][j]);
			}
			System.out.println();
		}
	}
	void add()
	{
		for(int i = 0; i < row; i++)
		{
			for(int j = 0; j < column; j++)
			{
				sum[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}
		System.out.println("Addition of both the matrices is ");
		for(int i = 0; i < row; i++)
		{
			for(int j = 0; j < column; j++)
			{
				System.out.println("\t"+sum[i][j]);
			}
			System.out.println();
		}
	}
}

public class matrix_addition {

	public static void main(String[] args) {
		addMatrix ad = new addMatrix();
		

	}

}
