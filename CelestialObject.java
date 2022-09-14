import static java.lang.Math.*;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Objects;

public class CelestialObject {
    public double x;
    public double y;
    public double z;
    public String name;
    public static double KM_IN_ONE_AU = 150000000;
    private int mass;

    public CelestialObject() {
        this.x = 0.0;
        this.y = 0.0;
        this.z = 0.0;
        this.name = "Soleil";
        this.mass = 0;
    }

    public static double getDistanceBetweenInKm(CelestialObject defaultStar, CelestialObject earth) {
        return getDistanceBetween(defaultStar,earth)*KM_IN_ONE_AU;
    }
    static public double getDistanceBetween(CelestialObject x,CelestialObject y){
        return sqrt(pow((x.getX()-y.getX()),2)+pow((x.getY()-y.getY()),2)+pow((x.getZ()-y.getZ()),2));
    }

    public String toString() {
        DecimalFormat df = new DecimalFormat("#.000", new DecimalFormatSymbols(Locale.ENGLISH));
        return getName()+" is positioned at ("+df.format(getX())+", "+df.format(getY())+", "+df.format(getZ())+")";
    }

    public double getX() {
        return x;
    }

    public void setX(double x){
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y){
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z){
        this.z = z;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getMass(){
        return mass;
    }

    public void setMass(int mass){
        this.mass = mass;
    }
    
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        CelestialObject that = (CelestialObject) object;
        return Double.compare(that.x, x) == 0 && Double.compare(that.y, y) == 0 && Double.compare(that.z, z) == 0 && name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z, name);
    }

    public CelestialObject(String name, double x, double y, double z, int mass){
        this.x = x;
        this.z = z;
        this.y = y;
        this.name = name;
        this.mass = mass;
    }
}
