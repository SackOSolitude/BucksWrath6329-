package org.usfirst.frc.team6329.robot.commands;

import org.usfirst.frc.team6329.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class JoystickDrive extends Command {
	public JoystickDrive() {
	requires(Robot.drivesystem);

}
	protected void initalize () {
	}
	protected void execute() {
		Robot.drivesystem.driveWithJoysticks(Robot.oi.xbox.getRawAxis(1), Robot.oi.xbox.getRawAxis(4));
	}
	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}
}