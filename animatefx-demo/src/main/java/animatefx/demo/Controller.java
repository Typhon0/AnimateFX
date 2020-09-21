package animatefx.demo;

import animatefx.animation.*;
import animatefx.util.ParallelAnimationFX;
import animatefx.util.SequentialAnimationFX;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.util.Duration;

public class Controller {

    @FXML
    Label text;

    @FXML
    public void handleClick(ActionEvent actionEvent) {

        Button button = (Button) actionEvent.getSource();
        String s = button.getText();
        switch (s) {
            /*Attention seekers**/
            case "Bounce":
                new Bounce(text).play();
                break;
            case "Flash":
                new Flash(text).play();

                break;
            case "Pulse":
                new Pulse(text).play();

                break;
            case "RubberBand":
                new RubberBand(text).play();

                break;
            case "Shake":
                new Shake(text).play();

                break;
            case "Swing":
                new Swing(text).play();

                break;
            case "Tada":
                new Tada(text).play();

                break;
            case "Wobble":
                new Wobble(text).play();

                break;
            case "Jello":
                new Jello(text).play();

                /*Bounce Entrances**/
                break;
            case "BounceIn":
                new BounceIn(text).play();

                break;
            case "BounceInDown":
                new BounceInDown(text).play();

                break;
            case "BounceInLeft":
                new BounceInLeft(text).play();

                break;
            case "BounceInRight":
                new BounceInRight(text).play();

                break;
            case "BounceInUp":
                new BounceInUp(text).play();

                /*Bouncing exits**/
                break;
            case "BounceOut":
                new BounceOut(text).setResetOnFinished(true).play();

                break;
            case "BounceOutDown":
                new BounceOutDown(text).setResetOnFinished(true).play();

                break;
            case "BounceOutLeft":
                new BounceOutLeft(text).setResetOnFinished(true).play();

                break;
            case "BounceOutRight":
                new BounceOutRight(text).setResetOnFinished(true).play();

                break;
            case "BounceOutUp":
                new BounceOutUp(text).setResetOnFinished(true).play();

                /*Fading entrances**/
                break;
            case "FadeIn":
                new FadeIn(text).play();

                break;
            case "FadeInDown":
                new FadeInDown(text).play();

                break;
            case "FadeInDownBig":
                new FadeInDownBig(text).play();

                break;
            case "FadeInLeft":
                new FadeInLeft(text).play();

                break;
            case "FadeInLeftBig":
                new FadeInLeftBig(text).play();

                break;
            case "FadeInRight":
                new FadeInRight(text).play();

                break;
            case "FadeInRightBig":
                new FadeInRightBig(text).play();

                break;
            case "FadeInUp":
                new FadeInUp(text).play();

                break;
            case "FadeInUpBig":
                new FadeInUpBig(text).play();


                /*Fading exits**/
                break;
            case "FadeOut":
                new FadeOut(text).setResetOnFinished(true).play();

                break;
            case "FadeOutDown":
                new FadeOutDown(text).setResetOnFinished(true).play();

                break;
            case "FadeOutDownBig":
                new FadeOutDownBig(text).setResetOnFinished(true).play();

                break;
            case "FadeOutLeft":
                new FadeOutLeft(text).setResetOnFinished(true).play();

                break;
            case "FadeOutLeftBig":
                new FadeOutLeftBig(text).setResetOnFinished(true).play();

                break;
            case "FadeOutRight":
                new FadeOutRight(text).setResetOnFinished(true).play();

                break;
            case "FadeOutRightBig":
                new FadeOutRightBig(text).setResetOnFinished(true).play();

                break;
            case "FadeOutUp":
                new FadeOutUp(text).setResetOnFinished(true).play();

                break;
            case "FadeOutUpBig":
                new FadeOutUpBig(text).setResetOnFinished(true).play();

                /*Flipeprs**/
                break;
            case "Flip":
                new Flip(text).play();

                break;
            case "FlipInX":
                new FlipInX(text).play();

                break;
            case "FlipInY":
                new FlipInY(text).play();

                break;
            case "FlipOutX":
                new FlipOutX(text).setResetOnFinished(true).play();

                break;
            case "FlipOutY":
                new FlipOutY(text).setResetOnFinished(true).play();


                /*LightSpeed**/
                break;
            case "LightSpeedIn":
                new LightSpeedIn(text).play();

                break;
            case "LightSpeedOut":
                new LightSpeedOut(text).setResetOnFinished(true).play();

                /*Rotating entrances**/
                break;
            case "RotateIn":
                new RotateIn(text).play();

                break;
            case "RotateInDownLeft":
                new RotateInDownLeft(text).play();

                break;
            case "RotateInDownRight":
                new RotateInDownRight(text).play();

                break;
            case "RotateInUpLeft":
                new RotateInUpLeft(text).play();

                break;
            case "RotateInUpRight":
                new RotateInUpRight(text).play();


                /*Rotating exits**/
                break;
            case "RotateOut":
                new RotateOut(text).setResetOnFinished(true).play();

                break;
            case "RotateOutDownLeft":
                new RotateOutDownLeft(text).setResetOnFinished(true).play();

                break;
            case "RotateOutDownRight":
                new RotateOutDownRight(text).setResetOnFinished(true).play();

                break;
            case "RotateOutUpLeft":
                new RotateOutUpLeft(text).setResetOnFinished(true).play();

                break;
            case "RotateOutUpRight":
                new RotateOutUpRight(text).setResetOnFinished(true).play();

                /*Sliding entrances**/
                break;
            case "SlideInUp":
                new SlideInUp(text).play();

                break;
            case "SlideInDown":
                new SlideInDown(text).play();

                break;
            case "SlideInLeft":
                new SlideInLeft(text).play();

                break;
            case "SlideInRight":
                new SlideInRight(text).play();


                /*Sliding exits**/
                break;
            case "SlideOutUp":
                new SlideOutUp(text).setResetOnFinished(true).play();

                break;
            case "SlideOutDown":
                new SlideOutDown(text).setResetOnFinished(true).play();

                break;
            case "SlideOutLeft":
                new SlideOutLeft(text).setResetOnFinished(true).play();

                break;
            case "SlideOutRight":
                new SlideOutRight(text).setResetOnFinished(true).play();


                /*Zoom entrances**/
                break;
            case "ZoomIn":
                new ZoomIn(text).play();

                break;
            case "ZoomInDown":
                new ZoomInDown(text).play();

                break;
            case "ZoomInLeft":
                new ZoomInLeft(text).play();

                break;
            case "ZoomInRight":
                new ZoomInRight(text).play();

                break;
            case "ZoomInUp":
                new ZoomInUp(text).play();


                /*Zoom exits**/
                break;
            case "ZoomOut":
                new ZoomOut(text).setResetOnFinished(true).play();

                break;
            case "ZoomOutDown":
                new ZoomOutDown(text).setResetOnFinished(true).play();

                break;
            case "ZoomOutLeft":
                new ZoomOutLeft(text).setResetOnFinished(true).play();

                break;
            case "ZoomOutRight":
                new ZoomOutRight(text).setResetOnFinished(true).play();

                break;
            case "ZoomOutUp":
                new ZoomOutUp(text).setResetOnFinished(true).play();


                /*Specials*/
                break;
            case "Hinge":
                new Hinge(text).setResetOnFinished(true).play();

                break;
            case "JackInTheBox":
                new JackInTheBox(text).play();

                break;
            case "RollIn":
                new RollIn(text).play();

                break;
            case "RollOut":
                new RollOut(text).setResetOnFinished(true).play();

                /* Colors */
                break;
            case "TextGlow":
                new GlowText(text, Color.ORANGE, Color.ORANGERED)
                        .setCycleCount(3)
                        .setSpeed(0.5)
                        .setResetOnFinished(true)
                        .play();
                break;
            case "BackgroundGlow":

                new GlowBackground(text, Color.WHITE, Color.YELLOW, 20)
                        .setDelay(Duration.millis(500))
                        .setCycleCount(3)
                        .setResetOnFinished(true)
                        .play();

                break;
            case "SequentialAnimation":
                SequentialAnimationFX sequentialAnimationFX = new SequentialAnimationFX(text, new BounceIn(), new Flash());
                sequentialAnimationFX.setResetOnFinished(true);
                sequentialAnimationFX.play();
                break;
            case "ParallelAnimation":
                ParallelAnimationFX parallelAnimationFX = new ParallelAnimationFX(text, new BounceIn(), new Flash());
                parallelAnimationFX.play();
                break;
            default:
                System.err.println("No animation binded to this button");
                break;
        }

    }

}
