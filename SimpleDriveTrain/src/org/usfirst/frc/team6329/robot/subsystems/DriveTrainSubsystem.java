package org.usfirst.frc.team6329.robot.subsystems;

import org.usfirst.frc.team6329.robot.RobotMap;
import org.usfirst.frc.team6329.robot.commands.DriveTrainCommand;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;
/**
 *
 */
public class DriveTrainSubsystem extends Subsystem {
	Spark LFMotor, RFMotor, RBMotor, LBMotor;
	RobotDrive drive;
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public DriveTrainSubsystem() {
    	LFMotor = new Spark(RobotMap.LFSpark);
    	RFMotor = new Spark(RobotMap.RFSpark);
    	RBMotor = new Spark(RobotMap.RBSpark);
    	LBMotor = new Spark(RobotMap.LBSpark);
    	
    	drive = new RobotDrive(LFMotor, LBMotor, RFMotor, RBMotor);
    	
    	
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void arcadeDrive(double x, double y) {
    	drive.arcadeDrive(x, y);
    }
    public void initDefaultCommand() {
    	setDefaultCommand(new DriveTrainCommand());
    }
}

