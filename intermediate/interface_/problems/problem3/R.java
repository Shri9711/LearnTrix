package interface_.problems.problem3;

public class R implements P, Q {

	@Override
	public String methodQ() {
		return p;
	}

	@Override
	public String methodP() {
		return q;
	}
}
