import java.io.Serializable;
import java.util.Objects;

public abstract class PaleoFood implements Serializable {
    protected String mName;
    protected int mCalories, mCarbohydrates;

    public PaleoFood(String mName, int mCalories, int mCarbohydrates) {
        this.mName = mName;
        this.mCalories = mCalories;
        this.mCarbohydrates = mCarbohydrates;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public int getmCalories() {
        return mCalories;
    }

    public void setmCalories(int mCalories) {
        this.mCalories = mCalories;
    }

    public int getmCarbohydrates() {
        return mCarbohydrates;
    }

    public void setmCarbohydrates(int mCarbohydrates) {
        this.mCarbohydrates = mCarbohydrates;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PaleoFood paleoFood = (PaleoFood) o;
        return mCalories == paleoFood.mCalories && mCarbohydrates == paleoFood.mCarbohydrates && mName.equals(paleoFood.mName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mName, mCalories, mCarbohydrates);
    }


}
