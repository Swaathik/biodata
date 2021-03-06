package org.opencb.biodata.models.variant.annotation;

/**
 * Created by fjlopez on 16/07/15.
 */
public class GeneDrugInteraction {

    private String geneName;
    private String drugName;
    private String source;
    private String studyType;
    private String type;

    public GeneDrugInteraction() {};

    public GeneDrugInteraction(String geneName, String drugName, String source, String studyType, String type) {
        this.geneName = geneName;
        this.drugName = drugName;
        this.source = source;
        this.studyType = studyType;
        this.type = type;
    }

    public String getGeneName() { return geneName; }

    public void setGeneName(String geneName) { this.geneName = geneName; }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getStudyType() {
        return studyType;
    }

    public void setStudyType(String studyType) {
        this.studyType = studyType;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
