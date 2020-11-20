package templatemethodpattern.caffeinebeverage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Alex on 4/16/2016.
 */
public class MateWithHookMethod extends CaffeineBeverage {

    @Override
    public void brew() {
        System.out.println("Steeping the mate");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding sugar and milk");
    }

    @Override
    public boolean customerWantsCondiments() {
        String answer = getUserInput();
        return answer.toLowerCase().startsWith("y");
    }

    private String getUserInput() {
        String answer = null;

        System.out.println("Would you like milk and sugar with your mate? (y/n): ");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException ex) {
            System.err.println("IO error trying to read your answer");
        }
        if (answer == null) {
            return "no";
        }

        return answer;
    }
}
