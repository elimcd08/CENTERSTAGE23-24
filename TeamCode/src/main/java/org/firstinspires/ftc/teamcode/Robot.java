package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.mechanisms.AutoDrive;
import org.firstinspires.ftc.teamcode.mechanisms.Intake;
import org.firstinspires.ftc.teamcode.mechanisms.MecanumDrive;

public class Robot {
    public MecanumDrive mecanumDrive = new MecanumDrive();
    public Intake intake = new Intake();
    public AutoDrive auto = new AutoDrive();

    public void init(HardwareMap hardwareMap){
       mecanumDrive.init(hardwareMap);
       intake.init(hardwareMap);
       auto.init(hardwareMap);

    }
}