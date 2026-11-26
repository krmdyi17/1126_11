import java.util.Scanner;

class Bug{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();

        int[] A = new int[N];
        for(int i=0; i<N; i++){
            A[i] = sc.nextInt();
        }

        int bug = 0;
        for(int i=0; i<N; i++){
            if(A[i] == X){
                bug += 1;
            }
        }
    System.out.println(bug);
    }
}


        
