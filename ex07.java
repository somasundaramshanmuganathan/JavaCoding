package JavaCoding;

public class ex07 {
    public static void main(String[] args) {
		int a[]={4,6,8,3,9,-1,5,2};
		int i=0,j=0;
		for(i=0;i<8-1;i++){
		   for(j=0;j<8-1-i;j++){
		       if(a[j]>a[j+1]){
		           int t=a[j];
		           a[j]=a[j+1];
		           a[j+1]=t;
		       }
		   }
		}
		for(int k=0;k<8;k++)
	    System.out.print(a[k]+" ");
	}
}
