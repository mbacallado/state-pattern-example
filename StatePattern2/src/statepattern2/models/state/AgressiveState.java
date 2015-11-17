package statepattern2.models.state;

import statepattern2.interfaces.IState;
import statepattern2.models.Robot;
import statepattern2.models.behaviour.AgressiveBehavoiur;

public class AgressiveState implements IState{
	Robot m_robot;
	
	public AgressiveState(Robot a_robot) {
		this.m_robot = a_robot;
		this.m_robot.f_setBehaviour(new AgressiveBehavoiur());
	}
	
	/**
	 * Function amending turning it into aggressive, defensive or normal state
	 */
	@Override
	public void f_agressiveState() {
		System.out.println("Error, the actual state is agressive, you can't pick the same state");
	}

	@Override
	public void f_defensiveState() {
		this.m_robot.f_setState(new DefensiveState(this.m_robot));
		
	}

	@Override
	public void f_normalState() {
		this.m_robot.f_setState(new NormalState(this.m_robot));
		
	}

	@Override
	public void f_actualState() {
		System.out.println("Actual State: Agressive");
		
	}
}
