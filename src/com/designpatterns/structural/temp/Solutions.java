package com.designpatterns.structural.temp;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class Solutions {
	
	
	 public static int reverse(int x) {
	        int duplicate=x;
	            int result=0;
	        do {
	            result=(result*10)+((duplicate%10));
	            duplicate=duplicate/10;
	        }while(duplicate!=0);
	        result=result/10;
	        return result;
	        
	    }
	 
	 public static int reverse2(int x) {
	        int rev = 0;
	        while (x != 0) {
	            int pop = x % 10;
	            x /= 10;
	            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
	            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
	            rev = rev * 10 + pop;
	        }
	        return rev;
	    }

	public static void main(String[] s) {
		int value=reverse2(1534236469);
		System.out.println(value);
	}

}
