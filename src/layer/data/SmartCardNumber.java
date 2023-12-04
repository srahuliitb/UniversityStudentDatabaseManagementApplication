package layer.data;

public class SmartCardNumber {
    private final String studentInitials;
    private final int issueYear;
    private final int arbitraryNumber;

    public SmartCardNumber(String studentInitials, int issueYear, int arbitraryNumber) {
        this.studentInitials = studentInitials;
        this.issueYear = issueYear;
        this.arbitraryNumber = arbitraryNumber;
    }

    public String getStudentInitials() {
        return studentInitials;
    }

    public int getArbitraryNumber() {
        return arbitraryNumber;
    }

    public int getIssueYear() {
        return issueYear;
    }

    @Override
    public int hashCode() {
        int hc = 17;
        hc = 37 * hc
                + (studentInitials == null ? 0 : studentInitials.hashCode());
        return 37 * hc + 19 * issueYear + 29 * arbitraryNumber;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof SmartCardNumber)) {
            return false;
        }
        SmartCardNumber smartCardNumber = (SmartCardNumber) object;
        return (this.getStudentInitials() == smartCardNumber.getStudentInitials())
                && (this.getIssueYear() == smartCardNumber.getIssueYear())
                && (this.getArbitraryNumber() == smartCardNumber.getArbitraryNumber());
    }

    public String toString() {
        return studentInitials + "-" + issueYear + "-" + arbitraryNumber;
    }
}
