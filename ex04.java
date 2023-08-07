package JavaCoding;

public class ex04 {
	public static void main(String[] args) {
		String s1="abbcdd";
		char a[]=s1.toCharArray();
		int n=2,i=1;
		for(int j=0;j<a.length-1;j++){
		    int k=j+1;
		    if(a[k]==a[j]){
		        i++;
		    }
		    if(a[k]!=a[j]){
		        i=1;
		    }
		    if(i==n){
		        while(i!=0){
		            a[k--]=0;
		            i--;
		        }
		        i=1;
		    }
		}
		System.out.print(a);
	}
}
