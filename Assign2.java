import java.util.Scanner;
public class Assign2 {
    public static void main(String[] args)
{  
    Scanner myScanner=new Scanner(System.in);
    String n;
    char s;
    
    System.out.print("Enter a Sentence: ");
    n=myScanner.nextLine();
    System.out.print("Enter a Letter: ");
    s=myScanner.next().charAt(0);
    int pos = n.indexOf(s);
    if(pos >=0){

        char [] ch = n.toCharArray();
        for(int i = pos+1; i<n.length(); i++){
            System.out.print(ch[i]);
        }
    }else{
   
        System.out.println("Letter is not found!");
    }

}
}

