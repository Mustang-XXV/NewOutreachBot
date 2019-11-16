package org.usfirst.frc.team2412.robot.subsystems;

import org.usfirst.frc.team2412.robot.RobotMap;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.MecanumDrive;

public class DriveBaseSubsystem extends Subsystem{
	public MecanumDrive driving = RobotMap.driving;
	@Override
	protected void initDefaultCommand() {
		
		
	}
	
	public void drive(Joystick stick) {
		driving.driveCartesian(-stick.getY(), stick.getX(), stick.getTwist());
	}
	
}
