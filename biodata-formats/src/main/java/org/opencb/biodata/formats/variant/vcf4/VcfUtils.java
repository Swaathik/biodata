package org.opencb.biodata.formats.variant.vcf4;

import java.util.Map;
import org.opencb.biodata.models.variant.ArchivedVariantFile;
import org.opencb.biodata.models.variant.Variant;

/**
 *
 * @author Cristina Yenyxe Gonzalez Garcia <cyenyxe@ebi.ac.uk>
 */
public class VcfUtils {
    
    public static String getInfoColumn(ArchivedVariantFile file) {
        StringBuilder info = new StringBuilder();

        for (Map.Entry<String, String> entry : file.getAttributes().entrySet()) {
            String key = entry.getKey();
            if (!key.equalsIgnoreCase("QUAL") && !key.equalsIgnoreCase("FILTER")) {
                info.append(key);

                String value = entry.getValue();
                if (value.length() > 0) {
                    info.append("=");
                    info.append(value);
                }

                info.append(";");
            }
        }

        return info.toString().isEmpty() ? "." : info.toString();
    }
    
    public static String getInfoColumn(Variant variant, String fileId, String studyId) {
        return VcfUtils.getInfoColumn(variant.getFile(fileId, studyId));
    }

    public static String getJoinedSampleFields(ArchivedVariantFile file, String sampleName) {
        Map<String, String> data = file.getSampleData(sampleName);
        if (data == null) {
            return "";
        }

        StringBuilder info = new StringBuilder();
        for (String formatField : file.getFormat().split(":")) {
            info.append(data.get(formatField)).append(":");
        }

        return info.toString().isEmpty() ? "." : info.toString();
    }
    
    public static String getJoinedSampleFields(Variant variant, ArchivedVariantFile file, String sampleName) {
        return VcfUtils.getJoinedSampleFields(variant.getFile(file.getFileId(), file.getStudyId()), sampleName);
    }
    
}
