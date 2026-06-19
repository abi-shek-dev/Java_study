import java.util.*;

public class word_reversal {

    public static void reverse(String str){

        StringBuilder word = new StringBuilder();
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            
            if (ch == ' '){
                res.insert(0, word);
                res.insert(0, ' ');
                word.setLength(0);
            }
            else{
                word.append(ch);
            }

        }

        res.insert(0, word);

        System.out.println(res);

    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        reverse(str);

        sc.close();

    }
    

}
