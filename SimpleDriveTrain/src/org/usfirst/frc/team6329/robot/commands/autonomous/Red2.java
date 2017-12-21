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

import edu.wpi.first.wpilibj.command.CommandGroup;

import org.usfirst.frc.team6329.robot.commands.autonomous.DriveStraight;
import org.usfirst.frc.team6329.robot.Robot;
/*import org.usfirst.frc6329.UglyBuckling.commands.moveGear.EjectGear;
import org.usfirst.frc6329.UglyBuckling.commands.moveGear.HoldGearDown;
import org.usfirst.frc6329.UglyBuckling.commands.moveGear.StoreGear;*/

/**
 *
 */
public class Red2 extends CommandGroup {

    public Red2() {

    	requires(Robot.DriveTrainSubsystem);

   // here 	addParallel(new StoreGear());
    	addSequential(new DriveStraight(0.7,3));
    	addSequential(new DriveStraight(0.5,1.5));
    	addSequential(new DriveStraight(0,1));
 // here      	addParallel(new EjectGear());
    	addSequential(new DriveStraight(0,.5));
 // here   	addParallel(new HoldGearDown());
    	addSequential(new DriveStraight(-0.5,2));
   // here  	addParallel(new StoreGear());
    	addSequential(new DriveStraight(-0.7,2));
    } 
}