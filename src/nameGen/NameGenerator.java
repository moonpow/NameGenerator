package nameGen;

import java.util.Random;
import java.util.Scanner;

public class NameGenerator {
	public static void main(String args[]){
		Random random = new Random();
		String nameS[] = {"Zan", "Can", "Lan", "Dan", "Stel", "Aren", "Air", "Stan", "San", "Luk", "Cal", "Med", "Joe", "Loh", "Dra", 
				"Lohk", "Ipt", "Ar", "Tal", "Sharp", "Mer"};
		
		String nameM[] = {"av", "drec", "ouc", "mern", "lis", "don", "cam", "com", "dar", "port", "toc", "on", "ie", "polt", "gon"};
	
		String nameE[] = {"er", "mair", "ler", "dra", "co", "las", "ner", "lair", "mar", "bon", "mes", "ar", "ire", "ore", "born", "ite",
				"tigh", "polt", "nam", "turn", "lock", "lynn"};
		
		System.out.println(nameS.length + ", " + nameM.length + ", " + nameE.length);
		System.out.println("How many names would you like to create?");
		Scanner scan = new Scanner(System.in);
		int amount = scan.nextInt();
		scan.close();
		
		for (int i = 0; i < amount; ++i){
			System.out.print(i + " ");
			System.out.print(nameS[random.nextInt(nameS.length)]);
			if (Math.random() * 100 < 70){
				System.out.print(nameM[random.nextInt(nameM.length)]);
			}
			System.out.println(nameE[random.nextInt(nameE.length)]);
		}
	}

}
