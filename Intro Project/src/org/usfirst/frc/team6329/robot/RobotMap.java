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
	public static RobotDrive driveSystemRobotDrive;
	public static SpeedController driveSystemleftfront;
    public static SpeedController driveSystemleftrear;
    public static SpeedController driveSystemrightfront;
    public static SpeedController driveSystemrightrear;
    
public static class PDP {
	 public static final int PDP_RIGHT_MOTOR_FRONT = 13;
     public static final int PDP_RIGHT_MOTOR_BACK = 12;
     public static final int PDP_LEFT_MOTOR_FRONT = 15;
     public static final int PDP_LEFT_MOTOR_BACK = 14;
}
public static void init() {
    driveSystemleftfront = new Spark(0);
    LiveWindow.addActuator("Drive System", "left front ", (Spark) driveSystemleftfront);
    
    driveSystemleftrear = new Spark(1);
    LiveWindow.addActuator("Drive System", "left rear", (Spark) driveSystemleftrear);
    
    driveSystemrightfront = new Spark(2);
    LiveWindow.addActuator("Drive System", "right front", (Spark) driveSystemrightfront);
    
    driveSystemrightrear = new Spark(3);
    LiveWindow.addActuator("Drive System", "right rear", (Spark) driveSystemrightrear);
    
    driveSystemRobotDrive = new RobotDrive(driveSystemleftfront, driveSystemleftrear,
          driveSystemrightfront, driveSystemrightrear);
    
    driveSystemRobotDrive.setSafetyEnabled(true);
    driveSystemRobotDrive.setExpiration(0.1);
    driveSystemRobotDrive.setSensitivity(0.5);
    driveSystemRobotDrive.setMaxOutput(1.0);


}

	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;

	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;
}
