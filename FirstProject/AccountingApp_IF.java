

public class AccountingApp_IF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Value of supply :"+10000.0);
		System.out.println("VAT :"+ (10000.0*0.1));
		System.out.println("Total :"+ (10000.0+10000.0*0.1));
		System.out.println("Expense :"+ (10000.0*0.3));
		System.out.println("Expense :"+ (10000.0*0.3));
		System.out.println("Income :"+ (10000.0-10000.0*0.3));
		System.out.println("Dividend 1 :"+ (10000.0-10000.0*0.3)*0.5);
		System.out.println("Dividend 2 :"+ (10000.0-10000.0*0.3)*0.3);
		System.out.println("Dividend 3 :"+ (10000.0-10000.0*0.3)*0.2);
		
		
		System.out.println("===========================");
		
        double valueOfSupply = Double.parseDouble(args[0]);
        double vatRate = 0.1;
        double expenseRate = 0.3;
        double vat = valueOfSupply * vatRate;
        double total = valueOfSupply + vat;
        double expense = valueOfSupply * expenseRate;
        double income = valueOfSupply - expense;
        double dividend1 = income<10000?income * 1: income * 0.5;
        double dividend2 = income<10000?income * 0: income * 0.3;
        double dividend3 = income<10000?income * 0: income * 0.2;
 
        System.out.println("Value of supply : " + valueOfSupply);
        System.out.println("VAT : " + vat);
        System.out.println("Total : " + total);
        System.out.println("Expense : " + expense);
        System.out.println("Income : " + income);
        System.out.println("Dividend 1 : " + dividend1);
        System.out.println("Dividend 2 : " + dividend2);
        System.out.println("Dividend 3 : " + dividend3);
        System.out.println(income < 10000.0 ? "dd":"zz");
		
		
	}

}

