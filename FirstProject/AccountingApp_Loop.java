

public class AccountingApp_Loop {

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
		
        double valueOfSupply = 10000.0;
        double vatRate = 0.1;
        double expenseRate = 0.3;
        double vat = valueOfSupply * vatRate;
        double total = valueOfSupply + vat;
        double expense = valueOfSupply * expenseRate;
        double income = valueOfSupply - expense;

        

    
        		
 
        System.out.println("Value of supply : " + valueOfSupply);
        System.out.println("VAT : " + vat);
        System.out.println("Total : " + total);
        System.out.println("Expense : " + expense);
        System.out.println("Income : " + income);
        
        
        
        double[] dividendRates= new double[3];
        dividendRates[0]=0.5;
        dividendRates[1]=0.3;
        dividendRates[2]=0.2;
        
        int i=0;
        while(i < dividendRates.length){System.out.println("Dividend" +  + (i+1) + ':'  + income * dividendRates[i]);
        	i=i+1;
        }
  
  
		
		
	}

}

