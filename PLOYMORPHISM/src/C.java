
public class C {
public static void main(String [] methods){
	A obj = new B();
}
public static void swap(Integer a, Integer b) {
	System.out.println(a + " " + b);
	Integer temp = a; a = b; b = temp;
	System.out.println(a + " - " +b);
}
}
