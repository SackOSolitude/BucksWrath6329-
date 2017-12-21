// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc.team6329.robot.commands.autonomous;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team6329.robot.Robot;

/**
 *
 */
public class DriveStraight extends Command {

	private double moveSpeed;
	private double runTime;
	private double leftspeed;
	private double rightspeed;
	
    public DriveStraight(double moveSpeed, double runTime) {
        requires(Robot.DriveTrainSubsystem);
        
        this.moveSpeed = moveSpeed;
        this.runTime = runTime;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.gyro.reset();
    	leftspeed = moveSpeed;
    	rightspeed = moveSpeed;
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	// Robot.driveSystem.autoDrive(moveSpeed,moveSpeed);
    	if(Robot.DriveTrainSubsystem.getAngle() > 0) {
    		leftspeed = leftspeed - 0.01;
    	}
    	else if(Robot.DriveTrainSubsystem.getAngle() < 0) {
    		leftspeed = leftspeed + 0.01;
    	}
    	else {
    	}
		Robot.DriveTrainSubsystem.autoDrive(leftspeed, rightspeed);
		Timer.delay(1.0 / 5.0);

    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	
    	return (this.timeSinceInitialized() >= runTime) || Robot.pdp.getTotalDriveTrainAmps() > 40;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.DriveTrainSubsystem.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}