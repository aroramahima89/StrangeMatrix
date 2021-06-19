// geeksforgeeks coding try outs challenge
// { Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class A
{
    private int R,C;
    private int[] B;
    public void init(int _R,int _C,int[] _B)
    {
        R=_R;
        B=_B.clone();
        C=_C;
    }
    public int get(int i,int j)
    {
        assert(0<=i&&i<R&&0<=j&&j<C);
        if(B[i]>=j+1)
            return 0;
        return 1;
    }
}


// } Driver Code Ends
//User function Template for Java

class Solution{
    private A a;
    Solution(A a){
        this.a=a;
    }
    // do not edit this function
    // use it to get the value of A[i][j]
    int get(int i,int j){
        return a.get(i,j);
    }
    public int solve(int R,int C){
        int index=0;
        int ones=0;
        int max=ones;
        for(int i=0;i<R;i++){
            ones=0;
            for(int j=0;j<C;j++){
                if(get(i,j)==1){
                    ones+=1;
                }
            }
            if(ones>max){
                max=ones;
                index=i;
            }
        }
        return index;
    }
};

// { Driver Code Starts.
class GFG{
    public static void main(String args[]) throws IOException{
        A a=new A();
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int R=sc.nextInt();
            int C=sc.nextInt();
            int[] B=new int[R];
            for(int i=0;i<R;i++)
                B[i]=sc.nextInt();
            a.init(R,C,B);
            Solution obj=new Solution(a);
            int answer=obj.solve(R,C);
            System.out.println(answer);
        }
    }
}  // } Driver Code Ends