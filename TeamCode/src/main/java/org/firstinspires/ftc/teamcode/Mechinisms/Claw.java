package org.firstinspires.ftc.teamcode.Mechinisms;

import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Claw {
    CRServo clawServo;

    public void init(HardwareMap hardwareMap) {
        clawServo = hardwareMap.get(CRServo.class, "clawServo");
    }

    public void move(float change){
        clawServo.setPower((double)change);
    }
}
