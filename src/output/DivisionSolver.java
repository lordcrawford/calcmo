package output;

import input.DimitrisAlgebraicNode;
import input.Solver;

public class DivisionSolver implements Solver {
	private int precedence = 3;
	
	@Override
	public double solveNode(DimitrisAlgebraicNode lhs, DimitrisAlgebraicNode rhs) {
		// TODO Auto-generated method stub
		lhs.solve();
		rhs.solve();
		
		return lhs.value / rhs.value;
	}

	@Override
	public String getOperation() {
		// TODO Auto-generated method stub
		return "/";
	}

	@Override
	public int getPrecedence() {
		// TODO Auto-generated method stub
		return precedence;
	}

	@Override
	public Solver getInverse() {
		// TODO Auto-generated method stub
		return new MultiplicationSolver();
	}

	@Override
	public void addParent(DimitrisAlgebraicNode n) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean urinaryFunction() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Solver createNew() {
		// TODO Auto-generated method stub
		return new DivisionSolver();
	}

	@Override
	public void increasePrecedence(int amount) {
		precedence += amount;
		
	}

}
