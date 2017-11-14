package org.usfirst.frc.team6329.robot.subsystems;

import org.usfirst.frc.team6329.robot.RobotMap;
import org.usfirst.frc.team6329.robot.commands.JoystickDrive;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;


public class DriveSystem extends Subsystem {
	private final RobotDrive robotdrive = RobotMap.driveSystemRobotDrive;
	public double speed;
	public double turn;
	public double x;
	public double y;
	public double centerX;
	double Kp = 0.03;
	public boolean BrownOut;
	public boolean GoForward = true;
	public double leftspeed;
	public double rightspeed;
	// Put methods for controlling this subsystem
	// here. Call these from Commands.

	public void initDefaultCommand() {
		setDefaultCommand(new JoystickDrive());
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
	}
public void driveWithJoysticks(double leftJoystick, double rightJoystick) {
	BrownOut = DriverStation.getInstance().isBrownedOut();
	if (BrownOut == false) {
	  speed = leftJoystick;
	  turn = -rightJoystick;
	}
	else {
		turn = -rightJoystick/1.5;
		speed = leftJoystick/1.5;
	}
	leftspeed = speed + turn;
	rightspeed = speed - turn;
	
	if (GoForward == true) {
		robotdrive.arcadeDrive(-speed, turn);
	}
	if (GoForward == false) {
		robotdrive.arcadeDrive(speed, turn);
	}
}
	public void stop() {
		robotdrive.arcadeDrive(0,0);
	}
	
}

