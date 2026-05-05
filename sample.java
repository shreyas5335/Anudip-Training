class sample
{
    public int longestSubStringWithoutRepeatingCharecters(String s){
        int [] lastSeen=new int[256];
        for(int i=0;i<256;i++){
            lastSeen[i]=-1;
        }
        int left=0;
        int maxLength=0;
        for(int right=0;right<s.length;right++){
            int c=s.charAt(right);
            if(lastSeen[c]>=left){
                left=lastSeen[c]+1;
            }
            lastSeen[c]=right;
            maxLength=Math.max(maxLength,right-left+1);
        }
        return maxLength;
    }
public static void main(String args[] )
{    
    String s="Shubham";
    int max=longestSubStringWithoutRepeatingCharecters(s);
    System.out.Println(max);
}
}