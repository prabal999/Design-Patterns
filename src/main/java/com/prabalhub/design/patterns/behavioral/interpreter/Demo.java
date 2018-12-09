package com.prabalhub.design.patterns.behavioral.interpreter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {

	public static void main(String[] args) {
		String input = "Lions and tigers and bears ! ohh my! ";
		Pattern p = Pattern.compile("(Lions|cat|dog|tigers )");
		Matcher match = p.matcher(input);
		
		while(match.find()) {
			System.out.println("Got a:"+ match.group());
		}
		
		Expression person1 = new TerminalExpression("Prabal"); 
        Expression person2 = new TerminalExpression("Mithlesh"); 
        Expression isSingle = new OrExpression(person1, person2); 
          
        Expression person3 = new TerminalExpression("Anshu"); 
        Expression person4 = new TerminalExpression("Dhiru"); 
        Expression isCommitted = new AndExpression(person3, person4);     
  
        System.out.println(isSingle.interpreter("Prabal"));  //true
        System.out.println(isSingle.interpreter("Anshu"));  // false
        System.out.println(isSingle.interpreter("Mithlesh")); // true
          
        System.out.println(isCommitted.interpreter("Anshu, Dhiru")); //true
        System.out.println(isCommitted.interpreter("Anshu, Anand")); //false
        System.out.println(isCommitted.interpreter("Dhiru, Anshu")); // true
  
    } 




}
