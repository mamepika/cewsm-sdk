package jp.ac.aiit.pbl.format.prefix;

public class Prefix {


    private Preamble preamble;

    private MessageType messageType;

    private ReportClassification reportClassification;

    private Organization organization;

    private SubdivisionOrganization subdivisionOrganization;

    public Preamble getPreamble() {
        return preamble;
    }

    public void setPreamble(Preamble preamble) {
        this.preamble = preamble;
    }

    public MessageType getMessageType() {
        return messageType;
    }

    public void setMessageType(MessageType messageType) {
        this.messageType = messageType;
    }

    public ReportClassification getReportClassification() {
        return reportClassification;
    }

    public void setReportClassification(ReportClassification reportClassification) {
        this.reportClassification = reportClassification;
    }

    public Organization getOrganizationCode() {
        return organization;
    }

    public void setOrganizationCode(Organization organization) {
        this.organization = organization;
    }

    public SubdivisionOrganization getSubdivisionOrganizationCode() {
        return subdivisionOrganization;
    }

    public void setSubdivisionOrganizationCode(SubdivisionOrganization subdivisionOrganization) {
        this.subdivisionOrganization = subdivisionOrganization;
    }

    @Override
    public String toString() {
        return "Prefix{" +
                "preamble=" + preamble +
                ", messageType=" + messageType +
                ", reportClassification=" + reportClassification +
                ", organizationCode=" + organization +
                ", subdivisionOrganizationCode=" + subdivisionOrganization +
                '}';
    }
}
