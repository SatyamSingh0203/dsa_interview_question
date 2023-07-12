package arithmetic;

public class DiplicateNUmberFromArray {
	public static void main(String[] args) {

		int a[] = { 2,7, 3, 2, 3, 4, 3, 4,7,7,7,4,3 };
		for (int i = 0; i < a.length; i++) {
			int x=a[i];
          int count=0;
          if(a[i]==-1)
        	  continue;
          for(int j=0;j<a.length;j++) {
        	  if(a[j]==x) {
        		  count++;
        		  a[j]=-1;
        	  }
          }
          System.out.println(x+"-->"+count);
          
		}
	}
}
