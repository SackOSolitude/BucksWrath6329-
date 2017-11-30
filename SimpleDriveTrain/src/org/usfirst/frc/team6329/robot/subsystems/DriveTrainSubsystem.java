package org.usfirst.frc.team6329.robot.subsystems;

import org.usfirst.frc.team6329.robot.RobotMap;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
/**
 *
 */
public class DriveTrainSubsystem extends Subsystem {
	CANTalon LFMotor, RFMotor, RBMotor, LBMotor;
	RobotDrive drive;
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public DriveTrainSubsystem() {
    	LFMotor = new CANTalon(RobotMap.LFTalon);
    	RFMotor = new CANTalon(RobotMap.RFTalon);
    	RBMotor = new CANTalon(RobotMap.RBTalon);
    	LBMotor = NEW CANTalon(RobotMap.LBTalon);
    	
    	drive = new RobotDrive(LFMotor, LBMotor, RFMotor, RBMotor);
    	
    	
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void arcadeDrive(double x, double y) {
    	drive.arcadeDrive(x, y);
    }
    public void initDefaultCommand() {
    	setDefaultCommand(newDriveTrainCommand());
    }
}

