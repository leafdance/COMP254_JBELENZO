package assignment.lab.two;

public class InputNandTimeT<V> {
	
	private int inputN; // The X axis
	private long timeT; // The Y axis
	private V resultValue; // The value of resulting computation
	
	public InputNandTimeT(int inputAxisX, long timeTaxisY) {
		this.inputN = inputAxisX;
		this.timeT = timeTaxisY;
	}
	
	public InputNandTimeT(int inputAxisX, long timeTaxisY, V valueResultComputation) {
		this(inputAxisX, timeTaxisY);
		this.resultValue = valueResultComputation;
	}
	
	public int getInputN() {
		return inputN;
	}
	public void setInputN(int inputN) {
		this.inputN = inputN;
	}
	
	public long getTimeT() {
		return timeT;
	}
	public void setTimeT(long timeT) {
		this.timeT = timeT;
	}
	
	public V getResultValue() {
		return resultValue;
	}
	public void setResultValue(V resultValue) {
		this.resultValue = resultValue;
	}

}
