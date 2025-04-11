import java.util.*;
public class sortalphabates
{
	public static void main(String[] args)
	{

		String arr[]={"Shrisha","Bhagyashri","Satish","Dipali","Arush","Kiara"};
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}

		Arrays.sort(arr);
		System.out.println("After Soarting :");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}


	}
}

	