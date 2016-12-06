package pack1;

// implementor class that extend the interface must also specify the type params
class Implementor <T extends Comparable<T>> implements GenericInterf<T>{

// implements the abstract methods
	@Override
	public T getMin(T[] arr) {
		   T v = arr[0] ;
		   
		   for (int i =0; i<arr.length;i++){
			   if (arr[i].compareTo(v)< 0) v= arr[i];
		   }
		  return v;
	}

	@Override
	public T getMax( T[] arr) {
		  T v = arr[0] ;
		   
		   for (int i =0; i<arr.length;i++){
			   if (arr[i].compareTo(v)> 0) v= arr[i];
		   }
		  return v;
	}
	
	public static void main(String...args){
		// Prepare your arrays of T type, must all be subclasses of Number 
		Integer [] intArr = {3,2,5,6,1};
		Double [] dbArr = {3.0,2.5,5.1,6.4,1.9};
		
		// the implemented methods in action
		System.out.println("The min of intArr is: " + new Implementor<Integer>().getMin(intArr));
		System.out.println("The max of intArr is: " + new Implementor<Double>().getMax(dbArr));
	}	 
}
