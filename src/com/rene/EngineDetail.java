package com.rene;

/**
 * Created by RCornella on 14-7-2017.
 */
public class EngineDetail {
    private int weight;
    private int weightPowerRatio;

    public EngineDetail(int weight, int weightPowerRatio) {
        this.weight = weight;
        this.weightPowerRatio = weightPowerRatio;
    }

    public int getWeight() {
        return weight;
    }

    public int getWeightPowerRatio() {
        return weightPowerRatio;
    }
}
