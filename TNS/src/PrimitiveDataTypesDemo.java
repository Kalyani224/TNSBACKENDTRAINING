//Program to demonstrate data types 
public class PrimitiveDataTypesDemo {

	public static void main(String[] args) {
		//byte takes 1 byte
		byte byteMax = (byte) 143;
		byte byteMin = (byte) -142;
		
		System.out.println("Min range of byte is" +
				byteMin+"Max range of byte is "+byteMax);
		
		//short - 2 bytes
		short shortMax = (short) 45678;
		short shortMin = (short) -253578;
		System.out.println("Minshort range of byte is" +
				shortMin+"Maxshort range of byte is "+shortMax);
		
		//int - 4bytes
		int maxInt = 345678986;
		int minInt = -2147483648;
		System.out.println("Minint range of byte is" +
				minInt+"Maxint range of byte is "+maxInt);
		
		//long - 8bytes
		long maxLong = 8765432123456734561L;
		long minLong = -1234567898765432345L;
		
		System.out.println("Minlong range of byte is" +
				minLong+"Maxlong range of byte is "+maxLong);
		
		float f=9876.785417845784569685247654f;
		double d=45667.78456127482593784569682f;
		System.out.println("float value is "+f+" double value is "+d);
		
		//boolean 
		boolean flag=false;
		System.out.println("boolean value is "+flag);
	}
}