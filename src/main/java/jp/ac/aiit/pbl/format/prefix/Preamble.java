package jp.ac.aiit.pbl.format.prefix;

import java.util.Arrays;

public enum Preamble {

    PATTERN_A("01010011"),
    PATTERN_B("10011010"),
    PATTERN_C("11000110");

    private String id;

    private String getId(){
        return id;
    }

    private Preamble(String id){
        this.id = id;
    }

    public static Preamble getById(String id){
        return Arrays.stream(Preamble.values())
                .filter(data -> data.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
