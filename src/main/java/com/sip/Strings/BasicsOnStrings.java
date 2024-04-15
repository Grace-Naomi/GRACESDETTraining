package com.sip.Strings;

public class BasicsOnStrings {
    public static void main (String [] args){

        String tool=null;
      //  String tool="hello";
        String tool1= new String();

        System.out.println("tool:: "+tool);
        System.out.println("tool1::"+tool1+ "tool1");

        System.out.println(new BasicsOnStrings());



        String webTool="Playwright";
        webTool.concat("Automation Tool");          //As string is immutable we cannot concat the string,so only webTool gets displayed

      // String S1=webTool.concat("Automation ");
       System.out.println(webTool);

       // System.out.println(S1);

        //String webAutomationTool="Automation Tool";
        String webAutomationTool=webTool.concat(" Automation Tool");
        System.out.println(webAutomationTool);

    }
}
