package assignment4;

import java.util.ArrayList;
import java.util.Scanner;

public class recursionasciiSS {
	 public static void main(String args[]) {
	        Scanner scn = new Scanner(System.in);
	        String str = scn.next();
	        ArrayList<String> ss = getSS(str);
	        for (String val : ss) {
	            System.out.print(val + " ");
	        }
	        System.out.println();
	        System.out.println(ss.size());
	    }
	    public static ArrayList<String> getSS(String str) {
	        if (str.length() == 0) {
	            ArrayList<String> br = new ArrayList<>();
	            br.add("");
	            return br;
	        }
	        char ch = str.charAt(0);
	        String ros = str.substring(1);
	        ArrayList<String> mr = new ArrayList<>();
	        ArrayList<String> rr = getSS(ros);
	        for (String val : rr)
	            mr.add(val);
	        for (String val : rr)
	            mr.add(ch + val);
	        for (String val : rr)
	            mr.add((int) ch + val);
	        return mr;
	    }
}
