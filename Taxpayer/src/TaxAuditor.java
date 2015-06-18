
public class TaxAuditor 
{
	public void Audit(ITaxPayer taxpayer)
	{
		System.out.println(taxpayer.getClass() + " has been audited");
	}
}
