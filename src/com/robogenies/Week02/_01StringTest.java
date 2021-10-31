package com.robogenies.Week02;

import java.util.Locale;

public class _01StringTest {

    public static void main(String[] args) {

        String name="Praveen";

        //Length -- Returns the size of the String

        System.out.println(name.length());

        //Concat -- Adds String with the base string

        System.out.println(name.concat(" Kumar"));
        System.out.println(name+" Kumar");

        //CharAt -- Returns the character of the provided position

        //P r a v e e n
        //0 1 2 3 4 5 6

        System.out.println(name.charAt(6));

        //IndexOf -- Returns the index or position of the provided char

        System.out.println(name.indexOf("p"));

        //Equals -- Returns boolean (true or false) by comparing both strings.
        System.out.println(name.equals("praveen"));

        //EqualsIngnoreCase -- Returns boolean (true or false) by comparing both strings without considering the Case.
        System.out.println(name.equalsIgnoreCase("pRavEen"));

        //IndexOf(str,from) -- Returns string from a position from the beginning.
        System.out.println(name.indexOf("e",5));

        //Matches Regex -- Returns a boolean by comparing the regex

        String mail="praveen@gmail.com";
        System.out.println(mail.matches("(.*)@(.*).(.*)"));

        //Replace & ReplaceAll
        String tname="Praveen Kumar & Raj Kumaran";

        System.out.println(tname.replace("Kumar","Kamal"));
        System.out.println(tname.replaceAll("(.*)Kumar(.*)","Kamal"));

        //Split -- Pending

        //SubString

        System.out.println(name.substring(3));
        System.out.println(name.substring(3,5));

        //toUpperCase & toLowerCase

        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());




    }

}
