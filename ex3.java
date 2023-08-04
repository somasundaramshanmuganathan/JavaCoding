package JavaCoding;

public class ex3 {
    public static void main(String[] args) {
		String s1="wELCOME tO jAVA cODING";
		char a[]=s1.toCharArray();
		for(int i=0;i<a.length;i++){
		    if(a[i]>=97&&a[i]<=122){
		        a[i]-=32;
		    }
		    else if(a[i]>=65&&a[i]<=90){
		        a[i]+=32;
		    }
		}
		for(int i=0;i<a.length;i++){
		    System.out.print(a[i]);
		}
	}
}
