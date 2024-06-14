package cc;

public class FinalVariable {
	
	final int x=100;
	final static int y;
	final static int z=10;
	void change() {
		//x=10;
		//y=20;
	}
	
	
	@Override
	public String toString() {
		return "FinalVariable [x=" + x + ",y="+y+"]";
	}
	
	static{
		y=20;
		System.out.println("value y"+y);
	}
	

}
