/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class App {
    public String getGreeting() {

        return "Hello World!";
    }

    public static List<String> javaScriptFile(Path path){
//        Path path= Paths.get("gates.js");
        List<String>result=new ArrayList<String>();
        try {
            List<String>fileReader= Files.readAllLines(path);
            boolean isExist;
            for (int i = 0; i < fileReader.size(); i++) {
                isExist = !fileReader.get(i).endsWith(";") && !fileReader.get(i).endsWith("{") && !fileReader.get(i).endsWith("}") && !fileReader.get(i).contains("if") && !fileReader.get(i).contains("else") && !fileReader.get(i).isEmpty();
                if(isExist){
                    System.out.println("line "+(i+1)+": Missing semicolon.");
                    result.add("line "+(i+1)+": Missing semicolon.");
                }

            }
        } catch (IOException e) {
            System.out.println("your path is wrong");
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr={42,8,15,23,42};
        System.out.println(new App().getGreeting());
        System.out.println(arr.length);
        double num=arr.length/2.0;
        System.out.println(num);
        System.out.println(Math.ceil(num));
//        Path path= Paths.get("gates.js");
//        javaScriptFile(Path.of("gates.js"));

    }
}
