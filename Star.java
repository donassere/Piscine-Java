import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Objects;
import java.util.Locale;

public class Star extends CelestialObject{
    private double magnitude;
    
    public Star() {
        super();
        magnitude = 0;
    }

    public Star(String name, double x, double y, double z, double magnitude, int mass) {
        super(name, x, y, z, mass);
        this.magnitude = magnitude;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Star)) return false;
        if (!super.equals(object)) return false;
        Star star = (Star) object;
        return star.x== x && Double.compare(star.y, y) == 0 && Double.compare(star.z, z) == 0 && star.magnitude == magnitude && name.equals(star.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), x, y, z, name, magnitude);
    }

    public String toString(){
        DecimalFormat df = new DecimalFormat("0.000",new DecimalFormatSymbols(Locale.ENGLISH));
        return getName()+" shines at the "+df.format(getMagnitude())+" magnitude";
    }

    public double getMagnitude() {
        return magnitude;
    }

    public void setMagnitude(double magnitude) {
        this.magnitude = magnitude;
    }
}
