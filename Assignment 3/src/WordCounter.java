import java.util.Scanner;

public class WordCounter {

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindOutput find=new FindOutput();
		String strInput="";
		ReadWriteFile readwritefile=new ReadWriteFile();
		Scanner sc=new Scanner(System.in);
		System.out.println("Do you want to write to File?(y/n)");
		char check=sc.next().charAt(0);
		if(check=='y'){
			readwritefile.writeToFile();
		}
		else{
			strInput=readwritefile.ReadFromFile();
		}
		
	System.out.println(strInput);	
	find.showResult(strInput);	
	}
		}