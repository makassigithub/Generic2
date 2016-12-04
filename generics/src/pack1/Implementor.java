package pack1;

class Implementor <T extends Comparable<T>> implements GenericInterf<T>{

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
		
		Integer [] intArr = {3,2,5,6,1};
		Double [] dbArr = {3.0,2.5,5.1,6.4,1.9};
		
		System.out.println("The min of intArr is: " + new Implementor<Integer>().getMin(intArr));
		System.out.println("The max of intArr is: " + new Implementor<Double>().getMax(dbArr));
	}	 
}
