package org.opencb.biodata.models.core;

import java.io.Serializable;
import java.util.List;

/**
 * Created by swaathi on 13/11/15.
 */
public class GenomeInteraction implements Serializable {
    private String interactorAChr;
    private int interactorAStart;
    private int interactorAEnd;
    private String interactorBChr;
    private int interactorBStart;
    private int interactorBEnd;
    private List<String> Agene;
    private List<String> Bgene;
    private String organism;
    private String celltissue;
    private String detectionMethod;
    private float confidenceScore1;
    private float confidenceScore2;
    private int contactFrequency;
    private int pubmedID;

    public GenomeInteraction() {

    }

    public GenomeInteraction(String interactorAChr, int interactorAStart, int interactorAEnd, String interactorBChr,
                             int interactorBStart, int interactorBEnd, List<String> agene, List<String> bgene,
                             String organism, String celltissue, String detectionMethod, float confidenceScore1,
                             float confidenceScore2, int contactFrequency, int pubmedID) {
        this.interactorAChr = interactorAChr;
        this.interactorAStart = interactorAStart;
        this.interactorAEnd = interactorAEnd;
        this.interactorBChr = interactorBChr;
        this.interactorBStart = interactorBStart;
        this.interactorBEnd = interactorBEnd;
        this.Agene = agene;
        this.Bgene = bgene;
        this.organism = organism;
        this.celltissue = celltissue;
        this.detectionMethod = detectionMethod;
        this.confidenceScore1 = confidenceScore1;
        this.confidenceScore2 = confidenceScore2;
        this.contactFrequency = contactFrequency;
        this.pubmedID = pubmedID;
    }

    @Override
    public String toString() {
        return "GenomeInteraction{" +
                "interactorAChr=" + interactorAChr + ", interactorAStart=" + interactorAStart
                + ", interactorAEnd=" + interactorAEnd + ", interactorBChr=" + interactorBChr
                + ", interactorBStart=" + interactorBStart + ", interactorBEnd=" + interactorBEnd
                + ", Agene=" + Agene + ", Bgene=" + Bgene + ", organism=" + organism
                + ", celltissue=" + celltissue + ", detectionMethod=" + detectionMethod
                + ", confidenceScore1=" + confidenceScore1 + ", confidenceScore2=" + confidenceScore2
                + ", contactFrequency=" + contactFrequency + ", pubMedID=" + pubmedID + "}";
    }

    public String getInteractorAChr() {
        return interactorAChr;
    }

    public void setInteractorAChr(String interactorAChr) {
        this.interactorAChr = interactorAChr;
    }

    public int getInteractorAStart() {
        return interactorAStart;
    }

    public void setInteractorAStart(int interactorAStart) {
        this.interactorAStart = interactorAStart;
    }

    public int getInteractorAEnd() {
        return interactorAEnd;
    }

    public void setInteractorAEnd(int interactorAEnd) {
        this.interactorAEnd = interactorAEnd;
    }

    public String getInteractorBChr() {
        return interactorBChr;
    }

    public void setInteractorBChr(String interactorBChr) {
        this.interactorBChr = interactorBChr;
    }

    public int getInteractorBStart() {
        return interactorBStart;
    }

    public void setInteractorBStart(int interactorBStart) {
        this.interactorBStart = interactorBStart;
    }

    public int getInteractorBEnd() {
        return interactorBEnd;
    }

    public void setInteractorBEnd(int interactorBEnd) {
        this.interactorBEnd = interactorBEnd;
    }

    public List<String> getAgene() {
        return Agene;
    }

    public void setAgene(List<String> agene) {
        Agene = agene;
    }

    public List<String> getBgene() {
        return Bgene;
    }

    public void setBgene(List<String> bgene) {
        Bgene = bgene;
    }

    public String getOrganism() {
        return organism;
    }

    public void setOrganism(String organism) {
        this.organism = organism;
    }

    public String getCelltissue() {
        return celltissue;
    }

    public void setCelltissue(String celltissue) {
        this.celltissue = celltissue;
    }

    public String getDetectionMethod() {
        return detectionMethod;
    }

    public void setDetectionMethod(String detectionMethod) {
        this.detectionMethod = detectionMethod;
    }

    public float getConfidenceScore1() {
        return confidenceScore1;
    }

    public void setConfidenceScore1(float confidenceScore1) {
        this.confidenceScore1 = confidenceScore1;
    }

    public float getConfidenceScore2() {
        return confidenceScore2;
    }

    public void setConfidenceScore2(float confidenceScore2) {
        this.confidenceScore2 = confidenceScore2;
    }

    public int getContactFrequency() {
        return contactFrequency;
    }

    public void setContactFrequency(int contactFrequency) {
        this.contactFrequency = contactFrequency;
    }

    public int getPubmedID() {
        return pubmedID;
    }

    public void setPubmedID(int pubmedID) {
        this.pubmedID = pubmedID;
    }
}
