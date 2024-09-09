package chapter06.undo;

public interface Command {
	public void execute();
	public void undo();
}
