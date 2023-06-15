package com.company;
import java.util.ArrayList;
import java.util.Arrays;


public class wordAccuracy {
    public static int word_accuracy(String wordToCheck, String wordForChecking) {
        ArrayList<String> firstInput = new ArrayList<String>(Arrays.asList(wordForChecking.split("")));
        ArrayList<String> secondInput = new ArrayList<String>(Arrays.asList(wordToCheck.split("")));



        while (firstInput.size()!=secondInput.size()){

            if (firstInput.size()>secondInput.size()){
                secondInput.add("");
            }
            else{
                firstInput.add("");

            }
        }

        int count = 0;
        for (int i = 0; i < firstInput.size(); i++) {

            if (firstInput.get(i).equalsIgnoreCase(secondInput.get(i))) {
                count += 1;
            }
        }


        return count*100 / firstInput.size();
    }
}
