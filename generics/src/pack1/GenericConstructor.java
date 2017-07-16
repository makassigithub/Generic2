package pack1;

// this illustrate the use of a generic constructor for a non-generic class
public class GenericConstructor {


	double value;
// The constructor need to declare a the type parameter
	<T extends Number> GenericConstructor(T arg) {		
		value = arg.doubleValue();	
		}
	
// this method shows the value wrapped in the object
	void showWrappedPrimitive(){
		 System.out.println("the wrapped value is: "+ value);
	 }
	
	public static void main (String...args){
		// declare an object of type GenericConstructor
		GenericConstructor gc1;
		GenericConstructor gc2;
		
		
		
		// Because Integer and Double extends Number, The constructor can use both types
		gc1 = new  GenericConstructor(222);
		gc2 = new  GenericConstructor(22.5);
		
		//get the wrapped value within the object
		// the the instance variable was an 'int', and was used to construct objects 
		// the return value for the gc2 would be concatenated i.e. 22
		
		gc1.showWrappedPrimitive();
		System.out.println();
		gc2.showWrappedPrimitive();
	}
}
