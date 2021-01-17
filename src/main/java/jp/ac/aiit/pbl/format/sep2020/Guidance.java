package jp.ac.aiit.pbl.format.sep2020;

public class Guidance {

    private String countryId;

    private String guidanceLibrary;

    public Guidance(String countryId, String guidanceLibrary){
        this.countryId = countryId;
        this.guidanceLibrary = guidanceLibrary;
    }

    public GuidanceToReact getById(String id){
        if(this.countryId.equals("392") && this.guidanceLibrary.equals("1")){
            return GeneralGuidanceToReact.getById(id);
        }else{
            return  GeneralGuidanceToReact.getById(id);
        }
    }
}
