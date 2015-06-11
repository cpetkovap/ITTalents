package Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.TreeMap;

public class Demo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

//		File file1 = new File("file1.txt");
//		file1.createNewFile();
//		System.out.println(file1.exists());
//		
//		System.out.println(file1.length());
//		PrintStream ps = new PrintStream(file1);
//		String s = "ala bala nica \n lolo lo lo lo \n aaaa aaa aaa aaa ala aaa\n hghgy bhgt mjh";
//		ps.append(s);
//		ps.close();
//		System.out.println(file1.length());
//		
//		Scanner input = new Scanner(file1);
//		
//		int count = 0;
//		while(input.hasNextLine()){
//			String line[] = input.next().split("[^a-zA-Z]+");
//			for(String word: line){
//				if(word.endsWith("ala")){
//					count++;
//				}
//			}
//		}
//		System.out.println("ala = " + count + " pyti");
//		input.close();
		
//		File horse1 = new File("/Users/jgeorgiev/Desktop/horse1.jpg");
//		File horse2 = new File("/Users/jgeorgiev/Desktop/horse2.jpg");
//		File horse3 = new File("/Users/jgeorgiev/Desktop/horse3.jpg");
//		
//		FileInputStream fis1 = new FileInputStream(horse1);
//		FileInputStream fis2 = new FileInputStream(horse3);
//		
//		boolean result = true;
//		int a = fis1.read();
//		int b = fis2.read();
//		
//		while(!(a == -1) && !(b == -1)){
//			if(a != b){
//				result = false;
//				break;
//			}
//			a = fis1.read();
//			b = fis2.read();
//			
//		}
//		fis1.close();
//		fis2.close();
//		System.out.println(result);
		
		File f = new File("/Users/jgeorgiev/Desktop/EBS_Ex1_16(1).doc");
		//System.out.println(f.exists());
		TreeMap<Character, Integer> hm = new TreeMap();
		Scanner input = new Scanner(f);
		//System.out.println(input);
		System.out.println("s");
		while(input.hasNextLine()){
			System.out.println("ss");
			char[] charLine = input.next().toCharArray();
			for(int i = 0 ; i < charLine.length; i++){
				
				if(hm.containsKey(charLine[i])){
					hm.put(charLine[i], hm.get(charLine[i]) + 1);
				}else{
					hm.put(charLine[i], 1);
				}
			}
			
		}
		input.close();
		System.out.println(hm.toString());
		
		Queue<String> g = new LinkedList();
		g.offer("a");
		g.offer("b");
		g.offer("c");
		
		Stack<String> s = new Stack();
		s.push("a");
		s.push("b");
		s.push("c");
		System.out.println(s.elementAt(2));
		
	}
	
	private static double sum(int x, double y){
		return x+ y;
	}
	
	public static double sum(double x, int y){
		return x+ y;
	}

	
	
	
}
