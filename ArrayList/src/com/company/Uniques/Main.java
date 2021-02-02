package com.company.Uniques;


import java.util.ArrayList;
import java.util.Arrays;

/*
* Package of ArrayList:
*       import java.util.ArrayList;
*
* Instantiating ArrayList
*       ArrayList<type_class> name = new Array_List<type_class>();
*                                   (or)
*       ArrayList<type_class> name = new ArrayList<>();
*
*   Adding Elements to an arrayList
*   ArrayList_name.add(value);
*
* */
public class Main {
	public static void main(String[] args){
		//instantiate new empty ArrayList
		ArrayList<String> employee = new ArrayList<>();
		
		//instantiate of another ArrayLists
		ArrayList<String> animal = new ArrayList<>();
		ArrayList<String> mammal = new ArrayList<>();
		
		
		//Add elements
		employee.add("John");
		employee.add("Jane");
		employee.add("Jack");
		employee.add("Jill");
		
		System.out.println(employee);
		
		//Using .addAll method
		animal.add("Crocodile");
		System.out.println("Animal List: " + animal);
		
		mammal.add("Elephant");
		mammal.add("Dog");
		System.out.println("Mammal List: "+mammal);
		
		//add all the elements from
		// 'mammal' to 'animal'
		
		animal.addAll(mammal);
		
		System.out.println("New AnimalList: "+animal);
		
		
		//initialize a new ArrayList
		//with values by using the
		//constructor and Array.asList().
		
		ArrayList<String> students = new ArrayList<>(Arrays.asList("John","Jane","Jack","Jill"));
		System.out.println("Students are "+students);
		
		//get elements
		/*
		* accessing elements in an ArrayList
		* arrayList_name.get(index); */
		System.out.println(students.get(1));
		
		//Loop through the ArrayList storing the elements
		//value on each iteration in 'i'
		
		for (String i:students){
			System.out.println(i);
		}
		
		/*
		* To change an element in java we use the '.set()'
		* arrayList_name.set(index, new_value);*/
		
		students.set(1,"John Doe");
		System.out.println(students);
		
		/*
		* Removing an element from an ArrayList
		* arrayList_name.remove(index); */
		
		students.remove(2);
		System.out.println(students);
		
		/*
		* Removing all elements from an ArrayList
		* arrayList_name.removeAll(arrayList_name); */
		
		students.removeAll(students);
		System.out.println(students);
		
		/*
		* We can use .clear() method to clear all elements in an ArrayList
		* arrayList.clear(); */
		
		students.clear();
		System.out.println(students);
		
		ArrayList<String> workers = new ArrayList<>(Arrays.asList("John","Jane","Jack","Jill"));
		
		/*
		*  */
	}
}
