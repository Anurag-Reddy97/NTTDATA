package unique;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int n=12345;
      int i=1;
      int arr[] = new int[5];
      while(i<n)
		{
	    int num=n%10;
		 arr[i] = num;
		n=n/10;
		}
      System.out.println(arr[i]);
		
	}

}
