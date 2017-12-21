
package org.usfirst.frc.team6329.robot;

import org.usfirst.frc.team6329.robot.subsystems.DriveTrainSubsystem;
import org.usfirst.frc.team6329.robot.subsystems.Intake;
import org.usfirst.frc.team6329.robot.subsystems.Shooter;

import edu.wpi.cscore.UsbCamera;
import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.networktables.NetworkTable;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {

	Command autonomousCommand;
	SendableChooser<Command> chooser = new SendableChooser<>();
	
	public static OI oi;
	

    public static Robot robot;
    public static DriveTrainSubsystem DriveTrainSubsystem;
    public static NetworkTable table;
    public static UsbCamera Camera;
    public static PDP pdp;
    public static ADXRS450_Gyro gyro;
    public static Intake Intake;
    public static Shooter Shooter;

	/**
	 * This function is run when the robot is first started up and should be
	 * used for any initialization code.
	 */
	@Override
	public void robotInit() {
		
		robot = this;
		pdp = new PDP();
		gyro = new ADXRS450_Gyro();
    	RobotMap.init();

		
		
		// chooser.addObject("My Auto", new MyAutoCommand());
		SmartDashboard.putData("Auto mode", chooser);
		
		
		UsbCamera Camera = CameraServer.getInstance().startAutomaticCapture("Bob", 0);
		Camera.setResolution(160, 120);
		Camera.setFPS(15);
		
		DriveTrainSubsystem = new DriveTrainSubsystem();
		
		oi = new OI();
	}

	/**
	 * This function is called once each time the robot enters Disabled mode.
	 * You can use it to reset any subsystem information you want to clear when
	 * the robot is disabled.
	 */
	@Override
	public void disabledInit() {
        Scheduler.getInstance().run();

	}

	@Override
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
		   pdp.updateDashboard();
	}

	/**
	 * This autonomous (along with the chooser code above) shows how to select
	 * between different autonomous modes using the dashboard. The sendable
	 * chooser code works with the Java SmartDashboard. If you prefer the
	 * LabVIEW Dashboard, remove all of the chooser code and uncomment the
	 * getString code to get the auto name from the text box below the Gyro
	 *
	 * You can add additional auto modes by adding additional commands to the
	 * chooser code above (like the commented example) or additional comparisons
	 * to the switch structure below with additional strings & commands.
	 */
	@Override
	public void autonomousInit() {
		String autoSelected = SmartDashboard.getString("Auto Selector", "Default");
   	    switch(autoSelected) { 
   	 		//case "Default Auto": default : autonomousCommand = new Red2();
   	 		//break; 
   	 		//case "Red 2" : autonomousCommand = new Red2();
   	 		//break;
   	 		//case "Red 1" : autonomousCommand = new Red1();
   	 		//break;
   	 		//case "Red 3" : autonomousCommand = new Red3();
   	 		//break;
   	 		//case "Blue 1" : autonomousCommand = new Blue1();
   	 		//break;
   	 		//case "Blue 2" : autonomousCommand = new Blue2();
   	 		//break;
   	 		//case "Blue 3" : autonomousCommand = new Blue3();
   	 		//break;
   	 		//case "Gyro Test" : autonomousCommand = new GyroTest();
   	 		//break;
   	 		//case "Vision Test" : autonomousCommand = new VisionTest();
   	 		//break;
   	   }
   	 
       if (autonomousCommand != null) autonomousCommand.start();
	}

	/**
	 * This function is called periodically during autonomous
	 */
	@Override
	public void autonomousPeriodic() {
		Scheduler.getInstance().run();
		   pdp.updateDashboard();
	}

	@Override
	public void teleopInit() {
        if (autonomousCommand != null) autonomousCommand.cancel();
	}

	/**
	 * This function is called periodically during operator control
	 */
	@Override
	public void teleopPeriodic() {
		Scheduler.getInstance().run();
		   pdp.updateDashboard();
	}

	/**
	 * This function is called periodically during test mode
	 */
	@Override
	public void testPeriodic() {
		LiveWindow.run();
		   pdp.updateDashboard();
	}
}
