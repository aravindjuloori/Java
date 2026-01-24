package programs;

public class SmallestNumberinArray {

	public static void main(String[] args) {
		
		
		int num[]= {20,22,18,35,48,26,70,1,86};
		
		int smallestnumber=num[0];
		
		int length=num.length;
		//System.out.println(length);
		
		for(int n:num) {
			if(smallestnumber>n) {
				smallestnumber=n;
			}
		}
		System.out.println("Smallest number in the array is :" +smallestnumber);
		
		
		
		int num1[]={20,22,18,35,48,26,70,1,86};
		int biggestNumer=num1[0];
		
		for(int n1:num1) {
			if(biggestNumer<n1) {
				biggestNumer=n1;
			}
		}
		System.out.println("Biggest number in the array is :" +biggestNumer);

	}
	
	
	
	
	

}
