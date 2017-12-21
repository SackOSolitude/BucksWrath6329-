package org.usfirst.frc.team6329.robot.subsystems;

import org.usfirst.frc.team6329.robot.RobotMap;
import org.usfirst.frc.team6329.robot.commands.*;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class Intake extends Subsystem {


    private final SpeedController IntakeESC = RobotMap.Intake;


    public void initDefaultCommand() {
    	setDefaultCommand(new StopIntake());

    }
    public void runIntake() {
    	IntakeESC.set(1);
    }
    
    public void stopIntake() {
    	IntakeESC.set(0);	
    }

    
}
