package org.usfirst.frc.team6329.robot.subsystems;

import org.usfirst.frc.team6329.robot.RobotMap;
import org.usfirst.frc.team6329.robot.commands.StopShooter;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class Shooter extends Subsystem {


    private final SpeedController ShooterESC = RobotMap.Shooter;


    public void initDefaultCommand() {
    	setDefaultCommand(new StopShooter());

    }
    public void runShooter() {
    	ShooterESC.set(1);
    }
    
    public void stopShooter() {
    	ShooterESC.set(0);	
    }

    
}
