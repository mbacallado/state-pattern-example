import statepattern2.models.Robot;

public class Main {

	public static void main(String[] args) {
		Robot t_robot = new Robot("Robot 1");
		t_robot.f_actualState();
		t_robot.f_actualBehaviour();
		t_robot.f_moveBehaviour();
		t_robot.f_showRobot();
		//Normal
		t_robot.f_normalState();
		//Agressive
		t_robot.f_agressiveState();
		t_robot.f_actualState();
		t_robot.f_actualBehaviour();
		t_robot.f_moveBehaviour();
		t_robot.f_showRobot();
		//Defensive
		t_robot.f_defensiveState();
		t_robot.f_actualState();
		t_robot.f_actualBehaviour();
		t_robot.f_moveBehaviour();
		t_robot.f_showRobot();
	}

}
