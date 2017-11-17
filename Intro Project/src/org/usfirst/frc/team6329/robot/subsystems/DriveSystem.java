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
	public boolean BrownOut;
	public double rightFront;
	public double leftFront;
	public double leftBack;
	public double rightBack;
	public double dividerRightFront = 0.25;
	public double dividerLeftFront = 0.25;
	public double dividerRightBack = 0.25;
	public double dividerLeftBack = 0.25;
	public double totalDivider;
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
	
	rightFront = org.usfirst.frc.team6329.robot.Robot.pdp.getRightFrontAmps();
	leftFront = org.usfirst.frc.team6329.robot.Robot.pdp.getLeftFrontAmps();
	rightBack =  org.usfirst.frc.team6329.robot.Robot.pdp.getRightBackAmps();
	leftBack =  org.usfirst.frc.team6329.robot.Robot.pdp.getLeftBackAmps();
	
	while (rightFront + leftFront + rightBack + leftBack < 160) {	
		totalDivider = 1;
	}
			
	if(rightFront>40) {
		dividerRightFront = dividerRightFront + 0.05;
	}
	
	if(leftFront>40) {
		dividerLeftFront = 	dividerLeftFront + 0.05;
	}
	
	if(rightBack>40) {
		dividerRightBack = dividerRightBack + 0.05;
	}
	
	if(leftBack>40) {
		dividerLeftBack = dividerLeftBack + 0.05;
	}
	
	
	totalDivider = dividerRightFront + dividerLeftFront + dividerRightBack + dividerLeftBack;
	
	if (BrownOut == false) {
	  speed = leftJoystick;
	  turn = -rightJoystick;
	  totalDivider = 1;
	}
	else {
		turn = -rightJoystick/totalDivider;
		speed = leftJoystick/totalDivider;
	}
	//leftspeed = speed + turn;
	//rightspeed = speed - turn;
	
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

