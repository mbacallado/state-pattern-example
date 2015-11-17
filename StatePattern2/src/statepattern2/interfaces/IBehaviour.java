package statepattern2.interfaces;

import statepattern2.models.State;

/*
 * Interface that contains a method to process the behaviour and will be implement by other classes
 */
public interface IBehaviour {
	public State f_behaviour(State a_state);
	public void f_actualBehaviour();
}
