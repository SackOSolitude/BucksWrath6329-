

package org.usfirst.frc.team6329.robot.commands.autonomous;

import edu.wpi.first.wpilibj.command.CommandGroup;

import org.usfirst.frc.team6329.robot.commands.autonomous.DriveStraight;
import org.usfirst.frc.team6329.robot.Robot;
//import org.usfirst.frc.team6329.commands.moveGear.EjectGear;
//import org.usfirst.frc.team6329.robot.commands.moveGear.HoldGearDown;
//import org.usfirst.frc6329.UglyBuckling.commands.moveGear.LowerGear;
//import org.usfirst.frc6329.UglyBuckling.commands.moveGear.StoreGear;

/**
 *
 */
public class Blue1 extends CommandGroup {


    public Blue1() {

    	requires(Robot.DriveTrainSubsystem);

   // 	addParallel(new StoreGear());
    	addSequential(new DriveStraight(0.7,2.8));
    	addSequential(new DriveStraight(0,0.5));
    	addSequential(new TurnToAngle(.6, 55));
    	//addParallel( new LowerGear());
    	//addSequential(new DriveStraight(0,1));
    	//addParallel(new HoldGearDown());
    	addSequential(new DriveStraight(0,0.5)); // Delete if vision in use
    	//addSequential(new VisionAlign(.5,3));
    	//addParallel(new StoreGear());
    	//addSequential(new DriveStraight(0,1));
    	addSequential(new DriveStraight(0.7,3.3));
    	addSequential(new DriveStraight(0.5,1));
    	addSequential(new DriveStraight(0,0.5));
    	//addParallel(new EjectGear());
    	addSequential(new DriveStraight(0,1));
    	//addParallel(new HoldGearDown());
    	addSequential(new DriveStraight(-.7,2));
    	// here -addParallel(new StoreGear());
    	addSequential(new DriveStraight(0,1));
    } 
}
