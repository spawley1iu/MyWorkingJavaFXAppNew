// File: src/main/java/org/openjfx/myworkingjavafxapp/SecondaryController.java
package org.openjfx.myworkingjavafxapp;

import java.io.IOException;
import javafx.fxml.FXML;

public class SecondaryController {

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
}
