public class Solution {
	public ArrayList<Integer> plusOne(ArrayList<Integer> A) {
	    long out=0;
	    int pow =0;
	    for(int i=A.size()-1;i>=0;i--){
	        out= (out+A.get(i)*Math.pow(10,pow));
	        pow++;
	    }
	    out=out+1;
	   LinkedList<Integer> stack = new LinkedList<Integer>();
        while (out > 0) {
            stack.push( out % 10 );
            out = out / 10;
        }
        ArrayList<Integer> my = new ArrayList<Integer>(stack);
        return my;
	}
}
