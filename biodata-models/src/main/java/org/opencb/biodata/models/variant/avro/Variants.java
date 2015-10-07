/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.opencb.biodata.models.variant.avro;

@SuppressWarnings("all")
/** * Variant AVDL Model
 *  @author Kalyan;
 *  @author Pawan;
 *  @author Matthias Haimel; */
@org.apache.avro.specific.AvroGenerated
public interface Variants {
  public static final org.apache.avro.Protocol PROTOCOL = org.apache.avro.Protocol.parse("{\"protocol\":\"Variants\",\"namespace\":\"org.opencb.biodata.models.variant.avro\",\"doc\":\"* Variant AVDL Model\\r\\n *  @author Kalyan;\\r\\n *  @author Pawan;\\r\\n *  @author Matthias Haimel;\",\"types\":[{\"type\":\"enum\",\"name\":\"ExpressionCall\",\"symbols\":[\"UP\",\"DOWN\"]},{\"type\":\"record\",\"name\":\"ClinVar\",\"fields\":[{\"name\":\"accession\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"clinicalSignificance\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"traits\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}},{\"name\":\"geneNames\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}},{\"name\":\"reviewStatus\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]},{\"type\":\"record\",\"name\":\"Gwas\",\"fields\":[{\"name\":\"snpIdCurrent\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"traits\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}},{\"name\":\"riskAlleleFrequency\",\"type\":\"double\"},{\"name\":\"reportedGenes\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]},{\"type\":\"record\",\"name\":\"Cosmic\",\"fields\":[{\"name\":\"mutationID\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"primarySite\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"siteSubtype\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"primaryHistology\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"histologySubtype\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"sampleSource\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"tumourOrigin\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"geneName\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"mutationSomaticStatus\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]},{\"type\":\"record\",\"name\":\"VariantTraitAssociation\",\"fields\":[{\"name\":\"clinvar\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"ClinVar\"}]},{\"name\":\"gwas\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"Gwas\"}]},{\"name\":\"cosmic\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"Cosmic\"}]}]},{\"type\":\"record\",\"name\":\"GeneDrugInteraction\",\"fields\":[{\"name\":\"geneName\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"drugName\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"source\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"studyType\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"type\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]}]},{\"type\":\"record\",\"name\":\"Expression\",\"fields\":[{\"name\":\"experimentalFactor\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"factorValue\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"experimentId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"technologyPlatform\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"expression\",\"type\":[\"null\",\"ExpressionCall\"]},{\"name\":\"pvalue\",\"type\":[\"null\",\"float\"]}]},{\"type\":\"record\",\"name\":\"PopulationFrequency\",\"fields\":[{\"name\":\"study\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"population\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"superPopulation\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"refAllele\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"altAllele\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"refAlleleFreq\",\"type\":\"float\"},{\"name\":\"altAlleleFreq\",\"type\":\"float\"},{\"name\":\"refHomGenotypeFreq\",\"type\":[\"null\",\"float\"]},{\"name\":\"hetGenotypeFreq\",\"type\":[\"null\",\"float\"]},{\"name\":\"altHomGenotypeFreq\",\"type\":[\"null\",\"float\"]}]},{\"type\":\"record\",\"name\":\"SequenceOntologyTerm\",\"fields\":[{\"name\":\"accession\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"name\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]},{\"type\":\"record\",\"name\":\"ProteinFeature\",\"fields\":[{\"name\":\"id\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"start\",\"type\":\"int\"},{\"name\":\"end\",\"type\":\"int\"},{\"name\":\"type\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"description\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]}]},{\"type\":\"record\",\"name\":\"Score\",\"fields\":[{\"name\":\"score\",\"type\":\"double\"},{\"name\":\"source\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"description\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]}]},{\"type\":\"record\",\"name\":\"ProteinVariantAnnotation\",\"fields\":[{\"name\":\"uniprotAccession\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"uniprotName\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"position\",\"type\":\"int\"},{\"name\":\"reference\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"alternate\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"uniprotVariantId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"functionalDescription\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"substitutionScores\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"Score\"}]},{\"name\":\"keywords\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]},{\"name\":\"features\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"ProteinFeature\"}]}]},{\"type\":\"record\",\"name\":\"ConsequenceType\",\"fields\":[{\"name\":\"geneName\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"ensemblGeneId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"ensemblTranscriptId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"strand\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"biotype\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"cDnaPosition\",\"type\":[\"null\",\"int\"]},{\"name\":\"cdsPosition\",\"type\":[\"null\",\"int\"]},{\"name\":\"codon\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"proteinVariantAnnotation\",\"type\":[\"null\",\"ProteinVariantAnnotation\"]},{\"name\":\"sequenceOntologyTerms\",\"type\":{\"type\":\"array\",\"items\":\"SequenceOntologyTerm\"}}]},{\"type\":\"record\",\"name\":\"Xref\",\"fields\":[{\"name\":\"id\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"src\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]}]},{\"type\":\"record\",\"name\":\"VariantAnnotation\",\"fields\":[{\"name\":\"chromosome\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"start\",\"type\":\"int\"},{\"name\":\"end\",\"type\":\"int\"},{\"name\":\"reference\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"alternate\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"id\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"xrefs\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"Xref\"}]},{\"name\":\"hgvs\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]},{\"name\":\"consequenceTypes\",\"type\":{\"type\":\"array\",\"items\":\"ConsequenceType\"},\"default\":[]},{\"name\":\"populationFrequencies\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"PopulationFrequency\"}]},{\"name\":\"conservation\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"Score\"}]},{\"name\":\"expression\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"Expression\"}]},{\"name\":\"geneDrugInteraction\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"GeneDrugInteraction\"}]},{\"name\":\"variantTraitAssociation\",\"type\":[\"null\",\"VariantTraitAssociation\"]},{\"name\":\"additionalAttributes\",\"type\":[\"null\",{\"type\":\"map\",\"values\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"avro.java.string\":\"String\"}]}]},{\"type\":\"enum\",\"name\":\"VariantType\",\"doc\":\"* Type of variation, which depends mostly on its length.\\r\\n     * <ul>\\r\\n     * <li>SNVs involve a single nucleotide, without changes in length</li>\\r\\n     * <li>MNVs involve multiple nucleotides, without changes in length</li>\\r\\n     * <li>Indels are insertions or deletions of less than SV_THRESHOLD (50) nucleotides</li>\\r\\n     * <li>Structural variations are large changes of more than SV_THRESHOLD nucleotides</li>\\r\\n     * <li>Copy-number variations alter the number of copies of a region</li>\\r\\n     * </ul>\",\"symbols\":[\"SNP\",\"SNV\",\"MNP\",","\"MNV\",\"INDEL\",\"SV\",\"CNV\",\"NO_VARIATION\",\"SYMBOLIC\",\"MIXED\"]},{\"type\":\"enum\",\"name\":\"AllelesCode\",\"symbols\":[\"ALLELES_OK\",\"ALLELES_MISSING\",\"MULTIPLE_ALTERNATES\",\"HAPLOID\"]},{\"type\":\"record\",\"name\":\"VariantHardyWeinbergStats\",\"fields\":[{\"name\":\"chi2\",\"type\":[\"null\",\"float\"]},{\"name\":\"pValue\",\"type\":[\"null\",\"float\"]},{\"name\":\"n\",\"type\":[\"null\",\"int\"]},{\"name\":\"n_AA_11\",\"type\":[\"null\",\"int\"]},{\"name\":\"n_Aa_10\",\"type\":[\"null\",\"int\"]},{\"name\":\"n_aa_00\",\"type\":[\"null\",\"int\"]},{\"name\":\"e_AA_11\",\"type\":[\"null\",\"float\"]},{\"name\":\"e_Aa_10\",\"type\":[\"null\",\"float\"]},{\"name\":\"e_aa_00\",\"type\":[\"null\",\"float\"]},{\"name\":\"p\",\"type\":[\"null\",\"float\"]},{\"name\":\"q\",\"type\":[\"null\",\"float\"]}]},{\"type\":\"record\",\"name\":\"VariantStats\",\"fields\":[{\"name\":\"refAllele\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"altAllele\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"refAlleleCount\",\"type\":[\"null\",\"int\"]},{\"name\":\"altAlleleCount\",\"type\":[\"null\",\"int\"]},{\"name\":\"genotypesCount\",\"type\":{\"type\":\"map\",\"values\":\"int\",\"avro.java.string\":\"String\",\"java-key-class\":\"org.opencb.biodata.models.feature.Genotype\"}},{\"name\":\"genotypesFreq\",\"type\":{\"type\":\"map\",\"values\":\"float\",\"avro.java.string\":\"String\",\"java-key-class\":\"org.opencb.biodata.models.feature.Genotype\"}},{\"name\":\"missingAlleles\",\"type\":[\"null\",\"int\"]},{\"name\":\"missingGenotypes\",\"type\":[\"null\",\"int\"]},{\"name\":\"refAlleleFreq\",\"type\":[\"null\",\"float\"]},{\"name\":\"altAlleleFreq\",\"type\":[\"null\",\"float\"]},{\"name\":\"maf\",\"type\":[\"null\",\"float\"]},{\"name\":\"mgf\",\"type\":[\"null\",\"float\"]},{\"name\":\"mafAllele\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"mgfGenotype\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"passedFilters\",\"type\":[\"null\",\"boolean\"]},{\"name\":\"mendelianErrors\",\"type\":[\"null\",\"int\"]},{\"name\":\"casesPercentDominant\",\"type\":[\"null\",\"float\"]},{\"name\":\"controlsPercentDominant\",\"type\":[\"null\",\"float\"]},{\"name\":\"casesPercentRecessive\",\"type\":[\"null\",\"float\"]},{\"name\":\"controlsPercentRecessive\",\"type\":[\"null\",\"float\"]},{\"name\":\"quality\",\"type\":[\"null\",\"float\"]},{\"name\":\"numSamples\",\"type\":[\"null\",\"int\"]},{\"name\":\"variantType\",\"type\":\"VariantType\"},{\"name\":\"hw\",\"type\":\"VariantHardyWeinbergStats\"}]},{\"type\":\"record\",\"name\":\"FileEntry\",\"fields\":[{\"name\":\"fileId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"call\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"attributes\",\"type\":{\"type\":\"map\",\"values\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"avro.java.string\":\"String\"}}]},{\"type\":\"record\",\"name\":\"VariantSourceEntry\",\"fields\":[{\"name\":\"studyId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"files\",\"type\":{\"type\":\"array\",\"items\":\"FileEntry\"},\"default\":[]},{\"name\":\"secondaryAlternates\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"default\":null},{\"name\":\"format\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}},{\"name\":\"samplesData\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}}},{\"name\":\"stats\",\"type\":{\"type\":\"map\",\"values\":\"VariantStats\",\"avro.java.string\":\"String\"}}]},{\"type\":\"record\",\"name\":\"Genotype\",\"fields\":[{\"name\":\"reference\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"alternate\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"allelesIdx\",\"type\":{\"type\":\"array\",\"items\":\"int\"},\"default\":[]},{\"name\":\"phased\",\"type\":\"boolean\"}]},{\"type\":\"record\",\"name\":\"VariantAvro\",\"fields\":[{\"name\":\"chromosome\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"* Chromosome where the genomic variation occurred.\"},{\"name\":\"start\",\"type\":\"int\",\"doc\":\"* Normalized position where the genomic variation starts.\\r\\n         * <ul>\\r\\n         * <li>SNVs have the same start and end position</li>\\r\\n         * <li>Insertions start in the last present position: if the first nucleotide\\r\\n         * is inserted in position 6, the start is position 5</li>\\r\\n         * <li>Deletions start in the first previously present position: if the first\\r\\n         * deleted nucleotide is in position 6, the start is position 6</li>\\r\\n         * </ul>\"},{\"name\":\"end\",\"type\":\"int\",\"doc\":\"* Normalized position where the genomic variation ends.\\r\\n         * <ul>\\r\\n         * <li>SNVs have the same start and end positions</li>\\r\\n         * <li>Insertions end in the first present position: if the last nucleotide\\r\\n         * is inserted in position 9, the end is position 10</li>\\r\\n         * <li>Deletions ends in the last previously present position: if the last\\r\\n         * deleted nucleotide is in position 9, the end is position 9</li>\\r\\n         * </ul>\"},{\"name\":\"reference\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"* Reference allele.\"},{\"name\":\"alternate\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"* Alternate allele.\"},{\"name\":\"strand\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"* Reference strand for this variant\"},{\"name\":\"ids\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},\"doc\":\"* Set of identifiers used for this genomic variation.\",\"default\":[]},{\"name\":\"length\",\"type\":\"int\",\"doc\":\"* Length of the genomic variation, which depends on the variation type.\\r\\n         * <ul>\\r\\n         * <li>SNVs have a length of 1 nucleotide</li>\\r\\n         * <li>Indels have the length of the largest allele</li>\\r\\n         * </ul>\"},{\"name\":\"type\",\"type\":\"VariantType\",\"doc\":\"* Type of variation: single nucleotide, indel or structural variation.\"},{\"name\":\"hgvs\",\"type\":[\"null\",{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},\"avro.java.string\":\"String\"}],\"doc\":\"* Unique identifier following the HGVS nomenclature.\"},{\"name\":\"studies\",\"type\":{\"type\":\"array\",\"items\":\"VariantSourceEntry\"},\"doc\":\"* Information specific to each study the variant was read from, such as\\r\\n         * samples or statistics.\"},{\"name\":\"annotation\",\"type\":[\"null\",\"VariantAnnotation\"],\"doc\":\"* Annotations of the genomic variation.\"}]},{\"type\":\"record\",\"name\":\"VariantFileMetadata\",\"fields\":[{\"name\":\"fileId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"studyId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"fileName\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"studyName\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"samples\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},\"default\":[]},{\"name\":\"metadata\",\"type\":{\"type\":\"map\",\"values\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"avro.java.string\":\"String\"}}]}],\"messages\":{}}");

  @SuppressWarnings("all")
  /** * Variant AVDL Model
 *  @author Kalyan;
 *  @author Pawan;
 *  @author Matthias Haimel; */
  public interface Callback extends Variants {
    public static final org.apache.avro.Protocol PROTOCOL = org.opencb.biodata.models.variant.avro.Variants.PROTOCOL;
  }
}