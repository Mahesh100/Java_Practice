package DesignPattern.StructuralDesignPattern.AdapterDesignPattern.Adapter;

import DesignPattern.StructuralDesignPattern.AdapterDesignPattern.Adaptee.WeightMachine;

public class WeightMachineAdapterImpl implements WeightMachineAdapter{

    WeightMachine weightMachine;

    public WeightMachineAdapterImpl(WeightMachine weightMachine){
        this.weightMachine =weightMachine;
    }

    public double getWeightInKg(){
        double weightInPound = weightMachine.getWeightInPound();

        //convert it to Kg
        double weightInKg = weightInPound*45;
        return weightInKg;
    }
}
