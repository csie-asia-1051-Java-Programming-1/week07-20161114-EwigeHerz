package ex;
import java.util.*;
public class ex04 {
	/*
	 * Topic: ���ϥΪ̿�J�@�ӥ���� n�A���ۨϥλ��j�I�s�L�X n! �����G�C
	 * �i�H�^�ǭp��Ӱ}�C�̪��Ʀr���ܲ��ƫ�A�C�L�X���G�C
	 * Date: 2016/10/24
	 * Author: 105021027 ���b��
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
		
		