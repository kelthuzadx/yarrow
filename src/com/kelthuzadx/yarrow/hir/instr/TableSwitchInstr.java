package com.kelthuzadx.yarrow.hir.instr;

import com.kelthuzadx.yarrow.hir.VmState;
import com.kelthuzadx.yarrow.util.Logger;
import jdk.vm.ci.meta.JavaKind;

import java.util.List;

public class TableSwitchInstr extends BlockEndInstr {
    private final HirInstr index;
    private final int lowKey;

    public TableSwitchInstr(VmState stateBefore, List<BlockStartInstr> successor, HirInstr index, int lowKey) {
        super(JavaKind.Illegal, stateBefore, successor);
        this.index = index;
        this.lowKey = lowKey;
    }

    public HirInstr getIndex() {
        return index;
    }

    public int getLowKey() {
        return lowKey;
    }

    public int getLength() {
        return getSuccessor().size() - 1;
    }

    @Override
    public String toString() {
        String caseStr = "";
        for (int i = 0; i < getSuccessor().size(); i++) {
            if (getSuccessor().size() - 1 != i) {
                caseStr += "#" + (lowKey + i) + "->i" + getSuccessor().get(i).id + ",";
            } else {
                caseStr += "*" + (lowKey + i) + "->i" + getSuccessor().get(i).id;
            }

        }
        return Logger.format("i{}: switch [{}]", super.id, caseStr);
    }
}
