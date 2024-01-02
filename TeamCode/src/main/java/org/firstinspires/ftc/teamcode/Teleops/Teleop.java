package org.firstinspires.ftc.teamcode.Teleops;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Gamepad;

import org.firstinspires.ftc.teamcode.Robot;

@TeleOp
public class Teleop extends OpMode {
    Robot robot = new Robot();

    double turn;

    @Override
    public void init() {
        robot.init(hardwareMap);

    }

    @Override
    public void loop() {
        robot.tankDrive.setPowers(gamepad1.left_stick_y, gamepad1.right_stick_y);
        robot.clawArm.move(gamepad2.left_stick_y);
        robot.claw.move(gamepad2.left_stick_x);
    }
}
