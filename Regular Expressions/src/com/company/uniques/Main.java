package com.company.uniques;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("====Regular Expressions====");
        System.out.println();

        String gmailpattern = "[a-zA-Z-\\d]+@gmail\\.com";
        Pattern p = Pattern.compile(gmailpattern);
        String sampleText = "Some random text that contains gmail addresses "
                + "like this one some-email@gmail.com. And some other random text.";

        Matcher m = p.matcher(sampleText);

        m.find();
        String gmailAddress = m.group();
        System.out.println(gmailAddress);

        String sampleText2 = "There are three sentences in this string. Are you sure? Yes!";
        String[] sentences = sampleText2.split("[\\.!?]");
        System.out.println(Arrays.toString(sentences));

    }
}
