package statepattern2.models.behaviour;

import statepattern2.interfaces.IBehaviour;
import statepattern2.models.State;

public class NormalBehaviour implements IBehaviour{

	/*
	 * Function amending turning it into normal behavior
	 */
	@Override
	public State f_behaviour(State a_state) {
		return new State(a_state.f_getLife(), a_state.f_getAttack(), a_state.f_getDefense());
	}

	@Override
	public void f_actualBehaviour() {
		System.out.println("Actual Behaviour: Normal");
	}

}
