package org.usfirst.frc.team2412.robot.commands;

public class DriveCommand extends CommandBase {
	public DriveCommand() {
		requires(driveBaseSubsystem);
	}
	@Override
	protected void execute() {
		driveBaseSubsystem.drive(null);
	}
}
