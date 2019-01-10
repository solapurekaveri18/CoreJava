package Basics;



public class isNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String regx="\\d+";
		String value="5,875";
		String Value1=value.replaceAll(",", "");
		System.out.println(Value1);
//		String cellValue[]=value.split(",");
//		for (int i=0; i < cellValue.length; i++)
//	    {
//	      System.out.println(cellValue[i]);
//	    }
//		String val1=cellValue[0].trim();
//		String val2=cellValue[1].trim();
//		if(val1.matches(regx) && val2.matches(regx)){
//			System.out.println("Total traffic cell contains numeric value"); 
//		}else{
//			System.out.println("Total traffic cell doesnot contains numeric value");
//		}
		if (Value1.matches("\\d+")){
			System.out.println("Total traffic cell contains numeric value"); 
		}
	}

}
