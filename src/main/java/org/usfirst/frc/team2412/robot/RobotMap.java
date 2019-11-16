package org.usfirst.frc.team2412.robot;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.drive.MecanumDrive;

public class RobotMap {
	
	//---------------------------------------------
	public static int frontRightMotorID = 1;
	public static int backRightMotorID = 2;
	public static int frontLeftMotorID = 3;
	public static int backLeftMotorID = 4;
	//---------------------------------------------
	
	public static WPI_TalonSRX frontRightMotor = new WPI_TalonSRX(frontRightMotorID);
	public static WPI_TalonSRX backRightMotor = new WPI_TalonSRX(backRightMotorID);
	public static WPI_TalonSRX frontLeftMotor = new WPI_TalonSRX(frontLeftMotorID);
	public static WPI_TalonSRX backLeftMotor = new WPI_TalonSRX(backLeftMotorID);
	public static MecanumDrive driving = new MecanumDrive(frontRightMotor, backRightMotor, frontLeftMotor, backLeftMotor);
	
}
