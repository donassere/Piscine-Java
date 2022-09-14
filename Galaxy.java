import java.util.*;

public class Galaxy {
    private List<CelestialObject> celestialObjects;

    public List<CelestialObject> getCelestialObjects() {
        return celestialObjects;
    }

    public Galaxy(List<CelestialObject> celestialObjects) {
        this.celestialObjects = celestialObjects;
    }

    public Galaxy(){
        this.celestialObjects= new ArrayList<>();
    }

    public void addCelestialObject(CelestialObject x){
        this.celestialObjects.add(x);
    }

    public Map<String,Integer> computeMassRepartition(){
        Map<String,Integer> F= new HashMap<>();
        F.put("Star",0);
        F.put("Planet",0);
        F.put("Other",0);
        for(CelestialObject i:this.celestialObjects){
            if(i.getClass() == Star.class){
                F.replace("Star",F.get("Star"),F.get("Star")+i.getMass());
            }
            if(i.getClass() == Planet.class){
                F.replace("Planet",F.get("Planet"),F.get("Planet")+i.getMass());
            }
            if(i.getClass() == CelestialObject.class){
                F.replace("Other",F.get("Other"),F.get("Other")+i.getMass());
            }

        }
        return  F;
    }
}
