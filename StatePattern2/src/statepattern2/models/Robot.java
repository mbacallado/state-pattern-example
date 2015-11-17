package statepattern2.models;

import statepattern2.interfaces.IBehaviour;
import statepattern2.interfaces.IState;
import statepattern2.models.state.NormalState;

public class Robot {
	private String m_name;
	private IBehaviour m_behaviour;
	private IState m_statement;
	State m_state;
	
	public Robot(String a_name){
		this.m_name = a_name;
		this.m_statement = new NormalState(this);
		this.m_state = new State();
	}
	
	public void f_setBehaviour(IBehaviour a_behaviour){
		this.m_behaviour = a_behaviour;
	}
	
	
	public void f_moveBehaviour(){
		this.m_state.f_restore();
		this.f_setState(this.m_behaviour.f_behaviour(this.m_state));
	}
	
	public void f_setState(IState a_state){
		this.m_statement = a_state;
	}
	
	public void f_agressiveState(){
		this.m_statement.f_agressiveState();
	}
	
	public void f_defensiveState(){
		this.m_statement.f_defensiveState();
	}
	
	public void f_normalState(){
		this.m_statement.f_normalState();
	}
	
	public void f_actualState(){
		this.m_statement.f_actualState();
	}
	
	public void f_actualBehaviour(){
		this.m_behaviour.f_actualBehaviour();
	}
	
	public void f_setState(State a_state){
		this.m_state = a_state;
	}
	
	public State f_getState(){
		return this.m_state;
	}
	
	public void f_setName(String a_name){
		this.m_name=a_name;
	}
	
	public String f_getName(){
		return this.m_name;
	}
	
	public void f_showRobot(){
		System.out.println("Name: " + this.f_getName());
		System.out.println("Health: " + this.f_getState().f_getLife());
		System.out.println("Attack: " + this.f_getState().f_getAttack());
		System.out.println("Defense: " + this.f_getState().f_getDefense());
		System.out.println("---------------------------------------------------------------");
	}

}
