package com.kelthuzadx.yarrow.lir.instr;

import com.kelthuzadx.yarrow.lir.Mnemonic;
import com.kelthuzadx.yarrow.lir.operand.Address;
import com.kelthuzadx.yarrow.lir.operand.LirOperand;
import com.kelthuzadx.yarrow.util.Logger;

public class CallRtInstr extends LirInstr {
    private final Address routine;
    private final LirOperand[] argument;

    public CallRtInstr(LirOperand result, Address routine, LirOperand[] argument) {
        super(Mnemonic.CALL_RT, result);
        this.routine = routine;
        this.argument = argument;
    }

    @Override
    public String toString() {
        return Logger.format("i{}: call_rt {}", super.id, routine.toString());
    }
}