package animatefx.animation;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.Node;
import javafx.util.Duration;

public class FadeOut {
    public FadeOut(Node node) {
        FadeOut(node);
    }

    private void FadeOut(Node node) {

        Timeline t =
                new Timeline(
                        new KeyFrame(Duration.millis(0),
                                new KeyValue(node.opacityProperty(), 1)
                        ),
                        new KeyFrame(Duration.millis(1000),
                                new KeyValue(node.opacityProperty(), 0)
                        )

                );
        t.play();
    }
}
