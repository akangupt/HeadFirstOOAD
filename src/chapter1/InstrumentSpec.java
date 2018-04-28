package chapter1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class InstrumentSpec {

    private Map properties;

    public InstrumentSpec(Map prop) {
        this.properties = new HashMap();
        this.properties.putAll(prop);
    }

    public boolean matches(InstrumentSpec otherSpec) {
        for (Iterator j = otherSpec.properties.keySet().iterator(); j.hasNext();) {
            String propertyType = (String) j.next();
            if(!(otherSpec.getProperty(propertyType) == getProperty(propertyType))) return false;
        }
        return true;
    }

    public Map getProperties() {
        return this.properties;
    }

    public Object getProperty(String property) {
        return properties.get(property);
    }
}
