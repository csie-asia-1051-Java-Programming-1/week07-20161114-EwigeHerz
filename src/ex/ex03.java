package ex;
import java.util.*;

public class ex03 {
	/*
	 * Topic: �мg�@�ӵ{���A���ϥΪ̿�J�@�Ӿ�ƤG���}�C�A�إ� var2()�禡 ��std2()�i�H���O�p��G���}�C���ܲ��ƻP�зǮt�A
	 * �ç⵲�G�^�Ǩ�D�{���L�X
	 * Date: 2016/10/24
	 * Author: 105021027 ���b��
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    System.out.print(var2(n));
    System.out.print(std2(n));
    
	}
public static double std2(int n){
		
		return Math.pow(var2(n),1/2f);}


   public static float var2(int n){
	   Scanner scn = new Scanner(System.in);
	   int data[][]=new int[n][n];
	   float sum=0,sum2=0,sum3=0,sum4=0,sum5=0,sum6=0;
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				data[i][j]=scn.nextInt();
				sum+=data[i][j];
			}
			sum2= sum/n;
			for(int j=0;j<n;j++){
		    sum3=data[i][j]-sum2;
		    sum4=sum3*sum3;
		    sum5+=sum4;
			
			sum6 = sum5/n;
		}
			return sum6;
			}
		return sum6;
			
		}
		}
   
			