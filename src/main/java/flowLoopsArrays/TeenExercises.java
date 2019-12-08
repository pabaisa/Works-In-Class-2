package flowLoopsArrays;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

public class TeenExercises {
    public static void main(String[] args) {
        int maxLenght = 1;
        String maxText = "";
        for (int i = 0; i < 5; i++) {
            Random randomStringLenght = new Random();
            int rnd = randomStringLenght.nextInt(10);
            String text = RandomStringUtils.randomAlphabetic(rnd + 1);
            System.out.println(text);
            if (maxLenght < text.length()) {
                maxLenght = text.length();
                maxText=text;
            }
        }
        System.out.println("MAX text is  -  " + maxText);

    }
}