package Lab07;

import java.util.ArrayList;

public class BinPacking {
    private ArrayList<ArrayList<Integer>> containers = new ArrayList<>();
    private ArrayList<Integer> element = new ArrayList<>();
    private int maxWeight;

    public BinPacking(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    @Override
    public String toString() {
        return "" + containers;
    }

    public boolean addItem(int itemWeight) {
        for (ArrayList<Integer> array : containers) {
            int sum = 0;
            for (int i = 0; i < array.size(); i++) {
                sum = sum + array.get(i);
            }

            if (!(sum + itemWeight > maxWeight)) {
                array.add(itemWeight);
                return true;
            }
        }
        ArrayList<Integer> alter = new ArrayList<>();
        alter.add(itemWeight);
        containers.add(alter);
        return false;

    }


}
