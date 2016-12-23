package entities.ptis;

/**
 * Created by vinaykumar on 22/11/16.
 */
public class ConnectionInfo {

    private String waterSourceType;
    private String connectionType;
    private String propertyType;
    private String category;
    private String usageType;
    private String hscPipeSize;
    private String sumpCapacity;
    private String noOfPersons;
    private String reasonForAdditionalConnection;

    public String getWaterSourceType() {
        return waterSourceType;
    }

    public void setWaterSourceType(String waterSourceType) {
        this.waterSourceType = waterSourceType;
    }

    public String getConnectionType() {
        return connectionType;
    }

    public void setConnectionType(String connectionType) {
        this.connectionType = connectionType;
    }

    public String getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getUsageType() {
        return usageType;
    }

    public void setUsageType(String usageType) {
        this.usageType = usageType;
    }

    public String getHscPipeSize() {
        return hscPipeSize;
    }

    public void setHscPipeSize(String hscPipeSize) {
        this.hscPipeSize = hscPipeSize;
    }

    public String getSumpCapacity() {
        return sumpCapacity;
    }

    public void setSumpCapacity(String sumpCapacity) {
        this.sumpCapacity = sumpCapacity;
    }

    public String getNoOfPersons() {
        return noOfPersons;
    }

    public void setNoOfPersons(String noOfPersons) {
        this.noOfPersons = noOfPersons;
    }

    public String getReasonForAdditionalConnection() {
        return reasonForAdditionalConnection;
    }

    public void setReasonForAdditionalConnection(String reasonForAdditionalConnection) {
        this.reasonForAdditionalConnection = reasonForAdditionalConnection;
    }
}
