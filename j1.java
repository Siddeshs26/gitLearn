class j1
{
    static int reverse(int x)
    {
        int t = 0;
        while(x>0)
        {
            t = t*10+x%10;
            x/=10;
        }
        return t;
    }
    public static void main(String args[]){
        int A[]={1,2,3,4,5,6};
        System.out.println(A);//without loop we can't print entire array
        // for(int x:A)System.out.print(" "+x);
        // int temp = A[0];
        // for(int i=0; i<A.length-1;i++){
        //     A[i]=A[i+1];
        // }
        // A[A.length-1]=temp;
        // for(int x:A)System.out.print(" "+x);
        

        //reversing an array
        // int t=(int)A.length/2;
        // int l = A.length-1;
        // for(int i=0;i<t;i++){
        //     int temp = A[i];
        //     A[i]=A[l];
        //     A[l]=temp;
        //     l--;
        // }
        // for(int x:A)System.out.print(" "+x);



        // //matrix multiplication
        // int X[][] = {{1,2,3},{4,5,6},{7,8,9}};
        // int Y[][] = {{1,2,3},{4,5,6},{7,8,9}};
        // int r = X.length;
        // int c = Y[0].length;
        // int Z[][] = new int[r][c];
        // for(int i=0 ; i<X.length ; i++)
        // {
        //     for(int j=0 ; j<X[0].length ; j++)
        //     {
        //         for(int k=0 ; k<X[0].length ; k++)
        //         {
        //             Z[i][j] += (X[i][k]*Y[k][j]);
        //         }
        //     }
        // }
        // for(int x[]:Z)
        // {
        //     for(int y:x)
        //     {
        //         System.out.print(y+" ");
        //     }
        //     System.out.println("");
        // }
        int x = 1234;
        // int t = 0;
        System.out.println(reverse(x));
        
    }
}