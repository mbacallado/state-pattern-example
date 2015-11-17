/**
 * 
 */
package statepattern2.models;

public class State {
	private int m_life;
	private int m_attack;
	private int m_defense;
	
	public State(){
		this.m_life = 100;
		this.m_attack = 100;
		this.m_defense = 60;
	}
	
	public State(int a_life,int a_attack,int a_defense){
		this.m_life = a_life;
		this.m_attack = a_attack;
		this.m_defense = a_defense;
	}
	
	public int f_getLife() {
		return m_life;
	}
	
	public void f_setLife(int a_life) {
		this.m_life = a_life;
	}
	
	public void setAttack(int a_attack) {
		this.m_attack = a_attack;
	}
	
	public int f_getAttack() {
		return this.m_attack;
	}
	
	public void f_setDefense(int a_defense) {
		this.m_defense = a_defense;
	}
	
	public int f_getDefense() {
		return this.m_defense;
	}
	
	public void f_restoreAll(){
		this.m_life = 100;
		f_restore();
	}
	
	public void f_restore(){
		this.m_attack = 100;
		this.m_defense = 60;
	}
	
}
