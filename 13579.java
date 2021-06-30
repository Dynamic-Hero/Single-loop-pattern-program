public class 13579{
public static void main(String [] args){
/*
1
13
135
1357
13579
    */
        int rev = 0 ;
        for(int i = 1 ; i <= 10 ; i = 2 + i){
            rev = (rev * 10)+i;
            System.out.println(rev);
        }
     }
}