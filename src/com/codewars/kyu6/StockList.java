package com.codewars.kyu6;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StockList {

	public static void main(String[] args) {

		String lstOfArt[] = new String[] { "ABAR 200", "CDXE 500", "BKWR 250", "BTSQ 890", "DRTY 600" };
		String lstOf1stLetter[] = new String[] { "A", "B" };

		System.out.println(stockSummary(lstOfArt, lstOf1stLetter));

	}

	public static String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
		String stock = "";
		int sum = 0;
		boolean hasRunOnce = false;
		
		for (int i = 0; i < lstOf1stLetter.length; i++) {
			for (int j = 0; j < lstOfArt.length; j++) {
				if (lstOfArt[j].startsWith(lstOf1stLetter[i])) {
					sum += Integer.parseInt(lstOfArt[j].substring(lstOfArt[j].indexOf(" ") +1));
				}
				
				if (j == lstOfArt.length - 1) {
					
					if (!hasRunOnce) {
						stock += "(" + lstOf1stLetter[i] + " : " + sum + ")";
						sum = 0;
						hasRunOnce = true;
					} else {
						
						stock += " - (" + lstOf1stLetter[i] + " : " + sum + ")";
						sum = 0;
					}
					
				}
			}

		}
		
		
		return stock;
	}
}
