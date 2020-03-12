package com.kelthuzadx.yarrow.hir.instr;

import com.kelthuzadx.yarrow.hir.Value;
import jdk.vm.ci.meta.JavaKind;
import jdk.vm.ci.meta.JavaType;

public class InstanceOfInstr extends Instruction {
    private JavaType klass;
    private Instruction object;

    public InstanceOfInstr(JavaType klass, Instruction object) {
        super(new Value(JavaKind.Int));
        this.klass = klass;
        this.object = object;
    }
}