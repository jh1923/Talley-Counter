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
	
	//starting at any number of choice
	public TalleyCounter(int startNum)
	{
		count = startNum;
	}
	
	//clicker
	public void click()
	{
		count++;
	}
	
	//reset
	public void reset()
	{
		count = 0;
	}
	
	//get count
	public void getCount()
	{
		System.out.print("The count is" + count);
	}
	
	//unclick
	public void unclick()
	{
		count--;
	}
}
