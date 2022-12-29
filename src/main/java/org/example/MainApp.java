package org.example;


import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.dto.Question;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainApp {


    public static void main(String... args) throws IOException {
        int count = 0;
        int all = 0;
        Scanner scanner = new Scanner(System.in);
        BufferedReader bufferedReader = new BufferedReader(new FileReader("src/main/resources/jsonformatter.json"));
        ObjectMapper mapper = new ObjectMapper();
        Question[] questions = mapper.readValue(new File("src/main/resources/jsonformatter.json"), Question[].class);
        for (Question question : questions) {
            List<String> allAnswer = new ArrayList<>();
            allAnswer.addAll(question.getV());
            allAnswer.addAll(question.getA());
            allAnswer.sort(String::compareTo);
            System.out.println(question.getF());
            for (int i = 0; i < allAnswer.size(); i++) {
                System.out.println(i + ") " + allAnswer.get(i));
            }
            scanner.nextLine();
            for (int i = 0; i < question.getA().size(); i++) {
                System.out.println(allAnswer.indexOf(question.getA().get(i)) + ") " + question.getA().get(i));
            }

            System.out.println("\nУгадал?");
            String sfd = scanner.nextLine();
            if (sfd != null && !sfd.isBlank()) {
                count++;
            }
            all++;
            System.out.println("всего " + count + "/" + all);
        }
        System.out.println("всего " + count + "/" + all);
    }

}

