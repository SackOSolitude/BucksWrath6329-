package org.usfirst.frc.team6329.robot.subsystems;

//import org.usfirst.frc.team6329.robot.constants;
import org.usfirst.frc.team6329.robot.Robot;
import org.usfirst.frc.team6329.robot.RobotMap;
import org.usfirst.frc.team6329.robot.commands.DriveTrainCommand;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;
/**
 *
 */
public class DriveTrainSubsystem extends Subsystem {
	
	public final RobotDrive drive = RobotMap.drive;
	public double speed;
    public double turn;
    public boolean BrownOut;
    public double leftspeed;
	public double rightspeed;

	public void initDefaultCommand() {
    	setDefaultCommand(new DriveTrainCommand());
    	
	}
	
    public void DriveWithJoysticks(double leftJoystick, double rightJoystick) {
    	
        BrownOut = DriverStation.getInstance().isBrownedOut();
        
    	if (BrownOut == false) {
        	speed = leftJoystick;
        	turn = -rightJoystick;
   			}
    	else {
    		turn = -rightJoystick/1.5;
    		speed = leftJoystick/1.5;
    	}
    	/*if (Robot.pdp.getRightFrontAmps() > 15 && Robot.pdp.getRightFrontAmps() < 80 || // Test 
    			Robot.pdp.getLeftFrontAmps() > 15 && Robot.pdp.getLeftFrontAmps() < 80 || 
    			Robot.pdp.getRightBackAmps() > 15 && Robot.pdp.getRightBackAmps() < 80 || 
    			Robot.pdp.getLeftBackAmps() > 15 && Robot.pdp.getLeftBackAmps() < 80 )
    			{ 			
    		turn = -rightJoystick/2;
    		speed = leftJoystick/2;	
    	}*/
    	
    	if (Robot.pdp.getRightFrontAmps() > 60 && Robot.pdp.getRightFrontAmps() < 80 || // 40 not 15 
    			Robot.pdp.getLeftFrontAmps() > 60 && Robot.pdp.getLeftFrontAmps() < 80 || 
    			Robot.pdp.getRightBackAmps() > 60 && Robot.pdp.getRightBackAmps() < 80 || 
    			Robot.pdp.getLeftBackAmps() > 60 && Robot.pdp.getLeftBackAmps() < 80 )
    			{ 			
    		turn = -rightJoystick/1.25;
    		speed = leftJoystick/1.25;	// 1.5 
    	}

    	else if (Robot.pdp.getRightFrontAmps() > 80 && Robot.pdp.getRightFrontAmps() < 100 || 
    			Robot.pdp.getLeftFrontAmps() > 80 && Robot.pdp.getLeftFrontAmps() < 100 || 
    			Robot.pdp.getRightBackAmps() > 80 && Robot.pdp.getRightBackAmps() < 100 || 
    			Robot.pdp.getLeftBackAmps() > 80 && Robot.pdp.getLeftBackAmps() < 100 ){
    		turn = -rightJoystick/1.5;
    		speed = leftJoystick/1.5;	

    	}
    	
    else if (Robot.pdp.getRightFrontAmps() > 100  || 
			Robot.pdp.getLeftFrontAmps() > 100  || 
			Robot.pdp.getRightBackAmps() > 100  || 
			Robot.pdp.getLeftBackAmps() > 100 ) {
    
    	turn = -rightJoystick/2;
		speed = leftJoystick/2;
    }
    	drive.arcadeDrive(-leftJoystick, -rightJoystick);
    	
}
    	
    
    public void stop() {
    	drive.arcadeDrive(0, 0);
    }
}

