
public class Ex2 {

	public static void main(String[] args) {
		recursivaStackOver(1);
		}
	
		
	 public static int recursivaStackOver (int c){
		 int b = c + 1;
		 return recursivaStackOver(b);
		}

	}


