  public ArrayList<Integer> getRow(int rowIndex) {
        
        ArrayList<Integer> res = new ArrayList<Integer>();
        if (rowIndex < 0)
            return null;
            
        res.add(1);
        
        if (rowIndex == 0)
            return res;
            
        for (int i = 1; i <= rowIndex; i++) {
            int len = res.size();
            ArrayList<Integer> temp = new ArrayList<Integer>();
            for (int j = 0; j < len; j++) {
                if (j == 0) {
                    temp.add(1);
                }
                
                if (j == len-1) {
                    temp.add(1);
                } else {
                    temp.add(res.get(j) + res.get(j+1));
                }
            }
            res = temp;  
        }
        
        return res;
    }
}
