/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogikLag;

/**
 *
 * @author Rune
 */
public class User {
    private int buildingID;
    private int userID;
    private int zipID;
    private int usertype;
    private String firmName;
    private String ContactFirstName;
    private String ContactLAstName;
    private String telefon;
    private String mail;
    private int cvr;
    private String gade;
    private String password;

    /**
     * @return the buildingID
     */
    
    public User(int buildingID, int userID, int zipID, int usertype, String firmName, String ContactFirstName, String ContactLAstName, String telefon, String mail, int cvr, String gade, String password) {
        this.buildingID = buildingID;
        this.userID = userID;
        this.zipID = zipID;
        this.usertype = usertype;
        this.firmName = firmName;
        this.ContactFirstName = ContactFirstName;
        this.ContactLAstName = ContactLAstName;
        this.telefon = telefon;
        this.mail = mail;
        this.cvr = cvr;
        this.gade = gade;
        this.password = password;
    }

    public int getBuildingID() {
        return buildingID;
    }

    /**
     * @param buildingID the buildingID to set
     */
    public void setBuildingID(int buildingID) {
        this.buildingID = buildingID;
    }

    /**
     * @return the userID
     */
    public int getUserID() {
        return userID;
    }

    /**
     * @param userID the userID to set
     */
    public void setUserID(int userID) {
        this.userID = userID;
    }

    /**
     * @return the zipID
     */
    public int getZipID() {
        return zipID;
    }

    /**
     * @param zipID the zipID to set
     */
    public void setZipID(int zipID) {
        this.zipID = zipID;
    }

    /**
     * @return the usertype
     */
    public int getUsertype() {
        return usertype;
    }

    /**
     * @param usertype the usertype to set
     */
    public void setUsertype(int usertype) {
        this.usertype = usertype;
    }

    /**
     * @return the firmName
     */
    public String getFirmName() {
        return firmName;
    }

    /**
     * @param firmName the firmName to set
     */
    public void setFirmName(String firmName) {
        this.firmName = firmName;
    }

    /**
     * @return the ContactFirstName
     */
    public String getContactFirstName() {
        return ContactFirstName;
    }

    /**
     * @param ContactFirstName the ContactFirstName to set
     */
    public void setContactFirstName(String ContactFirstName) {
        this.ContactFirstName = ContactFirstName;
    }

    /**
     * @return the ContactLAstName
     */
    public String getContactLAstName() {
        return ContactLAstName;
    }

    /**
     * @param ContactLAstName the ContactLAstName to set
     */
    public void setContactLAstName(String ContactLAstName) {
        this.ContactLAstName = ContactLAstName;
    }

    /**
     * @return the telefon
     */
    public String getTelefon() {
        return telefon;
    }

    /**
     * @param telefon the telefon to set
     */
    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    /**
     * @return the mail
     */
    public String getMail() {
        return mail;
    }

    /**
     * @param mail the mail to set
     */
    public void setMail(String mail) {
        this.mail = mail;
    }

    /**
     * @return the cvr
     */
    public int getCvr() {
        return cvr;
    }

    /**
     * @param cvr the cvr to set
     */
    public void setCvr(int cvr) {
        this.cvr = cvr;
    }

    /**
     * @return the gade
     */
    public String getGade() {
        return gade;
    }

    /**
     * @param gade the gade to set
     */
    public void setGade(String gade) {
        this.gade = gade;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    }
    
    
    
    

