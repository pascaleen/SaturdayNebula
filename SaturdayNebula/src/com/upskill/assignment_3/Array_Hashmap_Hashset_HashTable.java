package com.upskill.assignment_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Array_Hashmap_Hashset_HashTable {

	public static void main(String[] args) {
		
		// Array store multiple data using index
		
		int age = 27;                                   //Variable-single value
		int[] ageNebula = new int[] {21 , 24, 31 , 29};  //Array - multiple value
		
		
		//Array index    [0] [1] [3] [4]
		
		System.out.println("Student Age : " + ageNebula[2]);
		System.out.println("Total Student Age : " + ageNebula.length);
		// TODO Auto-generated method stub

		
		String[]nameNebula = new String[]{"Pascaleen","Gayan","Auri","Akain"};
		System.out.println("Student Name : " + nameNebula[2]);
		System.out.println("Total Student Name : " + nameNebula.length);
		
		
		
	//Multi-Dimentional Array
		int[][] ageNebula2D = {{19 , 24, 31 , 28, 29},  //[0][0] [0][1] [0][2] [0][4}
				{21 , 25, 32 , 35}};                //[1][0] [1][1]
		
		System.out.println("Studnet Age 2D :" + ageNebula2D[0][3]);
		
		//2D String Array
		
		int [][] studentgrade2D = {{75 , 55 , 68, 90 ,98},
				{30 ,45 ,28 , 62}};
		System.out.println("Studnet Grade2D :" + studentgrade2D[0][3]);
		
		}		
		
		
	}


