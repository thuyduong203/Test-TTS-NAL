package com.example.test_tts_nal;

import com.example.test_tts_nal.service.TextService;
import com.example.test_tts_nal.service.impl.TextServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;
import java.util.Set;

@SpringBootApplication
public class TestTtsNalApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestTtsNalApplication.class, args);
        Scanner scanner = new Scanner(System.in);
        TextService textService = new TextServiceImpl();
        System.out.println("Mơi nhập chuỗi: ");
        String inputText = scanner.nextLine();
        String filterInputText = inputText.replaceAll("[^a-zA-Z0-9]", "");
        Set<String> result = textService.alphabetCount(filterInputText);
        System.out.println(result.size());
        for (String s : result
        ) {
            System.out.println(s + " ");
        }
    }

}
