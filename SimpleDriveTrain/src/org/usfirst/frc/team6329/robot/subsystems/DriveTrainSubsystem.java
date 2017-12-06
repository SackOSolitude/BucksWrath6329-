package org.usfirst.frc.team6329.robot.subsystems;

import org.usfirst.frc.team6329.robot.RobotMap;
import org.usfirst.frc.team6329.robot.commands.DriveTrainCommand;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;
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
}

