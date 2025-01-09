import java.util.Scanner;

public class numbercheck {
    public static void main(String[] args){

        Scanner Scan = new Scanner(System.in);
        
        int a = 0;

        int[] Num;
        Num = new int[6];

        int[] Count;
        Count = new int[6];

        System.out.println("User input 5 numbers: ");
        
        for(int i = 0; i < 5; i++){
         
            System.out.print(i+1 + ".: ");
            int n = Scan.nextInt();
            a += n;

            Num[i] = n;
        }
        // System.out.println(a);
        
        System.out.println(" ");
        System.out.println(" ");
    /////////  
      
    for(int i = 0; i < 5; i++){

        if(Num[i] != a){

            Count[i] = 1;

          for(int j = i+1; j < 5; j++){

                if(Num[i] == Num[j]){
                
                  Count[i] = Count[i] +  1;

                  Num[j] = a;
                }
            }

            System.out.println(Num[i] + " = " + Count[i]);
        }
        // else{ System.out.print(" ");}
    }
          
    Scan.close();
        }
    }
