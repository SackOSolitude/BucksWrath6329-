package org.usfirst.frc.team6329.robot;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.VictorSP;
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
    public static SpeedController Intake;
    public static SpeedController Shooter;
    public class PDP {
    public static final int RFSpark = 0;	
    public static final int RBSpark = 1;
    public static final int LFSpark = 2;
	public static final int LBSpark = 3;
	public static final int IntakeESC = 4;//don't actually know what is wired to
	public static final int ShooterESC = 5;//don't actually know what this is wired to
    }
	
	   public static void init() {
		   driveSystemleftfront = new VictorSP(2);
	        LiveWindow.addActuator("DriveTrainCommand", "left front ", (VictorSP) driveSystemleftfront);
	        
	        driveSystemleftrear = new VictorSP(3);
	        LiveWindow.addActuator("DriveTrainCommand", "left rear", (VictorSP) driveSystemleftrear);
	        
	        driveSystemrightfront = new VictorSP(0);
	        LiveWindow.addActuator("DriveTrainCommand", "right front", (VictorSP) driveSystemrightfront);
	        
	        driveSystemrightrear = new VictorSP(1);
	        LiveWindow.addActuator("DriveTrainCommand", "right rear", (VictorSP) driveSystemrightrear);
	        
	    	drive = new RobotDrive(driveSystemleftfront,driveSystemleftrear , driveSystemrightfront, driveSystemrightrear);
	    	
	    	drive.setSafetyEnabled(true);
	        drive.setExpiration(0.1);
	        drive.setSensitivity(0.5);
	        drive.setMaxOutput(1.0);
	        
	        Intake = new Talon(4);
	        LiveWindow.addActuator("Intake", "IntakeESC", (VictorSP) Intake);
	        
	        Shooter = new Talon(5);
	        LiveWindow.addActuator("Shooter", "ShooterESC", (VictorSP) Shooter);
	        
	        		
	   }
}
