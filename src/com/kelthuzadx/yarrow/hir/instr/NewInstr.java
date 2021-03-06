package com.kelthuzadx.yarrow.hir.instr;

import com.kelthuzadx.yarrow.hir.VmState;
import com.kelthuzadx.yarrow.util.Logger;
import jdk.vm.ci.meta.JavaKind;
import jdk.vm.ci.meta.JavaType;

public class NewInstr extends StateInstr {
    JavaType klass;

    public NewInstr(VmState stateBefore, JavaType klass) {
        super(JavaKind.Object, stateBefore);
        this.klass = klass;
    }

    public JavaType getKlass() {
        return klass;
    }

    @Override
    public String toString() {
        return Logger.format("i{}: new {}", super.id, klass.getUnqualifiedName());
    }
}
