package jp.ac.aiit.pbl.format.prefix;

import java.util.Arrays;

public enum Organization {

    CABINET_SECRETARIAT(1," Cabinet Secretariat"),
    CABINET_OFFICE__DISASTER_PREVENTION(2," Cabinet Office (Disaster Prevention)"),
    CABINET_OFFICE__SPACE_STRATEGY(3," Cabinet Office (Space Strategy)"),
    NATIONAL_POLICE_AGENCY(4," National Police Agency"),
    FINANCIAL_SERVICES_AGENCY(5," Financial Services Agency"),
    CONSUMER_AFFAIRS_AGENCY(6," Consumer Affairs Agency"),
    MINISTRY_OF_INTERNAL_AFFAIRS_AND_COMMUNICATIONS(7," Ministry of Internal Affairs and Communications"),
    FIRE_AND_DISASTER_MANAGEMENT_AGENCY(8," Fire and Disaster Management Agency"),
    MINISTRY_OF_JUSTICE(9," Ministry of Justice"),
    PUBLIC_SECURITY_INTELLIGENCE_AGENCY(10," Public Security Intelligence Agency"),
    MINISTRY_OF_FOREIGN_AFFAIRS(11," Ministry of Foreign Affairs"),
    MINISTRY_OF_FINANCE(12," Ministry of Finance"),
    NATIONAL_TAX_AGENCY(13," National Tax Agency"),
    MINISTRY_OF_EDUCATION_CULTURE_SPORTS_SCIENCE_AND_TECHNOLOGY(14," Ministry of Education, Culture, Sports, Science and Technology"),
    AGENCY_FOR_CULTURAL_AFFAIRS(15," Agency for Cultural Affairs"),
    MINISTRY_OF_HEALTH_LABOUR_AND_WELFARE(16," Ministry of Health, Labour and Welfare"),
    MINISTRY_OF_AGRICULTURE_FORESTRY_AND_FISHERIES(17," Ministry of Agriculture, Forestry, and Fisheries"),
    FORESTRY_AGENCY(18," Forestry Agency"),
    FISHERIES_AGENCY(19," Fisheries Agency"),
    MINISTRY_OF_ECONOMY_TRADE_AND_INDUSTRY(20," Ministry of Economy, Trade and Industry"),
    AGENCY_FOR_NATURAL_RESOURCES_AND_ENERGY(21," Agency for Natural Resources and Energy"),
    SMALL_AND_MEDIUM_ENTERPRISE_AGENCY(22," Small and Medium Enterprise Agency"),
    MINISTRY_OF_LAND_INFRASTRUCTURE_TRANSPORT_AND_TOURISM__DISASTER_PREVENTION(23," Ministry of Land, Infrastructure, Transport and Tourism (Disaster Prevention)"),
    MINISTRY_OF_LAND_INFRASTRUCTURE_TRANSPORT_AND_TOURISM__CRISIS_MANAGEMENT(24," Ministry of Land, Infrastructure, Transport, and Tourism (Crisis Management)"),
    GEOSPATIAL_INFORMATION_AUTHORITY_OF_JAPAN(25," Geospatial Information Authority of Japan"),
    JAPAN_TOURISM_AGENCY(26," Japan Tourism Agency"),
    JAPAN_COAST_GUARD(27," Japan Coast Guard"),
    MINISTRY_OF_THE_ENVIRONMENT(28," Ministry of the Environment"),
    NUCLEAR_REGULATION_AUTHORITY(29," Nuclear Regulation Authority"),
    MINISTRY_OF_DEFENSE(30," Ministry of Defense"),
    RESERVED1(45," Reserved"),
    RESERVED2(46," Reserved"),
    RESERVED3(47," Reserved"),
    RESERVED4(48," Reserved"),
    RESERVED5(49," Reserved"),
    PREFECTURE(51," Prefecture"),
    MUNICIPALITY(52," Municipality"),
    PUBLIC_AGENCY(53," Public agency"),
    FOREIGN_COUNTRY(60," Foreign country");

    private int id;

    private String organizationName;


    private Integer getId() {
        return id;
    }


    private Organization(int id, String organizationName){
        this.id = id;
        this.organizationName = organizationName;
    }

    public static Organization getById(int id){
        return Arrays.stream(Organization.values())
                .filter(data -> data.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
