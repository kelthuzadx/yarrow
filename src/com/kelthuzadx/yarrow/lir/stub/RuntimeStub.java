package com.kelthuzadx.yarrow.lir.stub;

import com.kelthuzadx.yarrow.lir.instr.LabelInstr;

@SuppressWarnings("unused")
public class RuntimeStub {
    private final LabelInstr trampoline;
    private final LabelInstr continuation;
    protected VmStub stub;

    public RuntimeStub(VmStub stub) {
        this.stub = stub;
        this.trampoline = new LabelInstr();
        this.continuation = new LabelInstr();
    }


    public LabelInstr getTrampoline() {
        return trampoline;
    }

    public LabelInstr getContinuation() {
        return continuation;
    }
}
