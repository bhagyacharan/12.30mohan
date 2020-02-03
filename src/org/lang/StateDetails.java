package org.lang;

public class StateDetails {
	
	void southIndia() {
		System.out.println("iam south indian");
	}
	void northIndia() {
		System.out.println("iam north indian");
	}
	public static void main(String[] args) {
		StateDetails ed=new StateDetails();
		ed.southIndia();
		ed.northIndia();
		
		 LanguageInfo li=new LanguageInfo();
    	 li.tamilLanguage();
    	 li.englishLanguage();
    	 li.hindiLanguage();
	}

}