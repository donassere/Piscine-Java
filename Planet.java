import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Objects;
import java.util.Locale;

public class Planet extends CelestialObject{
    private Star centerStar;
    
    public Planet(){
        super();
        centerStar = new Star();
    }

    public Planet(String name, double x, double y, double z, Star centerStar, int mass){
        super(name, x, y, z, mass);
        this.centerStar = centerStar;
    }

    public Star getCenterStar(){
        return centerStar;
    }

    public void setCenterStar(Star centerStar){
        this.centerStar = centerStar;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Planet)) return false;
        if (!super.equals(object)) return false;
        Planet planet = (Planet) object;
        return Objects.equals(centerStar, planet.centerStar);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), centerStar);
    }

    public String toString(){
        DecimalFormat df = new DecimalFormat("0.000",new DecimalFormatSymbols(Locale.ENGLISH));
        return this.name+" circles around "+ this.centerStar.name+" at the "+df.format(getDistanceBetween(this, this.centerStar))+" AU";
    }
}
