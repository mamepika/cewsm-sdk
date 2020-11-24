package jp.ac.aiit.pbl.format.sep2020;

import jp.ac.aiit.pbl.format.prefix.Preamble;

import java.util.Arrays;

public enum Severity {
    EXTREME("00","Extreme - Extraordinary threat to life or property"),
    SEVERE("01","Severe - Significant threat to life or property"),
    MODERATE("10","Moderate - Possible threat to life or property"),
    MINOR("11","Minor – Minimal to no known threat to life or property");

    private String id;

    private String severity;

    private Severity(String id, String severity){
        this.id = id;
        this.severity = severity;
    }

    public String getId(){
        return id;
    }
    public String getSeverity(){
        return severity;
    }

    public static Severity getById(String id){
        return Arrays.stream(Severity.values())
                .filter(data -> data.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
