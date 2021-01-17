package jp.ac.aiit.pbl.format.sep2020;

import java.util.ArrayList;
import java.util.Arrays;

public enum GeneralGuidanceToReact implements GuidanceToReact{

    EVACUATE_URBAN_AREAS("00000000","Evacuate – Evacuate as instructed in the <instruction>","Urban areas"),
    EVACUATE_BUILDING("00000001","Evacuate – Evacuate as instructed in the <instruction>","Building"),
    EVACUATE_SEA_COASTS_AND_BEACHES("00000010","Evacuate – Evacuate as instructed in the <instruction>","Sea, Coasts and Beaches"),
    EVACUATE_FOREST_AND_BUSH_AREAS("00000011","Evacuate – Evacuate as instructed in the <instruction>","Forest and bush areas"),
    EVACUATE_IMMEDIATELY_ESCAPE_FROM_PRESENT_POSITION_JAPANESE_WARNING_LEVEL_4("00000100","Evacuate – Evacuate as instructed in the <instruction>","Immediately escape from present position (Japanese warning level 4)"),
    EVACUATE_IMMEDIATELY_ESCAPE_FROM_TARGET_AREA("00000101","Evacuate – Evacuate as instructed in the <instruction>","Immediately escape from target area"),
    EVACUATE_RIVERSIDE_AREA("00000110","Evacuate – Evacuate as instructed in the <instruction>","Riverside area"),
    EVACUATE_HILLSIDES("00000111","Evacuate – Evacuate as instructed in the <instruction>","Hillsides"),
    EXECUTE_JOIN_OFFICIAL_MEETING_POINT_BUILDING_SQUARE("00010000","Execute – Execute the <instruction>","Join official meeting point (building, square…)"),
    EXECUTE_REACH_CLOSEST_BUILDING("00010001","Execute – Execute the <instruction>","Reach closest building"),
    EXECUTE_PROTECT_YOUR_BODY_OR_HEAD_UNDER_THE_STABLE_STRUCTURES_JAPANESE_WARNING_LEVEL_5("00010010","Execute – Execute the <instruction>","Protect your body or head under the stable structures. (Japanese warning level 5)"),
    EXECUTE_EVACUATE_DISABLED_PEOPLE_JAPANESE_WARNING_LEVEL_3("00010011","Execute – Execute the <instruction>","Evacuate disabled people  (Japanese warning level 3)"),
    EXECUTE_PREPARE_FOR_EVACUATION_JAPANESE_WARNING_LEVEL_3("00010100","Execute – Execute the <instruction>","Prepare for evacuation (Japanese warning level 3)"),
    EXECUTE_USE_TV_RADIO_EMERGENCY_BROADCAST_SYSTEM_JAPANESE_WARNING_LEVEL_2("00010101","Execute – Execute the <instruction>","Use TV, Radio & emergency broadcast system (Japanese warning level 2)"),
    AVOID_USING_TRANSPORTATION_PUBLIC_OR_PRIVATE("00100000","Avoid – Avoid the subject event as per the <instruction>","Using transportation (public or private)"),
    AVOID_USING_COMMUNICATION_NETWORKS_PHONE_INTERNET("00100001","Avoid – Avoid the subject event as per the <instruction>","Using communication networks (phone, internet)"),
    STAY_TURN_OFF_ELECTRICAL_GAS_EQUIPMENTS_AND_POWER_JAPANESE_WARNING_LEVEL_5("00110000","Stay inside and Execute - Execute the <instruction>","Turn off electrical/gas equipments and power (Japanese warning level 5)"),
    STAY_CAULK_DOORS_AND_WINDOWS("00110001","Stay inside and Execute - Execute the <instruction>","Caulk doors and windows"),
    STAY_REACH_HIGH_FLOOR_OR_ROOF_TOP("00110010","Stay inside and Execute - Execute the <instruction>","Reach high floor or roof top"),
    STAY_REACH_BASEMENTS_OR_GROUND_FLOOR("00110011","Stay inside and Execute - Execute the <instruction>","Reach basements or ground floor"),
    STAY_TURN_OFF_ELECTRICAL_EQUIPMENTS_AND_POWER_AND_CAULK_DOORS_AND_WINDOWS("00110100","Stay inside and Execute - Execute the <instruction>","Turn off electrical equipments and power and caulk doors and windows"),
    STAY_STAY_IN_A_SAFE_AREA_IN_THE_BUILDING("00110101","Stay inside and Execute - Execute the <instruction>","Stay in a safe area in the building"),
    STAY_TAKE_IODINE_PILLS("00110110","Stay inside and Execute - Execute the <instruction>","Take iodine pills"),
    ALLCLEAR_END_OF_THE_EVENT("01100000","AllClear – Situation is back to normal, information provided in <instruction>","End of the event"),
    ALLCLEAR_END_OF_EVACUATION("01100001","AllClear – Situation is back to normal, information provided in <instruction>","End of evacuation"),
    ALLCLEAR_BACK_TO_NORMAL_SITUATION("01100010","AllClear – Situation is back to normal, information provided in <instruction>","Back to normal situation"),
    ALLCLEAR_END_OF_CONTAINMENT("01100011","AllClear – Situation is back to normal, information provided in <instruction>","End of containment"),
    NONE_TEST("01110000","None – No action recommended","Test"),
    NONE_EXERCISE("01110001","None – No action recommended","Exercise"),
    NONE_SPARE("01110010","None – No action recommended","Spare"),
    NONE_NO_ACTION_RECOMMENDED("01110110","None – No action recommended","No action recommended"),
    NONE_UNAVAILABLE_GUIDANCE("01110111","None – No action recommended","Unavailable guidance");


    private String id;

    private String responseType;

    private String instructions;

    GeneralGuidanceToReact(String id, String responseType, String instructions){
        this.id = id;
        this.responseType = responseType;
        this.instructions = instructions;
    }

    public String getId(){
        return  id;
    }

    @Override
    public String getResponseType() {
        return responseType;
    }

    @Override
    public String getInstruction() {
        return instructions;
    }

    public static GeneralGuidanceToReact getById(String id){
        return Arrays.stream(GeneralGuidanceToReact.values())
                .filter(data -> data.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public GuidanceToReact getById() {
        return Arrays.stream(GeneralGuidanceToReact.values())
                .filter(data -> data.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
