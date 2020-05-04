import java.util.ArrayList;

public class Fibonacci {
	public static void main(String[] args) {
		
		
		ArrayList<Integer> fibonacci = new ArrayList<Integer>();
        fibonacci.add(0);
        fibonacci.add(1);
        
        
        int i =0;
        int j=1;
        while(fibonacci.size() < 31) {
        	

      
        fibonacci.add(fibonacci.get(i) + fibonacci.get(j));
        i++;
        j++;
    	   
        }
    


        System.out.println(fibonacci.get(5));
        }
	
	

}
