package org.usfirst.frc.team6329.robot;

import edu.wpi.first.wpilibj.RobotDrive;


import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {

	public static RobotDrive drive; 
	public static SpeedController driveSystemleftfront;
    public static SpeedController driveSystemleftrear;
    public static SpeedController driveSystemrightfront;
    public static SpeedController driveSystemrightrear;
    public static final int RFSpark = 13;
    public static final int RBSpark = 12;
    public static final int LFSpark = 15;
	public static final int LBSpark = 14;
	
	   public static void init() {
		   driveSystemleftfront = new Spark(3);
	        LiveWindow.addActuator("DriveTrainCommand", "left front ", (Spark) driveSystemleftfront);
	        
	        driveSystemleftrear = new Spark(2);
	        LiveWindow.addActuator("DriveTrainCommand", "left rear", (Spark) driveSystemleftrear);
	        
	        driveSystemrightfront = new Spark(1);
	        LiveWindow.addActuator("DriveTrainCommand", "right front", (Spark) driveSystemrightfront);
	        
	        driveSystemrightrear = new Spark(0);
	        LiveWindow.addActuator("DriveTrainCommand", "right rear", (Spark) driveSystemrightrear);
	        
	    	drive = new RobotDrive(driveSystemleftfront,driveSystemleftrear , driveSystemrightfront, driveSystemrightrear);
	    	
	    	drive.setSafetyEnabled(true);
	        drive.setExpiration(0.1);
	        drive.setSensitivity(0.5);
	        drive.setMaxOutput(1.0);
	   }
}
