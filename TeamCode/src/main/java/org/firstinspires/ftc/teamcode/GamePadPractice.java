package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;


@Disabled
@TeleOp
public class GamePadPractice extends OpMode {

    }
    @Override
    public void loop(){

        double differenceBetweenJoysticks = gamepad1.right_stick_x - gamepad1.left_stick_x;
        double sumInRear = gamepad1.left_trigger - gamepad1.right_trigger;  
        double speedForward = -gamepad1.left_stick_y; //  Use divide to change the drive power

        telemetry.addData("x Right", gamepad1.right_stick_x);
        telemetry.addData("y Right", gamepad1.right_stick_y);
        telemetry.addData("x Left", gamepad1.left_stick_x);
        telemetry.addData("y Left", speedForward );
        telemetry.addData("a Button", gamepad1.a);
        telemetry.addData("B buttom", gamepad1.b);
        telemetry.addData("Differance is" , differenceBetweenJoysticks );
        telemetry.addData("The sum is" , sumInRear );
    }
}
