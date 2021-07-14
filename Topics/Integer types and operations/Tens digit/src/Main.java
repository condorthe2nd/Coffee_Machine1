import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        
              Scanner scanner = new Scanner(System.in);
		
	        String nStr = scanner.next();
	        int N = Integer.parseInt(nStr);
			int i;
	        
	        if (N >= 0 & N <= 1000000 ){
	            
	        	i = nStr.length();
	            System.out.println(nStr.charAt(nStr.length()-2));
	        }
    }
}
