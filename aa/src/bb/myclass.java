package bb;

public class myclass {
	
		private int section;
		private static int slno;
		
		static {
			System.out.println("within static block");
			slno=1000;
		}
		myclass(){
			System.out.println("within default constructor");
		}
		public static void display() {
			System.out.println(slno);
			//System.out.println(section);
			
		}
		@Override
		public String toString() {
			return "myclass [section=" + section + " ,  src=" +slno+"]";
		}
		
	}

