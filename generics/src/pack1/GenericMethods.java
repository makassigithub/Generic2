package pack1;

//This is to demonstrate that a non-generic class can embed a generic method
public class GenericMethods {

//The method checks if 	an array contains an element
//because the class doesn't specify any GEN type, the method does it on its own.
// Comparable is an interface of java.lang that is used to create obj that can be ordered.
	static <T extends Comparable<T>,V extends T> boolean containsIt(T tObj,V[] arrayOfTypeV) {
		
		for (V v :arrayOfTypeV){
			if (tObj==v) 
			return true;
		 else  return false;					
		}
		return false;
	}
	
	public static void main(String...args){
// declare our arrays for test, element must be of Object types
	
 Integer[] intArray = {1,2,3,4};
 String[] strArray = {"un","deux","trois","quatre"};
 
 if (containsIt(1,intArray))System.out.println("1 is inside intArray");
 if (!containsIt(5,intArray))System.out.println("5 is not inside intArray");
 System.out.println();
 if (containsIt("un",strArray))System.out.println("'un' is inside strArray");
 if (!containsIt("cinq",strArray))System.out.println("'cinq' is not inside strArray");
 
// the following line will not pass Type Safety check;
// if (containsIt(2,strArray))System.out.println("1 is not inside intArray");
 
		 
 }
	
	}


