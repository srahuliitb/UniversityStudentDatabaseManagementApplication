package layer.data;

public class StudentID {
    private final String firstLetter;
    private final int fourDigitNum;

    public StudentID(String firstLetter, int fourDigitNum) {
        this.firstLetter = firstLetter;
        this.fourDigitNum = fourDigitNum;
    }

    public String getFirstLetter() {
        return this.firstLetter;
    }

    public int getFourDigitNum() {
        return this.fourDigitNum;
    }

    @Override
    public int hashCode() {
        int hc = 17;
        hc = 37 * hc
                + (firstLetter == null ? 0 : firstLetter.hashCode());
        return 37 * hc + fourDigitNum;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof StudentID)) {
            return false;
        }
        StudentID studentId = (StudentID) object;
        return (this.getFirstLetter() == studentId.getFirstLetter()) && (this.getFourDigitNum() == studentId.getFourDigitNum());
    }

    public String toString() {
        return firstLetter + fourDigitNum;
    }
}
