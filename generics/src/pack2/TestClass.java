package pack2;

public class TestClass {

	public static void main(String...args){
//create an instance of GenericTypeCheching
 GenericTypeCheching<Integer> superOb = new GenericTypeCheching<Integer>(100);

//create an instance of GenericTypeCheching embedding an Integer
GenericTypeChechingSubClass<Integer> subOb1 = new GenericTypeChechingSubClass<Integer>(102);

//create an instance of GenericTypeCheching embedding an Integer
GenericTypeChechingSubClass<String> subOb2 = new GenericTypeChechingSubClass <String> ("Just a Test");

// use type checking using instanceof
if(superOb instanceof GenericTypeCheching<?>) System.out.println("superOb is of type GenericTypeCheching");
if(subOb1 instanceof GenericTypeChechingSubClass<?>) System.out.println("subOb1 is of type GenericTypeChechingSubClass");
System.out.println();
if(subOb2 instanceof GenericTypeChechingSubClass<?>) System.out.println("subOb2 is of type GenericTypeChechingSubClass");

// Now let's verify a casting possibility
if(subOb2 instanceof GenericTypeCheching<?>) System.out.println("subOb2 can be casted into GenericTypeCheching");

System.out.println();
//if we cast generic wrapping a String Class into an Integer type it does not compile
//if(subOb2 instanceof GenericTypeChechingSubClass<Integer>) System.out.println("subOb2 can be casted into GenericTypeChechingSubClass<Integer>");


	}
}
