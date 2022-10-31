package Emoticons;

import java.util.Scanner;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;

public class MainEmoticons {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		String msg;
		
		String f = ":-)";
		String t = ":-(";
		
		System.out.println("insira mensagem:");
		msg = ler.next();
		int total = 0;
		int total2 = 0;
		
		
		for(int i=0; i>msg.length(); i++) {
			if(msg.substring(i , i).contains(f)) {
				
			  total ++;
			  System.out.println(msg.substring(i,i));
			
			}else if(msg.substring(i , i).contains(t)) {
				System.out.println(msg.substring(i,i));
				total2++;
			}else {
				System.out.println(msg.substring(i,i));
			}
			
			
		}
		
		if(total > total2) {
			System.out.println("Feliz");
		}else if (total<total2) {
			System.out.println("triste");
		}
        if(total==total2) {
			System.out.println("Neutro");
		}
		
		//System.out.println(total);
		//System.out.println(i);
		//System.out.println(total2);
		
		
		
		
	}

}
/*Pattern pattern = Pattern.compile(msg);
Matcher matcher1 = pattern.matcher(feliz);
Matcher matcher = pattern.matcher(triste);

while(matcher1.find()) {
	total++;
}
while(matcher.find()) {
	total2++;
}*/
//System.out.println(total);