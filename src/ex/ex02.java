package ex;
import java.util.*;
public class ex02 {
	/*
	 * Topic: �ӤW�D�A���Fvar() ��Ƥ��~�A�A�Ϋإߤ@�� std() ��ơA
	 * �{���b�������ϥΪ̿�J���@����ư}�C����A�I�sstd()�禡�i�o��}�C���зǮt�A
	 * �S�O�`�N�A���n�u�� std() ��ƺ⵲�G�A������std()�h�I�s var() ��Ƥ���^�� std() �禡�B�z���A�Ǧ^���D�{���A
	 * �D�{���A�⵲�G�L�X�C
	 * �i�H�^�ǭp��Ӱ}�C�̪��Ʀr���ܲ��ƫ�A�C�L�X���G�C
	 * Date: 2016/10/24
	 * Author: 105021027 ���b��
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();//�X��N
		
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