package statepattern2.models.behaviour;

import statepattern2.interfaces.IBehaviour;
import statepattern2.models.State;

public class AgressiveBehavoiur implements IBehaviour{
	
	/**
	 * Function amending turning it into aggressive behavior
	 */
	@Override
	public State f_behaviour(State a_state) {
		State t_state = new State(a_state.f_getLife(),(a_state.f_getAttack()+20),a_state.f_getDefense());
		return t_state;
	}

	@Override
	public void f_actualBehaviour() {
		System.out.println("Actual Behaviour: Agressive");
	}


}
