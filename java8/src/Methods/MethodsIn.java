package Methods;

public interface MethodsIn {
	public void abst();   // har ek interface ki ek abstrct method to hoti hi hoti hai aur iski body test m banai h
	
	public default void def()
	{
		System.out.println("this is default method");
	}
	public static void stat()
	{
		System.out.println("this is static ");
	}
	
	

}
