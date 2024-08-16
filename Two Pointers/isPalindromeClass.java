import java.util.Scanner;

public class isPalindromeClass {
    public boolean isPalindrome(String input){
        boolean flag=true;
        
        input=input.replace(" ","");
        input = input.toLowerCase();
        int l=0,r=input.length() -1;
        while(l<=r){
            if(input.charAt(l)==input.charAt(r)){
                flag=true;
            }else{
                flag=false;
                break;
            }
            l++;
            r--;
        }
        return flag;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.print("enter input string: ");
        String input = sc.nextLine();
        isPalindromeClass obj = new isPalindromeClass();
        if (obj.isPalindrome(input)==true){
            System.err.println("true");
        }else{
            System.out.println("false");
        }
        // sc.close();
    }
}
