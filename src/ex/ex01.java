package ex;
import java.util.*;
public class ex01 {
	/*
	 * Topic: 請寫一個程式，用陣列儲存使用者輸入的 n 個整數，透過函式 var() 
	 * 可以回傳計算該陣列裡的數字的變異數後再列印出結果。
	 * Date: 2016/10/24
	 * Author: 105021027 陳宴湘
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();//幾個N
		
		System.out.print(var(n));
	}
		public static float var(int n){
		Scanner scn = new Scanner(System.in);
		int data[]= new int[n];
		float sum=0,sum2=0,sum3=0,sum4=0,sum5=0,sum6=0;
		for(int i=0;i<n;i++){
		 data[i]=scn.nextInt();
		 sum+=data[i];
		}
		sum2= sum/n;
		for(int j=0;j<n;j++){
	    sum3=data[j]-sum2;
	    sum4=sum3*sum3;
	    sum5+=sum4;
		
		sum6 = sum5/n;
	}
		return sum6;
}
		}