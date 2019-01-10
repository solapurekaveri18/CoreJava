package Basics;

public class arrayMinMaxNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int abc [][] = {{300,5,9},{-1,555,6},{0,0,1}};
		
		int min= abc[0][0];
		 for (int i=0; i<3; i++){
			 
			 for (int j=0; j<3; j++){
				 
				 if (abc[i][j]<min){
					 
					 min= abc[i][j];
				 }
			 }
			 
		 }
		 System.out.println(min);
	
		 int max= abc[0][0];
		 for (int i=0; i<3; i++){
			 
			 for (int j=0; j<3; j++){
				 
				 if (abc[i][j]>max){
					 
					 max= abc[i][j];
				 }
			 }
			 
		 }
		 System.out.println(max);
	}

}
