package pack1;

// generic interface with 2 abstract method
interface GenericInterf<T extends Comparable<T>> {

	T getMin( T [] o);
	T getMax(T [] o );
}

