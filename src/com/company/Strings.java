package com.company;

import java.util.Locale;

public class Strings {
    public static boolean ispalindrome(String str){
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=str.charAt(str.length()-i-1)){
                return false;
            }
        }
        return true;
    }
        public static void main(String args[]) {
            String str = "moom";
            System.out.println(ispalindrome(str));
        }
    }
