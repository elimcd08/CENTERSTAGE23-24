package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.HardwareMap;

import org.checkerframework.checker.units.qual.C;
import org.firstinspires.ftc.teamcode.Mechinisms.Arm;
import org.firstinspires.ftc.teamcode.Mechinisms.Camera;
import org.firstinspires.ftc.teamcode.Mechinisms.Claw;
import org.firstinspires.ftc.teamcode.Mechinisms.ClawArm;
import org.firstinspires.ftc.teamcode.Mechinisms.Drone;
import org.firstinspires.ftc.teamcode.Mechinisms.MicroPlacer;
import org.firstinspires.ftc.teamcode.Mechinisms.MecanumDrive;
import org.firstinspires.ftc.teamcode.Mechinisms.Placer;
import org.firstinspires.ftc.teamcode.Mechinisms.TankDrive;

public class Robot {
    public MecanumDrive mecanumDrive = new MecanumDrive();
    public MicroPlacer microPlacer = new MicroPlacer();
    public Arm arm = new Arm();
    public Camera camera = new Camera();
    public Drone drone = new Drone();
    public Placer placer = new Placer();
    public Claw claw = new Claw();
    public ClawArm clawArm = new ClawArm();
    public TankDrive tankDrive = new TankDrive();
    public void init(HardwareMap hardwareMap){
       //mecanumDrive.init(hardwareMap);
       //microPlacer.init(hardwareMap);
       //arm.init(hardwareMap);
       //camera.init(hardwareMap);
       //drone.init(hardwareMap);
       //placer.init(hardwareMap);
       claw.init(hardwareMap);
       clawArm.init(hardwareMap);
       tankDrive.init(hardwareMap);
    }
}
