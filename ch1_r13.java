/**
 
R13: Write an algorithm to settle the following question: A bank account starts out with
$10,000. Interest is compounded monthly at 6 percent per year (0.5 percent per
month). Every month, $500 is withdrawn to meet college expenses. After how many
years is the account depleted?

 */
public class ch1_r13 {

    public static void main(String[] args) {
        
        //calculate the monthly interest/expenses at a yearly rate and divide by the budget
        int budget = 10000;
        int yearly_Expenses = 500*12;
        double yearly_Interest = budget*0.06;

        System.out.println("Years left intil funds on account are depleted: " + budget/(yearly_Expenses+yearly_Interest));
         
    }
}