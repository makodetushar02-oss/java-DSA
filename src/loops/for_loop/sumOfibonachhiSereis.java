package loops.for_loop;
import java.util.*;
public class sumOfibonachhiSereis {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            if(sc.hasNextInt()){
                int n = sc.nextInt();
                int TargetIntdex = 2*n;

                int a = 0;
                int b =1 ;
                long sum = 0;

                for(int i =2 ; i<=TargetIntdex; i++){
                    int fibonachi = a + b ;
                    if(i%2 == 0){
                        sum += fibonachi;
                    }
                    a = b;
                    b = fibonachi;
                }
                System.out.println(sum);
            }
            sc.close();
        }
    }
