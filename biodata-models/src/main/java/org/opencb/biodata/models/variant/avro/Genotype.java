/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.opencb.biodata.models.variant.avro;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Genotype extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Genotype\",\"namespace\":\"org.opencb.biodata.models.variant.avro\",\"fields\":[{\"name\":\"reference\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"alternate\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"allelesIdx\",\"type\":{\"type\":\"array\",\"items\":\"int\"},\"default\":[]},{\"name\":\"phased\",\"type\":\"boolean\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
   private java.lang.String reference;
   private java.lang.String alternate;
   private java.util.List<java.lang.Integer> allelesIdx;
   private boolean phased;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public Genotype() {}

  /**
   * All-args constructor.
   */
  public Genotype(java.lang.String reference, java.lang.String alternate, java.util.List<java.lang.Integer> allelesIdx, java.lang.Boolean phased) {
    this.reference = reference;
    this.alternate = alternate;
    this.allelesIdx = allelesIdx;
    this.phased = phased;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return reference;
    case 1: return alternate;
    case 2: return allelesIdx;
    case 3: return phased;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: reference = (java.lang.String)value$; break;
    case 1: alternate = (java.lang.String)value$; break;
    case 2: allelesIdx = (java.util.List<java.lang.Integer>)value$; break;
    case 3: phased = (java.lang.Boolean)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
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
   * Gets the value of the 'allelesIdx' field.
   */
  public java.util.List<java.lang.Integer> getAllelesIdx() {
    return allelesIdx;
  }

  /**
   * Sets the value of the 'allelesIdx' field.
   * @param value the value to set.
   */
  public void setAllelesIdx(java.util.List<java.lang.Integer> value) {
    this.allelesIdx = value;
  }

  /**
   * Gets the value of the 'phased' field.
   */
  public java.lang.Boolean getPhased() {
    return phased;
  }

  /**
   * Sets the value of the 'phased' field.
   * @param value the value to set.
   */
  public void setPhased(java.lang.Boolean value) {
    this.phased = value;
  }

  /** Creates a new Genotype RecordBuilder */
  public static org.opencb.biodata.models.variant.avro.Genotype.Builder newBuilder() {
    return new org.opencb.biodata.models.variant.avro.Genotype.Builder();
  }
  
  /** Creates a new Genotype RecordBuilder by copying an existing Builder */
  public static org.opencb.biodata.models.variant.avro.Genotype.Builder newBuilder(org.opencb.biodata.models.variant.avro.Genotype.Builder other) {
    return new org.opencb.biodata.models.variant.avro.Genotype.Builder(other);
  }
  
  /** Creates a new Genotype RecordBuilder by copying an existing Genotype instance */
  public static org.opencb.biodata.models.variant.avro.Genotype.Builder newBuilder(org.opencb.biodata.models.variant.avro.Genotype other) {
    return new org.opencb.biodata.models.variant.avro.Genotype.Builder(other);
  }
  
  /**
   * RecordBuilder for Genotype instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Genotype>
    implements org.apache.avro.data.RecordBuilder<Genotype> {

    private java.lang.String reference;
    private java.lang.String alternate;
    private java.util.List<java.lang.Integer> allelesIdx;
    private boolean phased;

    /** Creates a new Builder */
    private Builder() {
      super(org.opencb.biodata.models.variant.avro.Genotype.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.opencb.biodata.models.variant.avro.Genotype.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.reference)) {
        this.reference = data().deepCopy(fields()[0].schema(), other.reference);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.alternate)) {
        this.alternate = data().deepCopy(fields()[1].schema(), other.alternate);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.allelesIdx)) {
        this.allelesIdx = data().deepCopy(fields()[2].schema(), other.allelesIdx);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.phased)) {
        this.phased = data().deepCopy(fields()[3].schema(), other.phased);
        fieldSetFlags()[3] = true;
      }
    }
    
    /** Creates a Builder by copying an existing Genotype instance */
    private Builder(org.opencb.biodata.models.variant.avro.Genotype other) {
            super(org.opencb.biodata.models.variant.avro.Genotype.SCHEMA$);
      if (isValidValue(fields()[0], other.reference)) {
        this.reference = data().deepCopy(fields()[0].schema(), other.reference);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.alternate)) {
        this.alternate = data().deepCopy(fields()[1].schema(), other.alternate);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.allelesIdx)) {
        this.allelesIdx = data().deepCopy(fields()[2].schema(), other.allelesIdx);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.phased)) {
        this.phased = data().deepCopy(fields()[3].schema(), other.phased);
        fieldSetFlags()[3] = true;
      }
    }

    /** Gets the value of the 'reference' field */
    public java.lang.String getReference() {
      return reference;
    }
    
    /** Sets the value of the 'reference' field */
    public org.opencb.biodata.models.variant.avro.Genotype.Builder setReference(java.lang.String value) {
      validate(fields()[0], value);
      this.reference = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'reference' field has been set */
    public boolean hasReference() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'reference' field */
    public org.opencb.biodata.models.variant.avro.Genotype.Builder clearReference() {
      reference = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'alternate' field */
    public java.lang.String getAlternate() {
      return alternate;
    }
    
    /** Sets the value of the 'alternate' field */
    public org.opencb.biodata.models.variant.avro.Genotype.Builder setAlternate(java.lang.String value) {
      validate(fields()[1], value);
      this.alternate = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'alternate' field has been set */
    public boolean hasAlternate() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'alternate' field */
    public org.opencb.biodata.models.variant.avro.Genotype.Builder clearAlternate() {
      alternate = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'allelesIdx' field */
    public java.util.List<java.lang.Integer> getAllelesIdx() {
      return allelesIdx;
    }
    
    /** Sets the value of the 'allelesIdx' field */
    public org.opencb.biodata.models.variant.avro.Genotype.Builder setAllelesIdx(java.util.List<java.lang.Integer> value) {
      validate(fields()[2], value);
      this.allelesIdx = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'allelesIdx' field has been set */
    public boolean hasAllelesIdx() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'allelesIdx' field */
    public org.opencb.biodata.models.variant.avro.Genotype.Builder clearAllelesIdx() {
      allelesIdx = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'phased' field */
    public java.lang.Boolean getPhased() {
      return phased;
    }
    
    /** Sets the value of the 'phased' field */
    public org.opencb.biodata.models.variant.avro.Genotype.Builder setPhased(boolean value) {
      validate(fields()[3], value);
      this.phased = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'phased' field has been set */
    public boolean hasPhased() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'phased' field */
    public org.opencb.biodata.models.variant.avro.Genotype.Builder clearPhased() {
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    public Genotype build() {
      try {
        Genotype record = new Genotype();
        record.reference = fieldSetFlags()[0] ? this.reference : (java.lang.String) defaultValue(fields()[0]);
        record.alternate = fieldSetFlags()[1] ? this.alternate : (java.lang.String) defaultValue(fields()[1]);
        record.allelesIdx = fieldSetFlags()[2] ? this.allelesIdx : (java.util.List<java.lang.Integer>) defaultValue(fields()[2]);
        record.phased = fieldSetFlags()[3] ? this.phased : (java.lang.Boolean) defaultValue(fields()[3]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
