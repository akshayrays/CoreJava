package Methods;

public class TestM implements MethodsIn{
		public void abst()
		{
			System.out.println("akash");
		}
	public static void main(String[] args) {
		TestM t = new TestM();
		
		t.abst();
		t.def();
		MethodsIn.stat();  // static method interface ke through call hoti hai.
		
	}


}