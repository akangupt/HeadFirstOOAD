package chapter7.Unit;

import java.util.HashMap;
import java.util.Map;

public class Unit {

    private String type;
    private Map properties;

    public Unit(String type, Map prop) {
        this.type = type;
        if(prop == null) this.properties = new HashMap();
        else this.properties = prop;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Map getProperties() {
        return properties;
    }

    public void setProperties(Map properties) {
        this.properties = properties;
    }
}
