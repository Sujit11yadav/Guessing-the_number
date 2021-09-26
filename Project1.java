import java.util.Scanner;
public class Project1{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int mynumber= (int)(Math.random()*100);
        int usernumber=0;

        do{
            System.out.println("Guess the Number(1-100): ");
            usernumber = sc.nextInt();
            if(usernumber==mynumber){
                System.out.println("Yeah You are Right!!!");
                break;
            }
            else if(usernumber>mynumber){
                System.out.println("Number is too Large !!!");
            }
            else{
                System.out.println("Number is too Small !!!");
            }
        }
        while(mynumber>=0);
        System.out.println(" My Number Was:: ");
        System.out.println(mynumber);

    }
}