package org.usfirst.frc.team2412.robot.commands;

import org.usfirst.frc.team2412.robot.RobotMap;

public class DriveCommand extends CommandBase {
	public DriveCommand() {
		requires(driveBaseSubsystem);
	}
	@Override
	protected void execute() {
		driveBaseSubsystem.drive(RobotMap.m_oi.driver);
	}
}
