class Solution {
    public int[][] diagonalSort(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;

        for(int i=0;i<n;i++){
            doSort(mat,0,i,m,n);

        }

        for(int i=1;i<m;i++){
            doSort(mat,i,0,m,n);
        }
        return mat;
        
    }

    void doSort(int [][] mat,int row, int col,int m,int n ){
        List<Integer> values=new ArrayList<>();
        int r=row;
        int c=col;

        while(r<m && c<n){
            values.add(mat[r][c]);
            r++;
            c++;
        }

        Collections.sort(values);
        r=row;
        c=col;

        int index=0;
        while(r<m && c<n){
            mat[r][c]=values.get(index++);
            r++;
            c++;
        }
        
    }
}