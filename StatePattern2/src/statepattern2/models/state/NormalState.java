package statepattern2.models.state;

import statepattern2.interfaces.IState;
import statepattern2.models.Robot;
import statepattern2.models.behaviour.NormalBehaviour;

public class NormalState implements IState{
	Robot m_robot;
	
	public NormalState(Robot a_robot) {
		this.m_robot = a_robot;
		this.m_robot.f_setBehaviour(new NormalBehaviour());
	}

	/**
	 * Function amending turning it into aggressive, defensive or normal state
	 */
	@Override
	public void f_agressiveState() {
		this.m_robot.f_setState(new AgressiveState(this.m_robot));
	}

	@Override
	public void f_defensiveState() {
		this.m_robot.f_setState(new DefensiveState(this.m_robot));
		
	}

	@Override
	public void f_normalState() {
		System.out.println("Error, the actual state is normal, you can't pick the same state");
		
	}

	@Override
	public void f_actualState() {
		System.out.println("Actual State: Normal");
	}
}
