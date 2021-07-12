package org.eclipse.poosl.rotalumisclient.debug;

import org.eclipse.poosl.generatedxmlclasses.TExecutiontreeBase;

public class ExecutionTreeContext {
    private final PooslThread context;

    private final TExecutiontreeBase executiontreeBase;

    public ExecutionTreeContext(PooslThread context, TExecutiontreeBase executiontreeBase) {
        this.context = context;
        this.executiontreeBase = executiontreeBase;
    }

    public PooslThread getContext() {
        return context;
    }

    public TExecutiontreeBase getExecutiontreeBase() {
        return executiontreeBase;
    }
}