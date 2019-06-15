package com.snoussi.eLearning.model;

import java.util.Collection;

public abstract class Economy {
    private Collection<Resource> resources;
    private Collection<Agent> agents;
    private boolean isFreeResourcesFlow;
    private boolean isEfficientResourcesAllocation;

    protected void allocateResources(Collection<Agent> agents){
        for (Agent agent : agents) {
            if(isOptimumAgent(agent))
                agent.allocateResources();
        }
    }

    protected abstract boolean isOptimumAgent(Agent agent);

    protected abstract Collection<Resource> collectResources();
}
