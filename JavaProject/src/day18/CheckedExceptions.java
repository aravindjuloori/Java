package day18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptions {

	public static void main(String[] args) throws InterruptedException, FileNotFoundException {
		
		System.out.println("Program Started....");
		System.out.println("Program is in progress....");
		
		Thread.sleep(4000);
		FileInputStream fis=new FileInputStream("C://File1.txt"); 
		/*
		 * try { FileInputStream fis=new FileInputStream("C://File1.txt"); } catch
		 * (FileNotFoundException e) {
		 * 
		 * e.printStackTrace(); }
		 * 
		 * 
		 * try { Thread.sleep(3000); } catch (InterruptedException e) {
		 * e.printStackTrace(); }
		 */
		System.out.println("Program executed....");
		System.out.println("program exited....");
	}

}
