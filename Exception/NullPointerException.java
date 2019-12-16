package Exception;

public class NullPointerException {
	public static void main(String args[]) {
		try
		{
		String name=null;
		System.out.println("name is:" +name.length());
	}
		catch(Exception e)
		{
			System.out.println("wrong inputs" +e);
		}
		finally
		{
			System.out.println("Hello");
		}

}
}
