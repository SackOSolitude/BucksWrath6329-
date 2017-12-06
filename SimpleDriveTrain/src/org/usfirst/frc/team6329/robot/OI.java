package org.usfirst.frc.team6329.robot;

import edu.wpi.first.wpilibj.Joystick;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {

	public Joystick Driver;

public OI(){
	
	Driver = new Joystick(0);
}

public Joystick getXbox() {
    return Driver;
}

}
