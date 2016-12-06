package pack2;

// This is to demonstrate that instance of can be used with generics
public class GenericTypeCheching <T>{

	T supObj;
	GenericTypeCheching( T obj){
		supObj = obj;		
	}
	
	T getObj(){
		return supObj;	
	}
	
}
