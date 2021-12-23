package application;

public class App {

	public static void main(String[] args) {

		// String is a class, not a data type
		// creating a variable of a reference type
		String text;
		// This step actually allocates memory
		text = new String("Hello!");

		/*
		 * Compare this to a primitive data type: int value; value = 3;
		 * 
		 * With primitive data types you don't have to use new when assigning values,
		 * unlike String
		 */

		//Java does have a shortcut for strings, which looks like
		//primitive data types, but isn't
		
		String words;
		words = "This is a string";
		
		String[] texts = null;
		//Below is not setting aside memory for 3 strings;
		//It is setting aside memory for references to 3 strings
		texts = new String[3];
		System.out.println(texts);
		
		for(String textArray: texts) {
			System.out.println(textArray);
		}
		
		texts[0] = new String("Hi!");
		//this is a shortcut
		texts[1] = "How are you?";
		texts[2] = "Nice weatheer";
		
		for(String textArray: texts) {
			System.out.println(textArray);
		}
	}

}
