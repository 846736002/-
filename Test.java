package test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

import com.test.domain.lottery;
/**
 * 一等奖   5+2                  浮动奖金 10000000
二等奖   5+1                  浮动奖金       100000
三等奖   5+0                                    浮动奖金	   10000
四等奖   4+2                    3000元 
五等奖   4+1                     600元 
六等奖   4+0或3+2                100元 
七等奖   3+1或2+2                 10元 
八等奖   3+0或1+2或2+1或0+2        5元
 * @author Administrator
 *
 */
public class Test {

	//1~35 1~12 5~2
	public static void main(String[] args) {
		//8, 14, 16, 24, 30, 33, 3, 11
		int[] temp = new int[]{2, 3, 6, 14, 27, 8, 11};
		ArrayList list = new ArrayList();
		for (int  ui : temp) {
			list.add(ui);
		}
		//System.out.println(list.size());
		System.out.println("我的钱"+Arrays.toString(getMoney(test1(),list)));
		
		System.out.println(" 真我的钱:"+getmoneysum(getMoney(test1(),list)));
		
		int[] ip = new int[7];
		
		for(int i = 0;i<20;i++){
			int[] itemp = test2(list);
			ip[0]  = ip[0]+itemp[0];
			ip[1]  = ip[1]+itemp[1];
			ip[2]  = ip[2]+itemp[2];
			ip[3]  = ip[3]+itemp[3];
			ip[4]  = ip[4]+itemp[4];
			ip[5]  = ip[5]+itemp[5];
		}
		System.out.println(Arrays.toString(ip));
		for(int ty=0;ty<7;ty++){
			BigDecimal bd = new BigDecimal((double)ip[ty]);
			BigDecimal bd1 = new BigDecimal(100000000);
			BigDecimal divide = bd.divide(bd1);
			System.out.println((double)ip[ty]/100000000+"||"+divide.stripTrailingZeros().toPlainString());
		
			/*
			 * 
			 * 
			 * 
			0.2
			0.3
			0.12
			
			2.0E-8||0.00000002
			1.09E-6||0.00000109
			1.199E-5||0.00001199
			4.358E-4||0.0004358
			0.00750912||0.00750912
			0.0680227||0.0680227
			
			7.0E-8||0.00000007
			1.36E-6||0.00000136
			1.172E-5||0.00001172
			4.3649E-4||0.00043649
			0.00751134||0.00751134
			0.06806733||0.06806733
			
			1.0E-8||0.00000001
			1.2E-6||0.0000012
			1.146E-5||0.00001146
			4.321E-4||0.0004321
			0.00751313||0.00751313
			0.0680155||0.0680155
			
			9.0E-8||0.00000009
			1.06E-6||0.00000106
			1.177E-5||0.00001177
			4.3278E-4||0.00043278
			0.00748764||0.00748764
			0.06803527||0.06803527
			
			6.0E-8||0.00000006
			1.03E-6||0.00000103
			1.155E-5||0.00001155
			4.3321E-4||0.00043321
			0.00752349||0.00752349
			0.06802379||0.06802379
			
			*/
		}
		
		//1000万次//0.811579//0.673451//0.7347295//0.870611//0.6823675//0.7766785//0.627274
		//2.715825//1.7172055
		//System.out.println("我的钱:"+getmoneysum(new int[]{2,1}));
		/*
		 * 
		3||112||1184||43824||751269||6802064
		100639810
		平均1.0063981
		
		4||125||1174||43457||750966||6803868
		112492400
		平均1.124924
		
		前面的都没有除2
		
		7||99||1150||43825||750673||6803788
		138590670
		平均0.69295335
		
		真我的钱:0
		1||8||106||4403||75426||680314
		16554430
		平均0.8277215
		
		500百万次
		0||4||60||2199||37310||339509
		3290445
		平均0.3290445
		
		0||4||58||2177||37346||340163
		3283675
		平均0.3283675	
		
		0||5||54||2146||37675||339791
		3416905
		平均0.3416905
		 */
		Integer[] testf = test(5,34);
		Integer[] teste = test(2,11);
		Arrays.sort(testf);
		Arrays.sort(teste);
		
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(2);
		a1.add(1);
		System.out.println("al.get(0):"+a1.get(0));
		ArrayList<Integer> a2 = new ArrayList<Integer>();
		a2.add(1);
		a2.add(2);
		a2.add(3);
		a2.add(4);
		a2.add(5);
		System.out.println(a1.equals(a2));
		
		Integer[] itemp = new Integer[5];
		Integer[] ii = new Integer[]{1,2,3,4,5};
		Integer[] ii1 = new Integer[]{1,2,3,4,5};
		/*System.out.println(Arrays.toString(ii));
		System.out.println(Arrays.toString(ii1));
		System.out.println(Arrays.toString(ii).equals(Arrays.toString(ii1)));
		System.out.println(ii.equals(ii1));
		System.out.println("Arrays.toString(ii):"+Arrays.toString(ii));
		System.out.println(Arrays.toString(a2.toArray(itemp)));
		System.out.println("Arrays.equals(ii, ii1):"+Arrays.equals(ii, ii1));
		System.out.println("Arrays.equals(ii, a2.toArray(itemp)):"+Arrays.equals(ii, a2.toArray(itemp)));*/
		//System.out.println(Arrays.toString(testf));
		//System.out.println(Arrays.toString(teste));
		System.out.println(test1());
	}
	//2+1
	public void sum(ArrayList list){
		int[] fl = new int[2];
		int el = 0;
		for (lottery l : (ArrayList<lottery>)list) {
			for(Integer i:l.ii){
				
			}
			int max = 0;
			
		}
	}
	

