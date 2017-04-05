class FreshJuice {
   enum FreshJuiceSize{ SMALL, MEDIUM, LARGE }
   FreshJuiceSize size;
}

public class Sample {
	public static void main(String args[]) {
	      FreshJuice juice = new FreshJuice();
	      juice.size = FreshJuice.FreshJuiceSize.MEDIUM ;
	      juice.size = FreshJuice.FreshJuiceSize.SMALL ;
	      System.out.println("Size: " + juice.size);
	   }
}
