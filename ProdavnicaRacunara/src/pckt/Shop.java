package pckt;
import java.util.ArrayList;

public class Shop {

	private ArrayList<Article> store;
	
	public Shop()
	{
	    store = new ArrayList();
	}
	
	public void sale(Article a)
	{
	    store.remove(a);
	}
	
	public Integer left()
	{
	    return store.size();
	}
	
	public void aadd (Article a)
	{
	    store.add(a);
	}
	
	public void ispis()
	{
	    for (Article a:store)
	    {
	        System.out.println(a);
	    }
	}
	
}