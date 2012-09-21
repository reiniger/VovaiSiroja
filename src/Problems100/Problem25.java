package Problems100;
public class Problem25 {
	public static void main(String[] args){
		int sum = 0, index = 2;
		boolean flag = true;
		int[] num1 = new int[1000];
		int[] num2 = new int[1000];
		int[] num3 = new int[1000];
		int[] buffer = new int[1];
		num1[0] = 1;
		num2[0] = 1;
		
		while(flag){
			index++;
			for(int i=0; i<num2.length; i++){
				
				sum = num1[i] + num2[i] + num3[i];
				if(sum > 9){
					num3[i+1] = 1;
					num3[i] = sum - 10;
				}
				else
					num3[i] = sum;
				
					
			}
			/*
			for(int e: num3){	
				System.out.print(e + " ");
			}
			
			System.out.println(" ");
			*/
			buffer = num1;
			num1 = num2;
			num2 = num3;
			num3 = buffer;
			
			//making num3 blank
			for(int i=0; i<num3.length; i++)
				num3[i] = 0;
			
			if(num2[999] > 0)
				flag = false;
		}
		System.out.println("F" + index + " is 1000th");
	}
}