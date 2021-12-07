
package programmationdynamiquefibvonaci;

/**
 *
 * @author JASMIN 
 */
public class ProgrammationDynamiqueFibvonaci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //System.out.println(fibonacci(100));
        System.out.println(fibonacciv(100));
    }
    static int fibonacci(int a){
        int b = 0;
        int indx1=0,indx2=1,inter;
        
        int[] t ={1,1};
        if(a ==0 || a == 1){
            return t[0];
        }else{
            for(int i=0;i<=a-2;i++){
                t[indx1]=t[indx1]+t[indx2];
                inter = indx1;
                indx1 = indx2;
                indx2 = inter;
            }
            b=t[indx2];
        }
        
        return b;
    }
    static int fibonacciv(int a){
        int b = 0;
        if(a ==0 || a == 1){
            b= 1;
        }
        else{
            b= fibonacciv(a-1)+fibonacciv(a-2);
       }
        return b;

    }
}       
