import java.io.Serializable;
import java.util.Objects;

public class Produce extends PaleoFood implements Serializable {
    private int mOrganic;

    public Produce(String mName, int mCalories, int mCarbohydrates, int mOrganic) {
        super(mName, mCalories, mCarbohydrates);
        this.mOrganic = mOrganic;
    }

    public int getmOrganic() {
        return mOrganic;
    }

    public void setmOrganic(int mOrganic) {
        this.mOrganic = mOrganic;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Produce produce = (Produce) o;
        return mOrganic == produce.mOrganic;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), mOrganic);
    }

    @Override
    public String toString() {
        String organicYesNo = "";
        if(mOrganic == 1)
            organicYesNo += "Produce: ";
        if(mOrganic == 2)
            organicYesNo += "Organic Produce: ";
        return organicYesNo + mName + ", " + mCalories + " calories, "
                + mCarbohydrates + "g carbs";
    }
}
