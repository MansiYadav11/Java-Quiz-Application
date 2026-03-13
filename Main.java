package com.Mansi.project;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	
	
	
	public static void main(String[] args) {
		Quiz q=new Quiz();
		q.logic();
		
	}

}

class Quiz{
	
	int correctAnsCount =0;
	int wrongAnsCount=0;
	
	Scanner sc=new Scanner(System.in);
	public void logic(){
		
		Questions q1=new Questions("Which statement is true about Java?","A. Java is a srquence-dependent programming language",
				"B. Java is a code dependent programming language",
				"C. Java is platform-dependent programming language",
				"D. Java is a platform-independent programming language");
		
		Questions q2=new Questions("Which of the following is not a Java feature?","A. Object-Oriented","B. Platform Independent","C. Pointer Arithmetic","D. Automatic Garbage Collection");
		Questions q3=new Questions("What is the default value of a local variable in Java?","A. null","B. 0","C. Depends on data type","D. No default value");
		Questions q4=new Questions("Which keyword is used to inherit a class in Java?","A. super","B. extends","C. implements","D. inherits");
		Questions q5=new Questions(" Which exception is thrown when dividing by zero in Java (integer division)?","A. Arithmetic Exception","B. Number Format Exception","C. Illegal Argument Exception","D. Null Pointer Exception");
		
		
		HashMap<Questions,Character> hm=new HashMap<>();
		hm.put(q1,'D');
		hm.put(q2,'C');
		hm.put(q3,'D');
		hm.put(q4,'B');
		hm.put(q5,'A');
		
		for(Map.Entry<Questions,Character> map:hm.entrySet()) {
			System.out.println(map.getKey().getQuestion());
			System.out.println(map.getKey().getOption1());
			System.out.println(map.getKey().getOption2());
			System.out.println(map.getKey().getOption3());
			System.out.println(map.getKey().getOption4());
			
			System.out.println("Enter your answer: ");
			Character ans=sc.next().charAt(0);
			
			int cans=Character.compare(ans,map.getValue());
			if(cans==0) {
				System.out.println("Correct");
				correctAnsCount++;
			}else {
				System.out.println("Wrong");
				wrongAnsCount++;
			}
			
		}
		
		System.out.println("-----------------Result----------------");
		System.out.println("Total number of question : "+hm.size());
		System.out.println("Correctly Answered : "+correctAnsCount);
		System.out.println("Wrongly Answered : "+wrongAnsCount);
		double percentage=(100*correctAnsCount)/hm.size();
		System.out.println("Percentage : "+percentage+"%");	
		
		if(percentage>90) {
			System.out.println("Performance : VERY GOOD");
		}
		else if(percentage<30) {
			System.out.println("Performance : VERY BAD");
		}else {
			System.out.println("Performance : AVERAGE");
		}
	}
}
