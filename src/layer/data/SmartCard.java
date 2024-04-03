package layer.data;

import java.util.Date;

public class SmartCard {
    private final Name studentName;
    private final Date dateOfBirth;
    private final StudentID studentID;
    private final SmartCardNumber smartCardNumber;
    private final Date dateOfIssue;
    private Date expiryDate;

    public SmartCard(Name studentName, Date dateOfBirth, StudentID studentID, SmartCardNumber smartCardNumber, Date dateOfIssue) {
        this.studentName = studentName;
        this.dateOfBirth = dateOfBirth;
        this.studentID = studentID;
        this.smartCardNumber = smartCardNumber;
        this.dateOfIssue = dateOfIssue;
        setExpiryDate();
    }

    public String getName() {
        return this.studentName.toString();
    }

    public Date getDateOfBirth() {
        return this.dateOfBirth;
    }

    public StudentID getStudentID() {
        return this.studentID;
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

    private void setExpiryDate() {
        // Assuming UG prefix is 'U', PGT prefix is 'P', and PGR prefix is 'R'
        int yearsToAdd;
        switch (studentID.getFirstLetter()) {
            case "U":
                yearsToAdd = 4;
                break;
            case "P":
                yearsToAdd = 2;
                break;
            case "R":
                yearsToAdd = 5;
                break;
            default:
                yearsToAdd = 0;
        }
        expiryDate = new Date(dateOfIssue.getTime() + yearsToAdd * 365L * 24 * 60 * 60 * 1000);
    }

    public String toString() {
        return "Name: " + getName() + "\n" +
                "Date of Birth: " + getDateOfBirth() + "\n" +
                "Smart Card Number: " + getSmartCardNumber() + "\n" +
                "Date of Issue: " + getDateOfIssue() + "\n" +
                "Expiry Date: " + getExpiryDate();
    }
}
