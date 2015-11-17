package statepattern2.models.state;

import statepattern2.interfaces.IState;
import statepattern2.models.Robot;
import statepattern2.models.behaviour.DefensiveBehaviour;

public class DefensiveState implements IState{
	Robot m_robot;

	public DefensiveState(Robot a_robot) {
		this.m_robot = a_robot;
		this.m_robot.f_setBehaviour(new DefensiveBehaviour());
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
		System.out.println("Error, the actual state is defensive, you can't pick the same state");
	}

	@Override
	public void f_normalState() {
		this.m_robot.f_setState(new NormalState(this.m_robot));
		
	}

	@Override
	public void f_actualState() {
		System.out.println("Actual State: Defensive");
		
	}
}
