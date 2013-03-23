import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class FindOutput {
	public void showResult(String str){
        
		int length;
		
		List <Integer>index=new ArrayList();
		List <String> words=new ArrayList();
		List <Integer> count=new ArrayList();
		HashMap<String,Integer> nameCount=new HashMap();
		length=str.length();
		int j=0;
		
		System.out.println(str);
		 
		for(int i=0;i<length;i++){
			if(str.charAt(i)=='.')
				index.add(i);
			else if(str.charAt(i)==',')
				index.add(i);
			else if(str.charAt(i)==' ')
				index.add(i);
		}
		if(str.charAt(0)!='.'||str.charAt(0)!=','||str.charAt(0)!=' ')
		words.add(str.substring(0,index.get(0)));
		
	
		for (int i=0;i<index.size()-1;i++)
			words.add(str.substring(index.get(i),index.get(i+1)));
		
		for(int i=0;i<words.size();i++){
		if(words.get(i).equals(" ")||words.get(i).equals(".")||words.get(i).equals(",")){
			words.remove(i);
		}
		
		}
		for(int i=0;i<words.size();i++){	
			if(words.get(i).equals(" ")){
				words.remove(i);
			}
		for(i=0;i<words.size();i++)
			System.out.println(words.get(i));
		words.remove(0);
		//System.out.println(words);
		
		
		for(j=0;j<words.size();j++){
			int counter=0;
			for(i=0;i<words.size();i++){
				if(words.get(i).equals(words.get(j)))
				++counter;
				
		}
		count.add(counter);
		}
		for(i=0;i<count.size();i++)
			nameCount.put(words.get(i),count.get(i));
		System.out.println(nameCount);
	}
}
}