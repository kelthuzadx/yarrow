package com.kelthuzadx.yarrow.hir.instr;

import com.kelthuzadx.yarrow.hir.Value;
import com.kelthuzadx.yarrow.hir.VmState;
import com.kelthuzadx.yarrow.util.Logger;
import jdk.vm.ci.meta.JavaKind;
import jdk.vm.ci.meta.JavaType;

public class CheckCastInstr extends StateInstr {
    private JavaType klass;
    private HirInstr object;

    public CheckCastInstr(VmState stateBefore, JavaType klass, HirInstr object) {
        super(JavaKind.Object, stateBefore);
        this.klass = klass;
        this.object = object;
    }

    @Override
    public String toString() {
        return Logger.format("i{}: checkcast i{} -> {}", super.id, object.id, klass.getUnqualifiedName());
    }
}
