import java.util.Objects;

/**
 * @author mbaranowicz
 */
public class MyKey {

    int value;

    public MyKey(int value) {
        this.value = value;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyKey myKey = (MyKey) o;
        return value == myKey.value;
    }

    @Override
    public int hashCode() {
        if(value >= 0 && value <= 9){
            return 0;
        }
        if(value>=10 && value <= 19){
            return 1;
        }
        if(value>=20 && value <= 29){
            return 2;
        }

        return Objects.hash(value);
    }
}
