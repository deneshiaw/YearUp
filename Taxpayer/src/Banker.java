
public class Banker implements ITaxPayer {

	private double m_income;
	private boolean m_donePayingTaxes = false;
	public Banker(double income)
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
			System.out.println("Banker already payed taxes and doesnt have to pay again.");
		}
	}

	public void FileTaxReturn() {
		{
			if (m_donePayingTaxes)
			{
				System.out.println("Banker has filed tax return");
			}
			else
			{
				System.out.println("Banker needs to pay taxes before filing tax return");
			}
		}
	}




}















