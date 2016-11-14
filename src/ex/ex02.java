package ex;
import java.util.*;
public class ex02 {
	/*
	 * Topic: 承上題，除了var() 函數之外，再用建立一個 std() 函數，
	 * 程式在接收完使用者輸入的一維整數陣列之後，呼叫std()函式可得到陣列的標準差，
	 * 特別注意，不要只用 std() 函數算結果，必須由std()去呼叫 var() 函數之後回到 std() 函式處理完再傳回給主程式，
	 * 主程式再把結果印出。
	 * 可以回傳計算該陣列裡的數字的變異數後再列印出結果。
	 * Date: 2016/10/24
	 * Author: 105021027 陳宴湘
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();//幾個N
		
		System.out.print(std(n));
		
	}
	public static double std(int n){
		
		return Math.pow(var(n),1/2f);
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