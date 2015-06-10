public class Solution {
	// DO NOT MODFIY THE LIST. 
	public int max(int a,int b){
	    return (a>b)? a : b;
}
	public int max(int a, int b , int c){
	    return max(max(a,b),c);
	}
	
	public int crossPoint(List<Integer> A, int first,int middle, int end){
	    int sum=0;
	    int leftSum=Integer.MIN_VALUE;
	    int rightSum= Integer.MIN_VALUE;
	    for(int i=middle; i>=first ;i--){
	        sum = sum+A.get(i);
	        if(sum>leftSum) leftSum = sum;
	    }
	    sum =0;
	    for(int i=middle+1 ;i<=end;i++){
	        sum = sum+A.get(i);
	        if(sum>rightSum) rightSum = sum;
	    }
	    
	    return leftSum+rightSum;
	    
	}
	
	
	public int mainFunction(List<Integer> A , int first , int end){
	    if(first ==end) return A.get(first);
	    
	    int middle = (first+end)/2;
        return max(mainFunction(A,first,middle),mainFunction(A,middle+1,end)
        ,crossPoint(A,first,middle,end));
	}
	public int maxSubArray(final List<Integer> A) {
	    return mainFunction(A,0,A.size()-1);
	}
