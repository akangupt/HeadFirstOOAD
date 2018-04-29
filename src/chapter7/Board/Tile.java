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

    protected void addUnit(Unit unit) {
        units.add(unit);
    }

    protected void removeUnit(Unit unit) {
        units.remove(unit);
    }

    protected void removeUnits() {
        units = new LinkedList();
    }

    protected List getUnits() {
        return new ArrayList();
    }
}
