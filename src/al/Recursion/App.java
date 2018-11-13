package al.Recursion;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        reduceByOne(10);
     
	}
public static void reduceByOne(int r) {
	 if(r >=0) reduceByOne(r-1);
	 
	 System.out.println(r);
}
}
