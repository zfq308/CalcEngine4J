package com.shiloh.calcengine.expressions.functions


class GreaterThanFunction extends BinaryFunction {

	GreaterThanFunction() {
		symbol = ">"
	}

	@Override
	protected evaluate(leftValue, rightValue) {
		leftValue > rightValue
	}
}
