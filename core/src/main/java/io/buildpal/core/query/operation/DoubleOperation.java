/*
 * Copyright 2017 Buildpal
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.buildpal.core.query.operation;

import io.buildpal.core.query.operand.Operand;

public class DoubleOperation implements Operation {

    private DoubleOperation() {}

    public static final DoubleOperation SELF = new DoubleOperation();

    public Boolean eq(Operand leftOperand, Operand rightOperand) {
        if (leftOperand.getValue() == null) return false;

        return leftOperand.toDouble().equals(rightOperand.getDoubleValue());
    }

    public Boolean ne(Operand leftOperand, Operand rightOperand) {
        if (leftOperand.getValue() == null) return false;

        return !leftOperand.toDouble().equals(rightOperand.getDoubleValue());
    }

    public Boolean gt(Operand leftOperand, Operand rightOperand) {
        if (leftOperand.getValue() == null) return false;

        return leftOperand.toDouble() > rightOperand.getDoubleValue();
    }

    public Boolean lt(Operand leftOperand, Operand rightOperand) {
        if (leftOperand.getValue() == null) return false;

        return leftOperand.toDouble() < rightOperand.getDoubleValue();
    }

    public Boolean ge(Operand leftOperand, Operand rightOperand) {
        if (leftOperand.getValue() == null) return false;

        return leftOperand.toDouble() >= rightOperand.getDoubleValue();
    }

    public Boolean le(Operand leftOperand, Operand rightOperand) {
        if (leftOperand.getValue() == null) return false;

        return leftOperand.toDouble() <= rightOperand.getDoubleValue();
    }

    public Boolean co(Operand leftOperand, Operand rightOperand) {
        throw new UnsupportedOperationException("co is not a supported operator on double.");
    }

    public Boolean sw(Operand leftOperand, Operand rightOperand) {
        throw new UnsupportedOperationException("sw is not a supported operator on double.");
    }

    public Boolean ew(Operand leftOperand, Operand rightOperand) {
        throw new UnsupportedOperationException("ew is not a supported operator on double.");
    }
}
