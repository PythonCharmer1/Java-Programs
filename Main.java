import java.util.Scanner; 

class Main {
  public static void main(String[] args) {
    Scanner myObject = new Scanner(System.in);  
    System.out.println("Enter Number");
    int number = myObject.nextInt();   
    int minus = number - 1;
    boolean isprime = true;
    String name = "1 ";
    boolean isnotprime = false;
    for(int i = 2; i<= minus; i++){
        if (number % i == 0 ) {
            name += i + " ";
            isprime = false;
            isnotprime = true;
        }
        else{}
    }
    if (isnotprime == false ){System.out.println("Your Number is prime");}
    else {
        System.out.println("Your Number is not prime");
    }
    System.out.println("Here are the factors:");   
    System.out.println(name+number); 
  }
}
