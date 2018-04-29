package chapter7.Board;

import chapter7.Unit.Unit;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Tile {

    private List units;

    public Tile() {
        units = new LinkedList();
    }

    public void addUnit(Unit unit) {
        units.add(unit);
    }

    public void removeUnit(Unit unit) {
        units.remove(unit);
    }

    public void removeUnits() {
        units = new LinkedList();
    }

    public List getUnits() {
        return new ArrayList();
    }
}
