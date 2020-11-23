package jp.ac.aiit.pbl.format.prefix;

import java.util.Arrays;

public enum ReportClassification {
    MAXIMUM_PRIORITY(1,"Maximum priority"),
    PRIORITY(2,"Priority"),
    REGULAR(3,"Regular"),
    TEST(7,"Training/Test");

    private Integer id;

    private String reportClassificationName;

    public Integer getId(){
        return id;
    }

    public String getReportClassificationName(){
        return reportClassificationName;
    }

    private ReportClassification(int id, String name){
        this.id = id;
        this.reportClassificationName = name;
    }

    public static ReportClassification getById(int id){
        return Arrays.stream(ReportClassification.values())
                .filter(data -> data.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
