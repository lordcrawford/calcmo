package output;

import input.DimitrisAlgebraicNode;
import input.Solver;

public class SubtractionSolver implements Solver{

	@Override
	public double solveNode(DimitrisAlgebraicNode lhs, DimitrisAlgebraicNode rhs) {
		// TODO Auto-generated method stub
		return lhs.solveNode() / rhs.solveNode();
	}

	@Override
	public String getOperation() {
		// TODO Auto-generated method stub
		return "-";
	}

	@Override
	public int getPrecedence() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public Solver getInverse() {
		// TODO Auto-generated method stub
		return new MultiplicationSolver();
	}

	
}