// File: src/main/java/org/openjfx/myworkingjavafxapp/PrimaryController.java
package org.openjfx.myworkingjavafxapp;

import java.io.IOException;
import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
}