	public static int[] test2(ArrayList list) {
		int[] iii =new int[6];
		int sum=0;
		int ci = 5000000;
		int max=0;
		int count1=0;
		int count2=0;
		int count3=0;
		int count4=0;
		int count5=0;
		int count6=0;
		for(int i =0;i<ci;i++){
			int temp2 = getmoneysum1(getMoney(test1(),list));
			/*if(max<temp2)max=temp2;
			*/
			sum=sum+temp2;
			if(temp2==0){}
			else if(temp2==5){count6++;}
			else if(temp2==10){count5++;}
			else if(temp2==200){count4++;}
			else if(temp2==3000){count3++;}
			else if(temp2==150000){count2++;}
			else if(temp2==10000000){count1++;}
		}
		
			iii[0]=count1;
			iii[1]=count2;
			iii[2]=count3;
			iii[3]=count4;
			iii[4]=count5;
			iii[5]=count6;
		//System.out.println(count1+"||"+count2+"||"+count3+"||"+count4+"||"+count5+"||"+count6);
		//System.out.println(sum);
		//System.out.println("平均"+(double)sum/ci/2);
		return iii;
	}
	
	/*
	 * 这里写中奖数额
一等奖   5+2                  浮动奖金 10000000
二等奖   5+1                  浮动奖金       100000
三等奖   5+0                                    浮动奖金	   10000
四等奖   4+2                    3000元 
五等奖   4+1                     600元 
六等奖   4+0或3+2                100元 
七等奖   3+1或2+2                 10元 
八等奖   3+0或1+2或2+1或0+2        5元

一等奖   5+2                  浮动奖金 10000000
二等奖   5+1                  浮动奖金       150000
三等奖   5+0||4+2                                 浮动奖金	   3000
四等奖   4+1||3+2                   200元 
五等奖   4+0||3+1||2+2                    10元 
六等奖   3+0||2+1||1+2||0+2                5元 
	 */
	
