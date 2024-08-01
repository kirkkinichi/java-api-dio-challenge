package kirk.example.java_api_dio.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "tb_passport")
public class Passport { 

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(unique = true)
    private String passportNumber;

    private String age;
    private String nationality;
    private String gender;
    private String expiryDate;
    private String issuingAuthority;
    private String holderSignature;
    private String holderPhotograph;
    private String controlCode;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getAge() { return age; }
    public void setAge(String age) { this.age = age; }

    public String getNationality() { return nationality; }
    public void setNationality(String nationality) { this.nationality = nationality; }

    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }

    public String getPassportNumber() { return passportNumber; }
    public void setPassportNumber(String passportNumber) { this.passportNumber = passportNumber; }

    public String getExpiryDate() { return expiryDate; }
    public void setExpiryDate(String expiryDate) { this.expiryDate = expiryDate; }

    public String getIssuingAuthority() { return issuingAuthority; }
    public void setIssuingAuthority(String issuingAuthority) { this.issuingAuthority = issuingAuthority; }

    public String getHolderSignature() { return holderSignature; }
    public void setHolderSignature(String holderSignature) { this.holderSignature = holderSignature; }

    public String getHolderPhotograph() { return holderPhotograph; }
    public void setHolderPhotograph(String holderPhotograph) { this.holderPhotograph = holderPhotograph; }
    
    public String getControlCode() { return controlCode; }
    public void setControlCode(String controlCode) { this.controlCode = controlCode; }

    
}
