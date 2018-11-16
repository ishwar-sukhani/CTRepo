package hackerrank;

import java.util.Scanner;

class Formula{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int exp = a + (int) Math.pow(2,0) * b;
            System.out.print(exp);
            for(int j=1;j<n;j++){
                    exp += ((int)(Math.pow(2,j))) * b;
                    System.out.print(" " +exp);
            }
            System.out.println();
        }
        in.close();
    }
}
