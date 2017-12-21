package org.usfirst.frc.team6329.robot;

import org.usfirst.frc.team6329.robot.commands.RunIntake;
import org.usfirst.frc.team6329.robot.commands.RunShooter;
import org.usfirst.frc.team6329.robot.commands.StopIntake;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {

	public Joystick Driver;
	public JoystickButton StartIntake;
	public JoystickButton PauseIntake;
	public JoystickButton StartShooter;
	public JoystickButton PauseShooter;

public OI(){
	
	Driver = new Joystick(0);
	StartIntake = new JoystickButton(Driver,5);
	StartIntake.whileHeld(new RunIntake());
	PauseIntake = new JoystickButton(Driver,5);
	PauseIntake.whenReleased(new StopIntake());
	StartShooter = new JoystickButton(Driver,6);
	StartShooter.whenReleased(new RunShooter());
	PauseShooter = new JoystickButton(Driver,6);
	PauseShooter.whenReleased(new RunShooter());
	
}

public Joystick getXbox() {
    return Driver;
}

}
