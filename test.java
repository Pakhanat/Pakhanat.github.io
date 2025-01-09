public class test{
    public static void main(String[] args){

    for(int j = 0; j < 5; j++){
        
        

        for(int i = 1; i < 5-j; i++){
            System.out.print(i);
        }

        System.out.println(" ");

    }

    for(int i = 0; i < 5; i++){

        for(int j = i+1; j < 5; j++){
            System.out.print(j);
        }

        System.out.println(" ");
    }
        
    }
}
