import java.util.Scanner;

public class SpecialSubsequences {
    public int FindofSequence(String st){
        int total =0;
        int a_count =0;
        for(int i=0;i<st.length();i++){
            if(st.charAt(i) == 'A'){
                a_count++;
            }
            if(st.charAt(i)=='G'){
                total = total+a_count;
            }
        }
        return total;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Sequence: ");
        String word = sc.next();
        SpecialSubsequences answer = new SpecialSubsequences();
        System.out.println(answer.FindofSequence(word));
    }
}