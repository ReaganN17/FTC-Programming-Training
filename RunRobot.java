package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "Run Robot")
public class RunRobot extends LinearOpMode {

    ArmJoint joint;
    Claw claw;

    public void runOpMode() {
        joint = new ArmJoint(hardwareMap);
        claw = new Claw(hardwareMap);

        waitForStart();

        if (isStopRequested()) return;

        while(opModeIsActive()) {

            if (gamepad1.a) {
                joint.moveUp();
            } else {
                joint.stop();
            }

            if (gamepad1.b) {
                claw.grab();
            } else {
                claw.release();
            }


        }

    }

}
