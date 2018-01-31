package homework_0124;

public class Zuhe {
	public static void main(String[] args) {
		int[] arr={1,2,3,4};
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				if(j!=i){
					for(int k=0;k<arr.length;k++){
					if(k!=i&&k!=j){
						int result=arr[i]*100+arr[j]*10+arr[k];
						System.out.println(result);
					}
				}
				
				}
			}
		}
	}
}
