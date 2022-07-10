package week1.day1;

public class Fibbonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=11,  firstnum=0, secondnum=1;
		System.out.println("Fibbonacci series till" +num+ "terms:");
		for(int i=1;i<=num;++i)
		{
			System.out.println(firstnum + ",");
			int nextnum=firstnum+secondnum;
			firstnum=secondnum;
			secondnum=nextnum;
		}
		
	}

}
