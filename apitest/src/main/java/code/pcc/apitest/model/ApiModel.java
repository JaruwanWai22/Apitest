package code.pcc.apitest.model;

public class ApiModel {
    //private Date request_date;
    private String ssoType;
    private String systemId;
    private String systemName;
    private String systemTransactions;
    private String systemPrivileges;
    private String systemUserGroup;
    private String systemLocationGroup;
    private String userId;
    private String userFullName;
    private String userRdOfficeCode;
    private String userOfficeCode;
    private String clientLocation;
    private String locationMachineNumber;
    private String tokenId;



    public ApiModel() {
        super();
    }


    public ApiModel(String ssoType, String systemId, String systemName, String systemTransactions, String systemPrivileges, String systemUserGroup, String systemLocationGroup, String userId, String userFullName, String userRdOfficeCode, String userOfficeCode, String clientLocation, String locationMachineNumber, String tokenId) {
        //this.request_date = request_date;
        this.ssoType = ssoType;
        this.systemId = systemId;
        this.systemName = systemName;
        this.systemTransactions = systemTransactions;
        this.systemPrivileges = systemPrivileges;
        this.systemUserGroup = systemUserGroup;
        this.systemLocationGroup = systemLocationGroup;
        this.userId = userId;
        this.userFullName = userFullName;
        this.userRdOfficeCode = userRdOfficeCode;
        this.userOfficeCode = userOfficeCode;
        this.clientLocation = clientLocation;
        this.locationMachineNumber = locationMachineNumber;
        this.tokenId = tokenId;
    }



// public Date getRequest_date() {
//     return this.request_date;
// }

// public void setRequest_date(Date request_date) {
//     this.request_date = request_date;
// }


    public String getSsoType() {
        return this.ssoType;
    }

    public void setSsoType(String ssoType) {
        this.ssoType = ssoType;
    }

    public String getSystemId() {
        return this.systemId;
    }

    public void setSystemId(String systemId) {
        this.systemId = systemId;
    }

    public String getSystemName() {
        return this.systemName;
    }

    public void setSystemName(String systemName) {
        this.systemName = systemName;
    }

    public String getSystemTransactions() {
        return this.systemTransactions;
    }

    public void setSystemTransactions(String systemTransactions) {
        this.systemTransactions = systemTransactions;
    }

    public String getSystemPrivileges() {
        return this.systemPrivileges;
    }

    public void setSystemPrivileges(String systemPrivileges) {
        this.systemPrivileges = systemPrivileges;
    }

    public String getSystemUserGroup() {
        return this.systemUserGroup;
    }

    public void setSystemUserGroup(String systemUserGroup) {
        this.systemUserGroup = systemUserGroup;
    }

    public String getSystemLocationGroup() {
        return this.systemLocationGroup;
    }

    public void setSystemLocationGroup(String systemLocationGroup) {
        this.systemLocationGroup = systemLocationGroup;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserFullName() {
        return this.userFullName;
    }

    public void setUserFullName(String userFullName) {
        this.userFullName = userFullName;
    }

    public String getUserRdOfficeCode() {
        return this.userRdOfficeCode;
    }

    public void setUserRdOfficeCode(String userRdOfficeCode) {
        this.userRdOfficeCode = userRdOfficeCode;
    }

    public String getUserOfficeCode() {
        return this.userOfficeCode;
    }

    public void setUserOfficeCode(String userOfficeCode) {
        this.userOfficeCode = userOfficeCode;
    }

    public String getClientLocation() {
        return this.clientLocation;
    }

    public void setClientLocation(String clientLocation) {
        this.clientLocation = clientLocation;
    }

    public String getLocationMachineNumber() {
        return this.locationMachineNumber;
    }

    public void setLocationMachineNumber(String locationMachineNumber) {
        this.locationMachineNumber = locationMachineNumber;
    }

    public String getTokenId() {
        return this.tokenId;
    }

    public void setTokenId(String tokenId) {
        this.tokenId = tokenId;
    }

}