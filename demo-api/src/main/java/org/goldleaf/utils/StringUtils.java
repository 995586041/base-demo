package org.goldleaf.utils;

public class StringUtils {
	public static void main(String[] args) {
		System.out.println("  aa   bb  ");
		System.out.println("  aa   bb  ".replaceAll(" ", ""));
	}
	
	public static Boolean isNullOrBlank(String str) {
		if(str == null) {
			return true;
		}
		if(str.replaceAll(" ", "").length() < 1) {
			return true;
		}
		return false;
	}
	
	public static Boolean isNotNullOrBlank(String str) {
		return !isNullOrBlank(str);
	}
}
