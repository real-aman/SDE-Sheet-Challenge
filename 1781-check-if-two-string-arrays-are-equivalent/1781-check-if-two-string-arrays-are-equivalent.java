class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder str1=new StringBuilder();
        StringBuilder str2=new StringBuilder();

        for(String i:word1){
            str1.append(i);
        }

        for(String i:word2){
            str2.append(i);
       }

        String a=str1.toString();
        String b=str2.toString();

        return a.equals(b);

    }
}