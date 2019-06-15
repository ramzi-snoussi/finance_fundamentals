package com.snoussi.eLearning.model;

import java.util.Collection;

public abstract class Agent implements Comparable<Agent> {
    private Collection<Resource> resources;
    private Collection<Product> products;
    private float revenus;
    private float costs;

    public Collection<Product> getProducts() {
        return products;
    }

    public void setResources(Collection<Resource> resources) {
        this.resources = resources;
    }

    public float getProfit() {
        return revenus - costs;
    }

    public int compareTo(Agent o) {
        if (this.getProfit() > o.getProfit()) {
            return 1;
        } else if (this.getProfit() == o.getProfit()) {
            return 0;
        } else {
            return -1;
        }
    }
}
