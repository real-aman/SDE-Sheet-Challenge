class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0],b[0]));
        Stack<int []> st = new Stack();
        st.add(intervals[0]);

        for(int i=1;i<intervals.length;i++){
            int startpoint2=intervals[i][0];
            int endpoint2=intervals[i][1];

            int [] poped= st.pop();
            int startpoint1=poped[0];
            int endpoint1=poped[1];
            int endmax=Math.max(endpoint1,endpoint2);

            if(endpoint1>=startpoint2){
                int[] merge=new int[]{startpoint1,endmax};
                st.add(merge);
            }else{
                st.add(poped);
                st.add(intervals[i]);
            }
        }

        int[][] output= new int[st.size()][2];

        for(int i=output.length-1;i>=0;i--){
            int poping[]=st.pop();
            output[i][0]=poping[0];
            output[i][1]=poping[1];

        }

        return output;
    }
}