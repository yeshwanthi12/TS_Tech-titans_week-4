package Arrays;

public class RemoveArray {
	public static void main(String args[]) {
		
		int[] intArr = {1,3,4,6,7,8};
		int elem = 4;
		for(int i = 0; i < intArr.length; i++){
            if(intArr[i] == elem){
            	 System.out.println(intArr[i]);
                // shifting elements
                for(int j = i; j < intArr.length - 1; j++){
                    intArr[j] = intArr[j+1];
                    System.out.println("inside j");
                    System.out.println(intArr[j]);
                    System.out.println(intArr[j+1]);
                }
                break;
            }
        }
      
        System.out.println("Elements -- " );
        for(int i = 0; i < intArr.length; i++){
            System.out.print(" " + intArr[i]);
        }     
		

}
}
