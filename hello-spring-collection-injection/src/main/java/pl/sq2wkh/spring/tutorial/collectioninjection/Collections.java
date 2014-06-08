package pl.sq2wkh.spring.tutorial.collectioninjection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * Created by adam on 08.06.14.
 */
public class Collections {
    List list;
    Set set;
    Map map;
    Properties properties;

    public void setList(List list) {
        this.list = list;
    }
    public List getList() {
        System.out.println("List Elements :"  + list);
        return list;
    }

    public void setSet(Set set) {
        this.set = set;
    }

    public Set getSet() {
        System.out.println("Set Elements :"  + set);
        return set;
    }

    public void setMap(Map map) {
        this.map = map;
    }
    public Map getMap() {
        System.out.println("Map Elements :"  + map);
        return map;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }
    public Properties getProperties() {
        System.out.println("Property Elements :"  + properties);
        return properties;
    }
}
