package JavaCoding;

public class ex8 {
    public static void main(String[] args) {
		int a[]={3,10,6,2,4};
		int i=0,j=0;
		for(i=0;i<a.length;i++){
		    int key=a[i];
		    j=i-1;
		    while(j>=0 && a[j]>key){
		        a[j+1]=a[j];
		        j--;
		   }
		   a[j+1]=key;
		}
		for(int k=0;k<a.length;k++)
	    System.out.print(a[k]+" ");
	}
}
