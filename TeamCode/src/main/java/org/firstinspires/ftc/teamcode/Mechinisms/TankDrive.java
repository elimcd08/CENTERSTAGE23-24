package org.firstinspires.ftc.teamcode.Mechinisms;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class TankDrive {
    DcMotor leftMotor;
    DcMotor rightMotor;

    public void init(HardwareMap hardwareMap) {
        leftMotor = hardwareMap.get(DcMotor.class, "leftWheelMotor");
        rightMotor = hardwareMap.get(DcMotor.class, "rightWheelMotor");

        leftMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        rightMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
    }

    public void setPowers(float leftPower, float rightPower) {
        leftMotor.setPower((double)leftPower);
        rightMotor.setPower((double)rightPower);
    }
}
