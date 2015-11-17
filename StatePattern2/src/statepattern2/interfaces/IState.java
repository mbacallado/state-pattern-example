package statepattern2.interfaces;

/*
 * Interface that contains a method to process the state and will be implement by other classes
 */
public interface IState {
	public void f_agressiveState();
	public void f_defensiveState();
	public void f_normalState();
	public void f_actualState();
}
