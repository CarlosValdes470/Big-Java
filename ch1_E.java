
/*
E1-2: Write a program that prints the sum of the first ten positive integers, 1 + 2 + … + 10.
E1-3: Write a program that prints the product of the first ten positive integers, 1 × 2 × … ×
10. (Use * to indicate multiplication in Java.)

*/
public class ch1_E {
 public static void main (String[] args){
    //E1-2
    int i;
    int sum = 0;
    int product = 1;

    for(i = 1; i <= 10; i++)
    {
        sum += i;
    }
    
    System.out.println("Sum: "+ sum);

    //E1-3
    for(i = 2; i <= 5; i++)
    {
        product *= i;
    }

    System.out.println("Product: "+ product);
 }   
}
