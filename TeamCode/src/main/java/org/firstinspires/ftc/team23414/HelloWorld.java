package org.firstinspires.ftc.team23414;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp()

public class HelloWorld extends OpMode {



    private int number = 1;
    private DriveTraintg DriveMove = null;

    @Override
    public void init() {
        telemetry.addData("Hello","World");
        DriveMove = new DriveTraintg(hardwareMap.get(DcMotor.class, "left_front_drive"),
                                    hardwareMap.get(DcMotor.class, "right_front_drive"),
                                    hardwareMap.get(DcMotor.class, "left_back_drive"),
                                    hardwareMap.get(DcMotor.class, "right_back_drive"));
    }
    @Override
    public void loop() {
        telemetry.addData("Hello","Universe" + number );
        number += 1;
        DriveMove.moveDrive(gamepad1.left_stick_y,-gamepad1.right_stick_y);
    }
}
