package demo;
class M1{
	int a =10;
	static int b =20;
	 
	void math1(){
		System.out.println(a);
	}
	static void math2(){
		System.out.println(b);
	}
}
public class Main {
	
public static void main(String[] args) {
	M1 m = new M1();
	m.math1();
	M1.math2();
}
}
