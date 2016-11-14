package ex;
import java.util.*;
public class ex04 {
	/*
	 * Topic: 讓使用者輸入一個正整數 n，接著使用遞迴呼叫印出 n! 的結果。
	 * 可以回傳計算該陣列裡的數字的變異數後再列印出結果。
	 * Date: 2016/10/24
	 * Author: 105021027 陳宴湘
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		System.out.print(fun(n));
	}
		public static int fun(int x){
			if(x==1){
				return 1;
			}else{
				return x + fun(x-1);
			}
				}
			
			
		}
		
		