package com.example.test_tts_nal.service.impl;

import com.example.test_tts_nal.service.TextService;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TextServiceImpl implements TextService {

    @Override
    public Set<String> alphabetCount(String inputText) {
        Map<String, String> mapTelex = new HashMap<>();
        mapTelex.put("aw", "ă");
        mapTelex.put("aa", "â");
        mapTelex.put("dd", "đ");
        mapTelex.put("ee", "ê");
        mapTelex.put("oo", "ô");
        mapTelex.put("ow", "ơ");
        mapTelex.put("w", "ư");
        Set<String> alphabets = new HashSet<>();
        for (int i = 0; i < inputText.length() - 1; i++) {
            String oneCharacter = inputText.substring(i, i + 1);
            String twoCharacter = inputText.substring(i, i + 2);
            if (mapTelex.containsKey(oneCharacter)) {
                alphabets.add(oneCharacter);
            } else if (mapTelex.containsKey(twoCharacter)) {
                alphabets.add(twoCharacter);
            } else {
                continue;
            }
        }
        return alphabets;
    }

}
