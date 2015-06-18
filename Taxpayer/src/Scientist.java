
public class Scientist implements ITaxPayer {

	private double m_income;
	private boolean m_donePayingTaxes = false;
	
	public Scientist(double income)
	{
		SetIncome(income);
	}
	public double getIncome()
	{
		return m_income;
	}
	private void SetIncome(double income)
	{
		m_income = income;
	}

	public void PayTaxes(double taxRate)
	{
		if(!m_donePayingTaxes)
		{
			double taxes = taxRate * getIncome();
			double newIncome = getIncome() - taxes;
			SetIncome(newIncome);
			m_donePayingTaxes = true;
		}
		else
		{
			System.out.println("Banker already payed taxes and doesn't have to pay again.");
		}
	}

	public void FileTaxReturn() {
		{
			if (m_donePayingTaxes)
			{
				System.out.println("Scientist has filed tax return");
			}
			else
			{
				System.out.println("Scientist needs to pay taxes before filing tax return");
			}
		}

	}
	public static void main(String[] args) 
	{
		Banker Deneshia = new Banker(120000.00);
		Deneshia.PayTaxes(0.33);
		Deneshia.FileTaxReturn();
		
		SchoolTeacher Joshua = new SchoolTeacher(50000.00);
		Joshua.PayTaxes(.23);
		Joshua.FileTaxReturn();
		
		Scientist Mike = new Scientist(90000.00);
		Mike.PayTaxes(.23);
		Mike.FileTaxReturn();
		
		TaxAuditor Lyla = new TaxAuditor();
		Lyla.Audit(Deneshia);
		Lyla.Audit(Joshua);
		Lyla.Audit(Mike);
	}
	
}


