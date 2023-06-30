class Solution {
    public int countPoints(String rings) {
        int arr[]={1,2,4};
        int a[]=new int[10];
        for(int i=0;i<rings.length();i+=2){
            char clr=rings.charAt(i);
            int index=0;
            if(clr=='G'){
                index= 1;
            }else if (clr=='B'){
                index=2;
            }

            int rod=rings.charAt(i+1)-'0';
            a[rod]=a[rod] | arr[index];

        }

        int c=0;
        for(int i:a){
            if(i==7){
                c++;
            }
        }

        return c;
    }
}