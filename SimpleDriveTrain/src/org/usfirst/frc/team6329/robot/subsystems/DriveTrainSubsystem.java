package org.usfirst.frc.team6329.robot.subsystems;

import org.usfirst.frc.team6329.robot.RobotMap;
import org.usfirst.frc.team6329.robot.commands.DriveTrainCommand;
import org.usfirst.frc.team6329.robot.Robot;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
/**
 *
 */
public class DriveTrainSubsystem extends Subsystem {
	
	public final RobotDrive drive = RobotMap.drive;

	public void initDefaultCommand() {
    	setDefaultCommand(new DriveTrainCommand());
	}
	
    public void DriveWithJoysticks(double leftJoystick, double rightJoystick) {
    	drive.arcadeDrive(leftJoystick, rightJoystick); 
    }
    
    public void stop() {
    	drive.arcadeDrive(0, 0);
    }

public void autoDrive(double left, double right) {
	Robot.DriveTrainSubsystem.drive.tankDrive(left, right);
}

public double getAngle() {
	return Robot.gyro.getAngle();
}

public double getAcceleration() {

	return Robot.gyro.getRate();
}
/*public double getCenterX() {
	return table.getNumber("centerX", 0);
} */


public void updateDashboard() {
	SmartDashboard.putNumber("Gyro Rate", ( (int)getAcceleration()));
	SmartDashboard.putNumber("Gyro Angle", ( (int)getAngle()));
	// SmartDashboard.putNumber("CenterX", ( (int)getCenterX()));

}

}

