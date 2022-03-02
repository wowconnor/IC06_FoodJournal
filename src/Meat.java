import java.io.Serializable;
import java.util.Objects;

public class Meat extends PaleoFood implements Serializable {
    private int mCookingTemp;
    private int mType;

    public Meat(String mName, int mCalories, int mCarbohydrates, int mCookingType, int mType) {
        super(mName, mCalories, mCarbohydrates);
        this.mCookingTemp = mCookingType;
        this.mType = mType;
    }

    public int getmCookingTemp() {
        return mCookingTemp;
    }

    public void setmCookingTemp(int mCookingTemp) {
        this.mCookingTemp = mCookingTemp;
    }

    public int getmType() {
        return mType;
    }

    public void setmType(int mType) {
        this.mType = mType;
    }

    @Override
    public String toString() {
        String whatAnimal = "";
        if(mType == 1)
            whatAnimal += "Meat: ";
        if(mType == 2)
            whatAnimal += "Seafood: ";
        return whatAnimal + mName + ", " + mCalories + "calories, "
                + mCarbohydrates + "g carbs, " + mCookingTemp +
                " degrees F";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Meat meat = (Meat) o;
        return mCookingTemp == meat.mCookingTemp && mType == meat.mType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), mCookingTemp, mType);
    }

}
