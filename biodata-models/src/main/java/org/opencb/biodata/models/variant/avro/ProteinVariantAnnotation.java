/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.opencb.biodata.models.variant.avro;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class ProteinVariantAnnotation extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ProteinVariantAnnotation\",\"namespace\":\"org.opencb.biodata.models.variant.avro\",\"fields\":[{\"name\":\"uniprotAccession\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"uniprotName\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"position\",\"type\":\"int\"},{\"name\":\"reference\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"alternate\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"uniprotVariantId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"functionalDescription\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"substitutionScores\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Score\",\"fields\":[{\"name\":\"score\",\"type\":\"double\"},{\"name\":\"source\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"description\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]}]}}]},{\"name\":\"keywords\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]},{\"name\":\"features\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"ProteinFeature\",\"fields\":[{\"name\":\"id\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"start\",\"type\":\"int\"},{\"name\":\"end\",\"type\":\"int\"},{\"name\":\"type\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"description\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]}]}}]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
   private java.lang.String uniprotAccession;
   private java.lang.String uniprotName;
   private int position;
   private java.lang.String reference;
   private java.lang.String alternate;
   private java.lang.String uniprotVariantId;
   private java.lang.String functionalDescription;
   private java.util.List<org.opencb.biodata.models.variant.avro.Score> substitutionScores;
   private java.util.List<java.lang.String> keywords;
   private java.util.List<org.opencb.biodata.models.variant.avro.ProteinFeature> features;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public ProteinVariantAnnotation() {}

  /**
   * All-args constructor.
   */
  public ProteinVariantAnnotation(java.lang.String uniprotAccession, java.lang.String uniprotName, java.lang.Integer position, java.lang.String reference, java.lang.String alternate, java.lang.String uniprotVariantId, java.lang.String functionalDescription, java.util.List<org.opencb.biodata.models.variant.avro.Score> substitutionScores, java.util.List<java.lang.String> keywords, java.util.List<org.opencb.biodata.models.variant.avro.ProteinFeature> features) {
    this.uniprotAccession = uniprotAccession;
    this.uniprotName = uniprotName;
    this.position = position;
    this.reference = reference;
    this.alternate = alternate;
    this.uniprotVariantId = uniprotVariantId;
    this.functionalDescription = functionalDescription;
    this.substitutionScores = substitutionScores;
    this.keywords = keywords;
    this.features = features;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return uniprotAccession;
    case 1: return uniprotName;
    case 2: return position;
    case 3: return reference;
    case 4: return alternate;
    case 5: return uniprotVariantId;
    case 6: return functionalDescription;
    case 7: return substitutionScores;
    case 8: return keywords;
    case 9: return features;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: uniprotAccession = (java.lang.String)value$; break;
    case 1: uniprotName = (java.lang.String)value$; break;
    case 2: position = (java.lang.Integer)value$; break;
    case 3: reference = (java.lang.String)value$; break;
    case 4: alternate = (java.lang.String)value$; break;
    case 5: uniprotVariantId = (java.lang.String)value$; break;
    case 6: functionalDescription = (java.lang.String)value$; break;
    case 7: substitutionScores = (java.util.List<org.opencb.biodata.models.variant.avro.Score>)value$; break;
    case 8: keywords = (java.util.List<java.lang.String>)value$; break;
    case 9: features = (java.util.List<org.opencb.biodata.models.variant.avro.ProteinFeature>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'uniprotAccession' field.
   */
  public java.lang.String getUniprotAccession() {
    return uniprotAccession;
  }

  /**
   * Sets the value of the 'uniprotAccession' field.
   * @param value the value to set.
   */
  public void setUniprotAccession(java.lang.String value) {
    this.uniprotAccession = value;
  }

  /**
   * Gets the value of the 'uniprotName' field.
   */
  public java.lang.String getUniprotName() {
    return uniprotName;
  }

  /**
   * Sets the value of the 'uniprotName' field.
   * @param value the value to set.
   */
  public void setUniprotName(java.lang.String value) {
    this.uniprotName = value;
  }

  /**
   * Gets the value of the 'position' field.
   */
  public java.lang.Integer getPosition() {
    return position;
  }

  /**
   * Sets the value of the 'position' field.
   * @param value the value to set.
   */
  public void setPosition(java.lang.Integer value) {
    this.position = value;
  }

  /**
   * Gets the value of the 'reference' field.
   */
  public java.lang.String getReference() {
    return reference;
  }

  /**
   * Sets the value of the 'reference' field.
   * @param value the value to set.
   */
  public void setReference(java.lang.String value) {
    this.reference = value;
  }

  /**
   * Gets the value of the 'alternate' field.
   */
  public java.lang.String getAlternate() {
    return alternate;
  }

  /**
   * Sets the value of the 'alternate' field.
   * @param value the value to set.
   */
  public void setAlternate(java.lang.String value) {
    this.alternate = value;
  }

  /**
   * Gets the value of the 'uniprotVariantId' field.
   */
  public java.lang.String getUniprotVariantId() {
    return uniprotVariantId;
  }

  /**
   * Sets the value of the 'uniprotVariantId' field.
   * @param value the value to set.
   */
  public void setUniprotVariantId(java.lang.String value) {
    this.uniprotVariantId = value;
  }

  /**
   * Gets the value of the 'functionalDescription' field.
   */
  public java.lang.String getFunctionalDescription() {
    return functionalDescription;
  }

  /**
   * Sets the value of the 'functionalDescription' field.
   * @param value the value to set.
   */
  public void setFunctionalDescription(java.lang.String value) {
    this.functionalDescription = value;
  }

  /**
   * Gets the value of the 'substitutionScores' field.
   */
  public java.util.List<org.opencb.biodata.models.variant.avro.Score> getSubstitutionScores() {
    return substitutionScores;
  }

  /**
   * Sets the value of the 'substitutionScores' field.
   * @param value the value to set.
   */
  public void setSubstitutionScores(java.util.List<org.opencb.biodata.models.variant.avro.Score> value) {
    this.substitutionScores = value;
  }

  /**
   * Gets the value of the 'keywords' field.
   */
  public java.util.List<java.lang.String> getKeywords() {
    return keywords;
  }

  /**
   * Sets the value of the 'keywords' field.
   * @param value the value to set.
   */
  public void setKeywords(java.util.List<java.lang.String> value) {
    this.keywords = value;
  }

  /**
   * Gets the value of the 'features' field.
   */
  public java.util.List<org.opencb.biodata.models.variant.avro.ProteinFeature> getFeatures() {
    return features;
  }

  /**
   * Sets the value of the 'features' field.
   * @param value the value to set.
   */
  public void setFeatures(java.util.List<org.opencb.biodata.models.variant.avro.ProteinFeature> value) {
    this.features = value;
  }

  /** Creates a new ProteinVariantAnnotation RecordBuilder */
  public static org.opencb.biodata.models.variant.avro.ProteinVariantAnnotation.Builder newBuilder() {
    return new org.opencb.biodata.models.variant.avro.ProteinVariantAnnotation.Builder();
  }
  
  /** Creates a new ProteinVariantAnnotation RecordBuilder by copying an existing Builder */
  public static org.opencb.biodata.models.variant.avro.ProteinVariantAnnotation.Builder newBuilder(org.opencb.biodata.models.variant.avro.ProteinVariantAnnotation.Builder other) {
    return new org.opencb.biodata.models.variant.avro.ProteinVariantAnnotation.Builder(other);
  }
  
  /** Creates a new ProteinVariantAnnotation RecordBuilder by copying an existing ProteinVariantAnnotation instance */
  public static org.opencb.biodata.models.variant.avro.ProteinVariantAnnotation.Builder newBuilder(org.opencb.biodata.models.variant.avro.ProteinVariantAnnotation other) {
    return new org.opencb.biodata.models.variant.avro.ProteinVariantAnnotation.Builder(other);
  }
  
  /**
   * RecordBuilder for ProteinVariantAnnotation instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<ProteinVariantAnnotation>
    implements org.apache.avro.data.RecordBuilder<ProteinVariantAnnotation> {

    private java.lang.String uniprotAccession;
    private java.lang.String uniprotName;
    private int position;
    private java.lang.String reference;
    private java.lang.String alternate;
    private java.lang.String uniprotVariantId;
    private java.lang.String functionalDescription;
    private java.util.List<org.opencb.biodata.models.variant.avro.Score> substitutionScores;
    private java.util.List<java.lang.String> keywords;
    private java.util.List<org.opencb.biodata.models.variant.avro.ProteinFeature> features;

    /** Creates a new Builder */
    private Builder() {
      super(org.opencb.biodata.models.variant.avro.ProteinVariantAnnotation.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.opencb.biodata.models.variant.avro.ProteinVariantAnnotation.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.uniprotAccession)) {
        this.uniprotAccession = data().deepCopy(fields()[0].schema(), other.uniprotAccession);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.uniprotName)) {
        this.uniprotName = data().deepCopy(fields()[1].schema(), other.uniprotName);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.position)) {
        this.position = data().deepCopy(fields()[2].schema(), other.position);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.reference)) {
        this.reference = data().deepCopy(fields()[3].schema(), other.reference);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.alternate)) {
        this.alternate = data().deepCopy(fields()[4].schema(), other.alternate);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.uniprotVariantId)) {
        this.uniprotVariantId = data().deepCopy(fields()[5].schema(), other.uniprotVariantId);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.functionalDescription)) {
        this.functionalDescription = data().deepCopy(fields()[6].schema(), other.functionalDescription);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.substitutionScores)) {
        this.substitutionScores = data().deepCopy(fields()[7].schema(), other.substitutionScores);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.keywords)) {
        this.keywords = data().deepCopy(fields()[8].schema(), other.keywords);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.features)) {
        this.features = data().deepCopy(fields()[9].schema(), other.features);
        fieldSetFlags()[9] = true;
      }
    }
    
    /** Creates a Builder by copying an existing ProteinVariantAnnotation instance */
    private Builder(org.opencb.biodata.models.variant.avro.ProteinVariantAnnotation other) {
            super(org.opencb.biodata.models.variant.avro.ProteinVariantAnnotation.SCHEMA$);
      if (isValidValue(fields()[0], other.uniprotAccession)) {
        this.uniprotAccession = data().deepCopy(fields()[0].schema(), other.uniprotAccession);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.uniprotName)) {
        this.uniprotName = data().deepCopy(fields()[1].schema(), other.uniprotName);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.position)) {
        this.position = data().deepCopy(fields()[2].schema(), other.position);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.reference)) {
        this.reference = data().deepCopy(fields()[3].schema(), other.reference);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.alternate)) {
        this.alternate = data().deepCopy(fields()[4].schema(), other.alternate);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.uniprotVariantId)) {
        this.uniprotVariantId = data().deepCopy(fields()[5].schema(), other.uniprotVariantId);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.functionalDescription)) {
        this.functionalDescription = data().deepCopy(fields()[6].schema(), other.functionalDescription);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.substitutionScores)) {
        this.substitutionScores = data().deepCopy(fields()[7].schema(), other.substitutionScores);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.keywords)) {
        this.keywords = data().deepCopy(fields()[8].schema(), other.keywords);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.features)) {
        this.features = data().deepCopy(fields()[9].schema(), other.features);
        fieldSetFlags()[9] = true;
      }
    }

    /** Gets the value of the 'uniprotAccession' field */
    public java.lang.String getUniprotAccession() {
      return uniprotAccession;
    }
    
    /** Sets the value of the 'uniprotAccession' field */
    public org.opencb.biodata.models.variant.avro.ProteinVariantAnnotation.Builder setUniprotAccession(java.lang.String value) {
      validate(fields()[0], value);
      this.uniprotAccession = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'uniprotAccession' field has been set */
    public boolean hasUniprotAccession() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'uniprotAccession' field */
    public org.opencb.biodata.models.variant.avro.ProteinVariantAnnotation.Builder clearUniprotAccession() {
      uniprotAccession = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'uniprotName' field */
    public java.lang.String getUniprotName() {
      return uniprotName;
    }
    
    /** Sets the value of the 'uniprotName' field */
    public org.opencb.biodata.models.variant.avro.ProteinVariantAnnotation.Builder setUniprotName(java.lang.String value) {
      validate(fields()[1], value);
      this.uniprotName = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'uniprotName' field has been set */
    public boolean hasUniprotName() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'uniprotName' field */
    public org.opencb.biodata.models.variant.avro.ProteinVariantAnnotation.Builder clearUniprotName() {
      uniprotName = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'position' field */
    public java.lang.Integer getPosition() {
      return position;
    }
    
    /** Sets the value of the 'position' field */
    public org.opencb.biodata.models.variant.avro.ProteinVariantAnnotation.Builder setPosition(int value) {
      validate(fields()[2], value);
      this.position = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'position' field has been set */
    public boolean hasPosition() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'position' field */
    public org.opencb.biodata.models.variant.avro.ProteinVariantAnnotation.Builder clearPosition() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'reference' field */
    public java.lang.String getReference() {
      return reference;
    }
    
    /** Sets the value of the 'reference' field */
    public org.opencb.biodata.models.variant.avro.ProteinVariantAnnotation.Builder setReference(java.lang.String value) {
      validate(fields()[3], value);
      this.reference = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'reference' field has been set */
    public boolean hasReference() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'reference' field */
    public org.opencb.biodata.models.variant.avro.ProteinVariantAnnotation.Builder clearReference() {
      reference = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'alternate' field */
    public java.lang.String getAlternate() {
      return alternate;
    }
    
    /** Sets the value of the 'alternate' field */
    public org.opencb.biodata.models.variant.avro.ProteinVariantAnnotation.Builder setAlternate(java.lang.String value) {
      validate(fields()[4], value);
      this.alternate = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'alternate' field has been set */
    public boolean hasAlternate() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'alternate' field */
    public org.opencb.biodata.models.variant.avro.ProteinVariantAnnotation.Builder clearAlternate() {
      alternate = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'uniprotVariantId' field */
    public java.lang.String getUniprotVariantId() {
      return uniprotVariantId;
    }
    
    /** Sets the value of the 'uniprotVariantId' field */
    public org.opencb.biodata.models.variant.avro.ProteinVariantAnnotation.Builder setUniprotVariantId(java.lang.String value) {
      validate(fields()[5], value);
      this.uniprotVariantId = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the 'uniprotVariantId' field has been set */
    public boolean hasUniprotVariantId() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the 'uniprotVariantId' field */
    public org.opencb.biodata.models.variant.avro.ProteinVariantAnnotation.Builder clearUniprotVariantId() {
      uniprotVariantId = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /** Gets the value of the 'functionalDescription' field */
    public java.lang.String getFunctionalDescription() {
      return functionalDescription;
    }
    
    /** Sets the value of the 'functionalDescription' field */
    public org.opencb.biodata.models.variant.avro.ProteinVariantAnnotation.Builder setFunctionalDescription(java.lang.String value) {
      validate(fields()[6], value);
      this.functionalDescription = value;
      fieldSetFlags()[6] = true;
      return this; 
    }
    
    /** Checks whether the 'functionalDescription' field has been set */
    public boolean hasFunctionalDescription() {
      return fieldSetFlags()[6];
    }
    
    /** Clears the value of the 'functionalDescription' field */
    public org.opencb.biodata.models.variant.avro.ProteinVariantAnnotation.Builder clearFunctionalDescription() {
      functionalDescription = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /** Gets the value of the 'substitutionScores' field */
    public java.util.List<org.opencb.biodata.models.variant.avro.Score> getSubstitutionScores() {
      return substitutionScores;
    }
    
    /** Sets the value of the 'substitutionScores' field */
    public org.opencb.biodata.models.variant.avro.ProteinVariantAnnotation.Builder setSubstitutionScores(java.util.List<org.opencb.biodata.models.variant.avro.Score> value) {
      validate(fields()[7], value);
      this.substitutionScores = value;
      fieldSetFlags()[7] = true;
      return this; 
    }
    
    /** Checks whether the 'substitutionScores' field has been set */
    public boolean hasSubstitutionScores() {
      return fieldSetFlags()[7];
    }
    
    /** Clears the value of the 'substitutionScores' field */
    public org.opencb.biodata.models.variant.avro.ProteinVariantAnnotation.Builder clearSubstitutionScores() {
      substitutionScores = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /** Gets the value of the 'keywords' field */
    public java.util.List<java.lang.String> getKeywords() {
      return keywords;
    }
    
    /** Sets the value of the 'keywords' field */
    public org.opencb.biodata.models.variant.avro.ProteinVariantAnnotation.Builder setKeywords(java.util.List<java.lang.String> value) {
      validate(fields()[8], value);
      this.keywords = value;
      fieldSetFlags()[8] = true;
      return this; 
    }
    
    /** Checks whether the 'keywords' field has been set */
    public boolean hasKeywords() {
      return fieldSetFlags()[8];
    }
    
    /** Clears the value of the 'keywords' field */
    public org.opencb.biodata.models.variant.avro.ProteinVariantAnnotation.Builder clearKeywords() {
      keywords = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    /** Gets the value of the 'features' field */
    public java.util.List<org.opencb.biodata.models.variant.avro.ProteinFeature> getFeatures() {
      return features;
    }
    
    /** Sets the value of the 'features' field */
    public org.opencb.biodata.models.variant.avro.ProteinVariantAnnotation.Builder setFeatures(java.util.List<org.opencb.biodata.models.variant.avro.ProteinFeature> value) {
      validate(fields()[9], value);
      this.features = value;
      fieldSetFlags()[9] = true;
      return this; 
    }
    
    /** Checks whether the 'features' field has been set */
    public boolean hasFeatures() {
      return fieldSetFlags()[9];
    }
    
    /** Clears the value of the 'features' field */
    public org.opencb.biodata.models.variant.avro.ProteinVariantAnnotation.Builder clearFeatures() {
      features = null;
      fieldSetFlags()[9] = false;
      return this;
    }

    @Override
    public ProteinVariantAnnotation build() {
      try {
        ProteinVariantAnnotation record = new ProteinVariantAnnotation();
        record.uniprotAccession = fieldSetFlags()[0] ? this.uniprotAccession : (java.lang.String) defaultValue(fields()[0]);
        record.uniprotName = fieldSetFlags()[1] ? this.uniprotName : (java.lang.String) defaultValue(fields()[1]);
        record.position = fieldSetFlags()[2] ? this.position : (java.lang.Integer) defaultValue(fields()[2]);
        record.reference = fieldSetFlags()[3] ? this.reference : (java.lang.String) defaultValue(fields()[3]);
        record.alternate = fieldSetFlags()[4] ? this.alternate : (java.lang.String) defaultValue(fields()[4]);
        record.uniprotVariantId = fieldSetFlags()[5] ? this.uniprotVariantId : (java.lang.String) defaultValue(fields()[5]);
        record.functionalDescription = fieldSetFlags()[6] ? this.functionalDescription : (java.lang.String) defaultValue(fields()[6]);
        record.substitutionScores = fieldSetFlags()[7] ? this.substitutionScores : (java.util.List<org.opencb.biodata.models.variant.avro.Score>) defaultValue(fields()[7]);
        record.keywords = fieldSetFlags()[8] ? this.keywords : (java.util.List<java.lang.String>) defaultValue(fields()[8]);
        record.features = fieldSetFlags()[9] ? this.features : (java.util.List<org.opencb.biodata.models.variant.avro.ProteinFeature>) defaultValue(fields()[9]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
