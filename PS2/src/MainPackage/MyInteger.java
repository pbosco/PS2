package MainPackage;

public class MyInteger {
	
	public static void main(String[] args){
		//TESTS
		MyInteger evennum = new MyInteger(8);
		System.out.println(evennum.isEven());
		System.out.println(isEven(evennum));
		System.out.println(isEven(8));
		
		MyInteger oddnum = new MyInteger(21);
		System.out.println(oddnum.isOdd());
		System.out.println(isOdd(oddnum));
		System.out.println(isOdd(21));
		
		
		MyInteger primenum = new MyInteger(13);
		System.out.println(primenum.isPrime());
		System.out.println(isPrime(primenum));
		System.out.println(isPrime(11));
	
	
	
	
	
	}
	
	
	private int value;
	
	public MyInteger(int value){
		
		this.value = value;
		
	}
	public int getValue(){
		return value;
	}
	
	public int getValue (int value){
		return value;
	}
	
	public static int parseInt(char [] a){
		int result = 0;
		for (int i = 0; i < a.length; i++){
			result = result * 10 + (a[i] - '0');
		}
		return result;
	}
	
	public static int parseInt(String s){
		int i = Integer.parseInt(s);
		return i;
	}
	
	public boolean isEven(){
		if (value % 2 == 0){
			return true;
		}
		else return false;
	}
	
	public boolean isOdd(){
		if (value % 2 == 0){
			return false;
		}
		else return true;
	}
	
	public boolean isPrime(){
		int i;
		for(i = 2; i < value / 2; i++ ){
			if(value % i == 0){
				return false;
			}
		}
		return true;
	}
	
	public static boolean isEven(int p){
		if (p % 2 == 0){
			return true;
		}
		else 
			return false;
	}
	
	public static boolean isOdd(int p){
		if (p % 2 == 1){
			return true;
		}
		else return false;
	}
	
	public static boolean isPrime(int p){
		for (int i = 2; i < p / 2; i++ ){
			
			if (p % i == 0){
				return false;
				
			}
			
		}
		
		return true;
	}
	
	public static boolean isEven(MyInteger p){
		if (p.getValue() % 2 == 0) {
			return true;
		}
		else return false;
	}
	
	public static boolean isOdd(MyInteger p){
		if (p.getValue() % 2 == 1){
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean isPrime(MyInteger p){
		for (int i = 2; i < p.getValue() / 2; i++){
			if(p.getValue() % i == 0){
				return false;
			}
		}
		return true;
		
	}
	
	public boolean equals(int p){
		if (value == p){
			return true;
		}
		else{
			return false;
		}
	}
	
	public boolean equals(MyInteger p){
		if (p.getValue() == value){
			return true;
			
		}
		else{
			return false;
		}
	}	
	

}
