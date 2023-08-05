package JavaCoding;

public class ex6 {
    public static void main(String[] args) {
		int a[]={2,8,4,-1,7,10,5,6};
		int i=0,j=0,mv=0,mi=0;
		for(i=0;i<7;i++){
		    mv=a[i];
		    mi=i;
		    for(j=i+1;j<8;j++){
		    if(a[j]<mv){
		        mv=a[j];
		        mi=j;
		    }
		        
		    }
		    int temp=a[i];
		    a[i]=a[mi];
		    a[mi]=temp;
		}
		for(i=0;i<8;i++){
		    System.out.print(a[i]+" ");
		}
	}
}
