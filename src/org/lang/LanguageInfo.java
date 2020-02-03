package org.lang;

public class LanguageInfo {
	

        void tamilLanguage() {
        	System.out.println("my lang is tamil");
    	   }
        void englishLanguage() {
        	System.out.println("my lang is english");
        }
        void hindiLanguage() {
        	System.out.println("my lang is hindi");
        }
         public static void main(String[] args) {
        	 LanguageInfo li=new LanguageInfo();
        	 li.tamilLanguage();
        	 li.englishLanguage();
        	 li.hindiLanguage();
        	 StateDetails ed=new StateDetails();
        	 ed.southIndia();
     		ed.northIndia();
	
         }
}