	public static int getmoneysum1(int[] intnum){
		if(intnum[0]==5){
			if(intnum[1]==2){
				return 10000000;
			}
			else if(intnum[1]==1){
				return 150000;
			}
			else if(intnum[1]==0){
				return 3000;
			}
		}
		else if(intnum[0]==4){
			if(intnum[1]==2){
				return 3000;
			}
			else if(intnum[1]==1){
				return 200;
			}
			else if(intnum[1]==0){
				return 10;
			}
		}
		else if(intnum[0]==3){
			if(intnum[1]==2){
				return 200;
			}
			else if(intnum[1]==1){
				return 10;
			}
			else if(intnum[1]==0){
				return 5;
			}
		}
		
		else if(intnum[0]==2){
			if(intnum[1]==2){
				return 10;
			}
			else if(intnum[1]==1){
				return 5;
			}
		}
		else if(intnum[0]==1){
			if(intnum[1]==2){
				return 5;
			}
		}
		else if(intnum[0]==0){
			if(intnum[1]==2){
				return 5;
			}
		}
		return 0;
		
	}
	
	//old
	public static int getmoneysum(int[] intnum){
		if(intnum[0]==5){
			if(intnum[1]==2){
				return 10000000;
			}
			if(intnum[1]==1){
				return 100000;
			}
			if(intnum[1]==0){
				return 10000;
			}
		}
		else if(intnum[0]==4){
			if(intnum[1]==2){
				return 100;
			}
			if(intnum[1]==1){
				return 10;
			}
			if(intnum[1]==0){
				return 5;
			}
		}
		else if(intnum[0]==3){
			if(intnum[1]==2){
				return 3000;
			}
			if(intnum[1]==1){
				return 600;
			}
			if(intnum[1]==0){
				return 100;
			}
		}
		else if(intnum[0]==2){
			if(intnum[1]==2){
				return 10;
			}
			if(intnum[1]==1){
				return 5;
			}
		}
		else if(intnum[0]==1){
			if(intnum[1]==2){
				return 5;
			}
		}
		else if(intnum[0]==0){
			if(intnum[1]==2){
				return 5;
			}
		}
		
		return 0;
	}
	
	/*
	 * 这里写算中奖数字的算法
	 */
	public static int[] getMoney(ArrayList al1,ArrayList al2){
		int[] lottery = new int[2];
		int fcount = 0;
		int ecount = 0;
		if(al2.size()!=7||al1.size()!=7){
			return null;
		}
		
		for (int i = 0; i < 7; i++) {
			if(i<5){
				for (int j = 0; j < 5; j++) {
					if(al1.get(i)==al2.get(j)){
						fcount++;
					}
				}
			}
			else{
				if(al1.get(i)==al2.get(5)){
					ecount++;
				}
				if(al1.get(i)==al2.get(6)){
					ecount++;
				}
			}
		}
		
		lottery[0]=fcount;
		lottery[1]=ecount;
		return lottery;
	}

	//num = 5, size = 34
	public static Integer[] test(int num,int size) {
		Integer[] il = new Integer[num];
		Random rd = new Random();
		Integer temp = 0;
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(8);
		while(ll.size()<num){
			temp = rd.nextInt(size)+1;
			
			if(!ll.contains(temp)){
				ll.add(temp);
				//System.out.println(temp);
			}
		}
		
		return ll.toArray(il);
		
	}
	//Integer[] ii = new Integer[7];好麻烦
	public static ArrayList<Integer> test1() {
		Integer temp = 0;
		ArrayList<Integer> al = new ArrayList<Integer>();
		Random rd = new Random();
		while(al.size()<5){
			temp = 1+rd.nextInt(34);
			if(!al.contains(temp)){
				al.add(temp);
			}
		}
		
		//排序吗?
		Collections.sort(al);
		
		while(al.size()<7){
			temp = 1+rd.nextInt(11);
			Integer temp2 = 1+rd.nextInt(11);
			if(temp<temp2){
				al.add(temp);
				al.add(temp2);
			}else if(temp>temp2){
				al.add(temp2);
				al.add(temp);
			}
		}
		return al;
	}
	
	public void test11(){}
	public void test11(int i){}
	public void test11(int i,int i1){}
	//public void test11(int i1,int i){}
	public void test11(String s,int i1){}
	public void test11(int s,String i1){}
	//public String test11(int s,String i1){return "";}
}
