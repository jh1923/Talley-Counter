/**
 * 
 * @author jhu19
 * Talley Counter
 *
 */
public class TalleyCounter 
{
	// Instance variable
	private int count;
	
	//Constructor: starting at 0
	public TalleyCounter()
	{
		count = 0;
	}
	
	//Constructor: starting at any number of choice
	public TalleyCounter(int startNum)
	{
		count = startNum;
	}
	
	//Constructor: clicker
	public void click()
	{
		count = count + 1;
	}
}