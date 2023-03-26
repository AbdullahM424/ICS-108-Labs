package Lab06;

import java.util.ArrayList;

public class Container {
    private ArrayList<Integer> weight = new ArrayList<>();
    private int maxWeight;

    public Container(int maxWeight) {
        this.maxWeight = maxWeight;

    }
     @Override
    public String toString(){
        return ""+weight;
    }

    public boolean addItem(int itemWeight) {
        int sum = 0;
        for (int sums : weight) {
            sum += sums;
        }

        if (sum + itemWeight <= maxWeight) {
            weight.add(itemWeight);
            return true;
        }


        return false;
    }
}
