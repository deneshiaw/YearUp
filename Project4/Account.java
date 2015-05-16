gpublic class Account 
{
	private int m_accountId = -1;
	private String m_accountName;
	private int m_customerId = -1;
	private double m_amount = 0.0;
	/*using constructor to create object with account id, account name, and customer id.*/
	public Account (int accountId, String accountName, int customerId)
	{
		SetAccountId(accountId);
		SetAccountName(accountName);
		SetCustomerId(customerId);
	}
	/*setting and getting account id*/
	public int GetAccountId()
	{
		return m_accountId;
	}
	private void SetAccountId(int accountId)
	{
		m_accountId=accountId;
	}
	/*setting and getting the account name*/
	public String GetAccountName()
	{
		return m_accountName;
	}
	private void SetAccountName(String accountName)
	{
		m_accountName = accountName;
	}
	/*setting and getting the customer id*/
	public int GetCoustomerId()
	{
		return m_customerId;
	}
	private void SetCustomerId(int customerId)
	{
		m_customerId = customerId;
	}
	/*update the amount when the customer says to do it*/
	private void UpdateAmount(double newAmount)
	{
		m_amount = newAmount;
	}
	public double GetAmount()
	{
		return m_amount;
	}

	public void UpdateAmountSecurely(double newAmount)
	{
		m_amount = newAmount;
	}
	public void UpdateAmountSecurely(double newAmount, String password)
	{
	/*if correct password is entered then update the amount*/
	if (password !=null)
	{
	if(password.equals("admin"))
	{
	UpdateAmount(newAmount);
	System.out.println("Update amount in account id" + m_accountId + "to" + m_amount);
	}
	else
	{
		System.out.println("Call the police! Unsecure access!!");
			}
	}
	else
		{
		System.out.println(�Null password submitted, please check and resubmit.�);
	}
		}
		
	}
}


