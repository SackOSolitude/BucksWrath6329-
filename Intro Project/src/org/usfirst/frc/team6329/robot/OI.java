package org.usfirst.frc.team6329.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	public Joystick xbox;
	public JoystickButton subsystem;
	public Joystick flightstick;
	
	public OI() {
	xbox = new Joystick(0);
	flightstick = new Joystick(1);
	subsystem = new JoystickButton (flightstick, 3);
	
	
}
	public Joystick getXbox() {
		return xbox;
	}
	public Joystick getFlightStick(){
		return flightstick;
	}
	
}