public class Solution {
	public ArrayList<Integer> plusOne(ArrayList<Integer> A) {
	    ArrayList<Integer> st = new ArrayList<Integer>();
	    int length=A.size()-1;
	    int last = A.get(length);
	    boolean carry = false;
	    boolean extra= false;
	    if(last ==9) carry=true;
	    while(carry){
	           st.add(0);
	           if(length<1){
	               extra= true;
	               break;
	           }
	           int element = A.get(length-1);
	           if(element==9){
	               carry=true; 
	           }
	           else carry=false;
	           length--;
	    }
	    if(!extra){
	        st.add(A.get(length)+1);
	        length--;
	        for(int i=length;i>=0;i--){
	            st.add(A.get(i));
	        }
	    }
	    else{st.add(1);}
	    boolean zeroCheck = false;
	    int outLen =st.size()-1;
	    if(st.get(outLen)==0){zeroCheck = true;}
	    while (zeroCheck){
	        st.remove(outLen);
	        if(length<1){
	            break;
	        }
	        int element = st.get(outLen-1);
	        if(element ==0) zeroCheck = true;
	        else zeroCheck = false;
	        outLen--;
	    }
	    
	    Collections.reverse(st);
	    return st;
	    
	}
}
