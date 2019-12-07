package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> listI = new ArrayList<String>();
		//2. Add five Strings to your list
		listI.add("John 'Jack' Bruvold");
		listI.add("Rohan Gaikwad");
		listI.add("Raunak Mondal");
		listI.add("Rohin Sood");
		listI.add("Raymond Sheng");
		//3. Print all the Strings using a standard for-loop
		for (int i = 0; i < listI.size(); i++) {
			System.out.println(listI.get(i));
		}
		//4. Print all the Strings using a for-each loop
		for (String string : listI) {
			System.out.println(string);
		}
		//5. Print only the even numbered elements in the list.
		for (int i = 0; i < listI.size(); i++) {
			if (i % 2 == 1) {
				System.out.println(listI.get(i));
			}
		}
		//6. Print all the Strings in reverse order.
		for (int i = listI.size() - 1; i >= 0; i--) {
			System.out.println(listI.get(i));
		}
		//7. Print only the Strings that have the letter 'e' in them.
		for (int i = 0; i < listI.size(); i++) {
			for (int j = 0; j < listI.get(i).length(); j++) {
				if ("e".equals(listI.get(i).charAt(j) + "")) {
					System.out.println(listI.get(i));
				}
			}
		}
	}
}
