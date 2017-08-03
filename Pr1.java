package guviproject;
import java.util.*;
public class Pr1 {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String s1=s.next();
	int r=s1.length();
	
	int count=1;
	char ch[];
	int d=0;
	int n=0;
	ch=s1.toCharArray();
	for(int i=0;i<=r-1;i++){
		for(int j=i+1;j<r;j++){
			if(ch[i]==ch[j]){
				count++;
			}
		
		}
		if(count>d){
			n=i;
			d=count;
		}count=1;
	}
System.out.println(ch[n]+"occurenc"+d+"times");
	}

}
