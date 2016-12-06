package pack2;

public class GenericTypeChechingSubClass <T> extends GenericTypeCheching<T> {

	T subObj;
	
	GenericTypeChechingSubClass(T o){
     super(o);	
}
 T getObj2(){
	 return subObj;
 }
}