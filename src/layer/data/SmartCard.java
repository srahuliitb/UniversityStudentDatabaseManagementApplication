package layer.data;

import java.util.Date;

public class SmartCard {
    private final Name name;
    private final Date dateOfBirth;
    private final SmartCardNumber smartCardNumber;
    private final Date dateOfIssue;
    private Date expiryDate;

    public SmartCard(Name name, Date dateOfBirth, SmartCardNumber smartCardNumber, Date dateOfIssue, Date expiryDate) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.smartCardNumber = smartCardNumber;
        this.dateOfIssue = dateOfIssue;
        this.expiryDate = expiryDate;
    }

    public String getName() {
        return this.name.toString();
    }

    public Date getDateOfBirth() {
        return this.dateOfBirth;
    }

    public String getSmartCardNumber() {
        return this.smartCardNumber.toString();
    }

    public Date getDateOfIssue() {
        return this.dateOfIssue;
    }

    public Date getExpiryDate() {
        return this.expiryDate;
    }

    private void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String toString() {
        return "Name: " + getName() + "\n" +
                "Date of Birth: " + getDateOfBirth() + "\n" +
                "Smart Card Number: " + getSmartCardNumber() + "\n" +
                "Date of Issue: " + getDateOfIssue() + "\n" +
                "Expiry Date: " + getExpiryDate();
    }
}
