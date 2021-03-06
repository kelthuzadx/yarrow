package com.kelthuzadx.yarrow.hir.instr;

import com.kelthuzadx.yarrow.hir.VmState;
import com.kelthuzadx.yarrow.util.Logger;
import jdk.vm.ci.meta.JavaKind;

public class NewTypeArrayInstr extends StateInstr {
    private final HirInstr len;
    private final JavaKind elemType;

    public NewTypeArrayInstr(VmState stateBefore, HirInstr len, JavaKind elemType) {
        super(JavaKind.Object, stateBefore);
        this.len = len;
        this.elemType = elemType;
    }

    public HirInstr arrayLength() {
        return len;
    }

    public JavaKind getElemementType() {
        return elemType;
    }

    @Override
    public String toString() {
        return Logger.format("i{}: new {}[i{}]", super.id, elemType.getJavaName(), len.id);
    }
}
