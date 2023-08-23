package code.pcc.apitest.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name="sso_user_test", catalog="ssotest")
public class ApiEntity {
    private Date request_date;
    private String ssotype;
    private String systemid;
    private String systemname;
    private String systemtransactions;
    private String systemprivileges;
    private String systemusergroup;
    private String systemlocationgroup;
    private String userid;
    private String userfullname;
    private String userrdofficecode;
    private String userofficecode;
    private String clientlocation;
    private String locationmachinenumber;
    private String tokenid;

    public ApiEntity() {
        super();
    }

    public ApiEntity(Date request_date, String ssotype, String systemid, String systemname, String systemtransactions, String systemprivileges, String systemusergroup, String systemlocationgroup, String userid, String userfullname, String userrdofficecode, String userofficecode, String clientlocation, String locationmachinenumber, String tokenid) {
        this.request_date = request_date;
        this.ssotype = ssotype;
        this.systemid = systemid;
        this.systemname = systemname;
        this.systemtransactions = systemtransactions;
        this.systemprivileges = systemprivileges;
        this.systemusergroup = systemusergroup;
        this.systemlocationgroup = systemlocationgroup;
        this.userid = userid;
        this.userfullname = userfullname;
        this.userrdofficecode = userrdofficecode;
        this.userofficecode = userofficecode;
        this.clientlocation = clientlocation;
        this.locationmachinenumber = locationmachinenumber;
        this.tokenid = tokenid;
    }

    @Id
    @Column(name = "request_date", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    public Date getRequest_date() {
        return this.request_date;
    }
    

    public void setRequest_date(Date request_date) {
        this.request_date = request_date;
    }

    @Column(name = "ssotype", length = 50)
    public String getSsotype() {
        return this.ssotype;
    }

    public void setSsotype(String ssotype) {
        this.ssotype = ssotype;
    }

    @Column(name = "systemid", length = 50)
    public String getSystemid() {
        return this.systemid;
    }

    public void setSystemid(String systemid) {
        this.systemid = systemid;
    }

    @Column(name = "systemname", length = 250)
    public String getSystemname() {
        return this.systemname;
    }

    public void setSystemname(String systemname) {
        this.systemname = systemname;
    }

    @Column(name = "systemtransactions", length = 250)
    public String getSystemtransactions() {
        return this.systemtransactions;
    }

    public void setSystemtransactions(String systemtransactions) {
        this.systemtransactions = systemtransactions;
    }

    @Column(name = "systemprivileges", length = 250)
    public String getSystemprivileges() {
        return this.systemprivileges;
    }

    public void setSystemprivileges(String systemprivileges) {
        this.systemprivileges = systemprivileges;
    }

    @Column(name = "systemusergroup", length = 50)
    public String getSystemusergroup() {
        return this.systemusergroup;
    }

    public void setSystemusergroup(String systemusergroup) {
        this.systemusergroup = systemusergroup;
    }

    @Column(name = "systemlocationgroup", length = 50)
    public String getSystemlocationgroup() {
        return this.systemlocationgroup;
    }

    public void setSystemlocationgroup(String systemlocationgroup) {
        this.systemlocationgroup = systemlocationgroup;
    }

    @Column(name = "userid", length = 200)
    public String getUserid() {
        return this.userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    @Column(name = "userfullname", length = 500)
    public String getUserfullname() {
        return this.userfullname;
    }

    public void setUserfullname(String userfullname) {
        this.userfullname = userfullname;
    }

    @Column(name = "userrdofficecode", length = 250)
    public String getUserrdofficecode() {
        return this.userrdofficecode;
    }

    public void setUserrdofficecode(String userrdofficecode) {
        this.userrdofficecode = userrdofficecode;
    }

    @Column(name = "userofficecode", length = 250)
    public String getUserofficecode() {
        return this.userofficecode;
    }

    public void setUserofficecode(String userofficecode) {
        this.userofficecode = userofficecode;
    }

    @Column(name = "clientlocation", length = 250)
    public String getClientlocation() {
        return this.clientlocation;
    }

    public void setClientlocation(String clientlocation) {
        this.clientlocation = clientlocation;
    }

    @Column(name = "locationmachinenumber", length = 500)
    public String getLocationmachinenumber() {
        return this.locationmachinenumber;
    }

    public void setLocationmachinenumber(String locationmachinenumber) {
        this.locationmachinenumber = locationmachinenumber;
    }

    @Column(name = "tokenid", length = 1000)
    public String getTokenid() {
        return this.tokenid;
    }

    public void setTokenid(String tokenid) {
        this.tokenid = tokenid;
    }

}