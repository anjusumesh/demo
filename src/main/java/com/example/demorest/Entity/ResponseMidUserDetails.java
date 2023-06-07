package com.example.demorest.Entity;

import java.math.BigInteger;


import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="ResponseMidUserDetails",namespace="http://tempuri.org/InquireMidUserDetails/")
@XmlType(name = "", propOrder = {
    "civilIdNumber",
    "fullNameAr",
    "fullNameEn",
    "nationalityEn",
    "nationalityAr",
    "birthDate",
    "gender",
    "mobileNumber",
    "emailId",
    "bloodGroup",
    "cardSerialNumber",
    "cardExpiryDate",
    "documentNumber",
    "passportNumber",
    "moiReferenceNumber",
    "sponsorName",
    "governorate",
    "area",
    "paciBuildingNumber",
    "buildingType",
    "floorNumber",
    "buildingNumber",
    "blockNumber",
    "unitNumber",
    "streetName",
    "unitType",
    "lastUpdTs"
})
	public class ResponseMidUserDetails {

        @XmlElement(name = "CivilIdNumber")
        protected long civilIdNumber;
        @XmlElement(name = "FullNameAr", required = true)
        protected String fullNameAr;
        @XmlElement(name = "FullNameEn", required = true)
        protected String fullNameEn;
        @XmlElement(name = "NationalityEn", required = true)
        protected String nationalityEn;
        @XmlElement(name = "NationalityAr", required = true)
        protected String nationalityAr;
        @XmlElement(name = "BirthDate")
        protected int birthDate;
        @XmlElement(name = "Gender", required = true)
        protected String gender;
        @XmlElement(name = "MobileNumber")
        protected int mobileNumber;
        @XmlElement(name = "EmailId", required = true)
        protected String emailId;
        @XmlElement(name = "BloodGroup", required = true)
        protected String bloodGroup;
        @XmlElement(name = "CardSerialNumber")
        protected int cardSerialNumber;
        @XmlElement(name = "CardExpiryDate")
        protected int cardExpiryDate;
        @XmlElement(name = "DocumentNumber")
        protected short documentNumber;
        @XmlElement(name = "PassportNumber", required = true)
        protected String passportNumber;
        @XmlElement(name = "MoiReferenceNumber")
        protected int moiReferenceNumber;
        @XmlElement(name = "SponsorName", required = true)
        protected String sponsorName;
        @XmlElement(name = "Governorate", required = true)
        protected String governorate;
        @XmlElement(name = "Area", required = true)
        protected String area;
        @XmlElement(name = "PaciBuildingNumber")
        protected int paciBuildingNumber;
        @XmlElement(name = "BuildingType", required = true)
        protected String buildingType;
        @XmlElement(name = "FloorNumber")
        protected byte floorNumber;
        @XmlElement(name = "BuildingNumber")
        protected byte buildingNumber;
        @XmlElement(name = "BlockNumber")
        protected byte blockNumber;
        @XmlElement(name = "UnitNumber")
        protected byte unitNumber;
        @XmlElement(name = "StreetName", required = true)
        protected String streetName;
        @XmlElement(name = "UnitType", required = true)
        protected String unitType;
        @XmlElement(name = "LastUpdTs", required = true)
        protected BigInteger lastUpdTs;

        
        /**
         * Gets the value of the civilIdNumber property.
         * 
         */
        public long getCivilIdNumber() {
            return civilIdNumber;
        }

        /**
         * Sets the value of the civilIdNumber property.
         * 
         */
        public void setCivilIdNumber(long value) {
            this.civilIdNumber = value;
        }

        /**
         * Gets the value of the fullNameAr property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFullNameAr() {
            return fullNameAr;
        }

        /**
         * Sets the value of the fullNameAr property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFullNameAr(String value) {
            this.fullNameAr = value;
        }

        /**
         * Gets the value of the fullNameEn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFullNameEn() {
            return fullNameEn;
        }

        /**
         * Sets the value of the fullNameEn property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFullNameEn(String value) {
            this.fullNameEn = value;
        }

        /**
         * Gets the value of the nationalityEn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNationalityEn() {
            return nationalityEn;
        }

        /**
         * Sets the value of the nationalityEn property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNationalityEn(String value) {
            this.nationalityEn = value;
        }

        /**
         * Gets the value of the nationalityAr property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNationalityAr() {
            return nationalityAr;
        }

        /**
         * Sets the value of the nationalityAr property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNationalityAr(String value) {
            this.nationalityAr = value;
        }

        /**
         * Gets the value of the birthDate property.
         * 
         */
        public int getBirthDate() {
            return birthDate;
        }

        /**
         * Sets the value of the birthDate property.
         * 
         */
        public void setBirthDate(int value) {
            this.birthDate = value;
        }

        /**
         * Gets the value of the gender property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGender() {
            return gender;
        }

        /**
         * Sets the value of the gender property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGender(String value) {
            this.gender = value;
        }

        /**
         * Gets the value of the mobileNumber property.
         * 
         */
        public int getMobileNumber() {
            return mobileNumber;
        }

        /**
         * Sets the value of the mobileNumber property.
         * 
         */
        public void setMobileNumber(int value) {
            this.mobileNumber = value;
        }

        /**
         * Gets the value of the emailId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEmailId() {
            return emailId;
        }

        /**
         * Sets the value of the emailId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEmailId(String value) {
            this.emailId = value;
        }

        /**
         * Gets the value of the bloodGroup property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBloodGroup() {
            return bloodGroup;
        }

        /**
         * Sets the value of the bloodGroup property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBloodGroup(String value) {
            this.bloodGroup = value;
        }

        /**
         * Gets the value of the cardSerialNumber property.
         * 
         */
        public int getCardSerialNumber() {
            return cardSerialNumber;
        }

        /**
         * Sets the value of the cardSerialNumber property.
         * 
         */
        public void setCardSerialNumber(int value) {
            this.cardSerialNumber = value;
        }

        /**
         * Gets the value of the cardExpiryDate property.
         * 
         */
        public int getCardExpiryDate() {
            return cardExpiryDate;
        }

        /**
         * Sets the value of the cardExpiryDate property.
         * 
         */
        public void setCardExpiryDate(int value) {
            this.cardExpiryDate = value;
        }

        /**
         * Gets the value of the documentNumber property.
         * 
         */
        public short getDocumentNumber() {
            return documentNumber;
        }

        /**
         * Sets the value of the documentNumber property.
         * 
         */
        public void setDocumentNumber(short value) {
            this.documentNumber = value;
        }

        /**
         * Gets the value of the passportNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPassportNumber() {
            return passportNumber;
        }

        /**
         * Sets the value of the passportNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPassportNumber(String value) {
            this.passportNumber = value;
        }

        /**
         * Gets the value of the moiReferenceNumber property.
         * 
         */
        public int getMoiReferenceNumber() {
            return moiReferenceNumber;
        }

        /**
         * Sets the value of the moiReferenceNumber property.
         * 
         */
        public void setMoiReferenceNumber(int value) {
            this.moiReferenceNumber = value;
        }

        /**
         * Gets the value of the sponsorName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSponsorName() {
            return sponsorName;
        }

        /**
         * Sets the value of the sponsorName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSponsorName(String value) {
            this.sponsorName = value;
        }

        /**
         * Gets the value of the governorate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGovernorate() {
            return governorate;
        }

        /**
         * Sets the value of the governorate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGovernorate(String value) {
            this.governorate = value;
        }

        /**
         * Gets the value of the area property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getArea() {
            return area;
        }

        /**
         * Sets the value of the area property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setArea(String value) {
            this.area = value;
        }

        /**
         * Gets the value of the paciBuildingNumber property.
         * 
         */
        public int getPaciBuildingNumber() {
            return paciBuildingNumber;
        }

        /**
         * Sets the value of the paciBuildingNumber property.
         * 
         */
        public void setPaciBuildingNumber(int value) {
            this.paciBuildingNumber = value;
        }

        /**
         * Gets the value of the buildingType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBuildingType() {
            return buildingType;
        }

        /**
         * Sets the value of the buildingType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBuildingType(String value) {
            this.buildingType = value;
        }

        /**
         * Gets the value of the floorNumber property.
         * 
         */
        public byte getFloorNumber() {
            return floorNumber;
        }

        /**
         * Sets the value of the floorNumber property.
         * 
         */
        public void setFloorNumber(byte value) {
            this.floorNumber = value;
        }

        /**
         * Gets the value of the buildingNumber property.
         * 
         */
        public byte getBuildingNumber() {
            return buildingNumber;
        }

        /**
         * Sets the value of the buildingNumber property.
         * 
         */
        public void setBuildingNumber(byte value) {
            this.buildingNumber = value;
        }

        /**
         * Gets the value of the blockNumber property.
         * 
         */
        public byte getBlockNumber() {
            return blockNumber;
        }

        /**
         * Sets the value of the blockNumber property.
         * 
         */
        public void setBlockNumber(byte value) {
            this.blockNumber = value;
        }

        /**
         * Gets the value of the unitNumber property.
         * 
         */
        public byte getUnitNumber() {
            return unitNumber;
        }

        /**
         * Sets the value of the unitNumber property.
         * 
         */
        public void setUnitNumber(byte value) {
            this.unitNumber = value;
        }

        /**
         * Gets the value of the streetName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStreetName() {
            return streetName;
        }

        /**
         * Sets the value of the streetName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStreetName(String value) {
            this.streetName = value;
        }

        /**
         * Gets the value of the unitType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUnitType() {
            return unitType;
        }

        /**
         * Sets the value of the unitType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUnitType(String value) {
            this.unitType = value;
        }

        /**
         * Gets the value of the lastUpdTs property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getLastUpdTs() {
            return lastUpdTs;
        }

        /**
         * Sets the value of the lastUpdTs property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setLastUpdTs(BigInteger value) {
            this.lastUpdTs = value;
        }

    
}
