package animatefx.animation;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.Node;
import javafx.util.Duration;

public class FadeIn {

    public FadeIn(Node node) {
        FadeIn(node);
    }

    private void FadeIn(Node node) {

        Timeline t =
                new Timeline(
                        new KeyFrame(Duration.millis(0),
                                new KeyValue(node.opacityProperty(), 0)
                        ),
                        new KeyFrame(Duration.millis(1000),
                                new KeyValue(node.opacityProperty(), 1)
                        )

                );
        t.play();
    }
}
