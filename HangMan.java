import java.util.Random;
import java.util.Scanner;
import java.io.*;

public class HangMan {
	public static void main(String[] args) throws Exception {
		int count = 0;
		//It should be run until game won or lose
		int game = 1;
		boolean isGame = true;
		
		Random r = new Random();
		//System.out.println(r.nextInt(855));
		FileWriter writer = new FileWriter("scores.txt");
		PrintWriter pw = new PrintWriter(writer);
		FileReader reader = new FileReader ("wordlist.txt");
		BufferedReader br = new BufferedReader(reader);
		LineNumberReader lnr = new LineNumberReader(br);
		String line = null;
	
		while (((line = lnr.readLine()) != null) &&
               (lnr.getLineNumber()) < r.nextInt(1500)) {
		
		}
		//game = game + 1;
		//System.out.println(line);
		int length = line.length();
		char [] guessed = new char [length];
	
		for (int i =0; i < guessed.length; i++) {
			guessed[i] = '-';
			
			}
		
			
		while (count < 8){
			for (int u = 0; u < guessed.length; u++) {
				isGame = true;
				if (guessed[u] != line.charAt(u)) {
					System.out.println("Enter a word: ");
					Scanner input = new Scanner(System.in);
					char guess = input.next().charAt(0);
				
				
			
			
			
			if (line.indexOf(guess) == -1) {
				count = count + 1;
				
			}
				
			
			//int y = line.indexOf(guess);
			for (int x = 0; x < guessed.length; x++) {
				if (line.charAt(x) == guess) {
					guessed[x] = guess;
					
				}
				
				//game = game + 1;
			}
			
			for(int t = 0; t < guessed.length; t++) {
				if (guessed[t] != line.charAt(t)) {
					isGame = false;
					break;
				}
			}
			
			if(isGame == true) {
				System.out.println("Game Win");
				pw.println("Total Wrong Attempts " + count);
				pw.println("Game Won");
				pw.close();
				writer.close();
				System.exit(0);
			}
			
			
			System.out.print(guessed);
			System.out.println();
			
			
			
			
			//isGame = true;
			} 
				
				
				
				
				
			}
			
			
			
		}
		
		if (count > 8) {
			System.out.println("Game Lose");
		pw.print("Total Wrong Attempts " + count);
		pw.println("Game Lost");
		}
//		if (count < 8) {
//			pw.print(count);
//			pw.print("Game Won");
//		}
		pw.close();
		writer.close();
		
			
			reader.close();
			
		}

	}
	







		



		
		



