package com.ffTest;

import java.util.Formatter;
import java.util.Scanner;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "123";
		StringBuffer sb = new StringBuffer();
		sb.append("123");
		
		System.out.println(a.contentEquals(sb));
		System.out.println(a.regionMatches(0, sb.toString(), 0, 3));
		String z = new String("z");
		String zz = new String("z");
		System.out.println(z==zz);
		
		z = z.intern();
		zz = zz.intern();
		System.out.println(z==zz);
		Formatter f = new Formatter(System.out);
		f.format("%s  %s 123","t","f");
		String sp = "abcc cc ccdefg hij kl mnopqrs tabccd uvwxy z12345678 90@";
		Scanner ac = new Scanner(sp);
		String num = "12309127482";
		
		System.out.println(sp.matches("@?"));
		System.out.println(num.matches("\\d+"));
		
		Pattern p = Pattern.compile("([\\w]{4,6}[\\W])c([0-9]*)");
		Matcher m = p.matcher(sp);
		while(m.find()){
			System.out.println(m.start()+"##"+m.group()+"##"+m.end());
		}
		while(ac.hasNext(p)){
			ac.next();
			MatchResult mr = ac.match();
			System.out.println(mr.group(0)+"##"+mr.group(1)+"##"+m.end());
		}
	}

}
