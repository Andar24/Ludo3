package com.ludoelite;

import com.ludoelite.util.SessionManager;
import com.ludoelite.util.ViewNavigator;
import javafx.application.Application;
import javafx.stage.Stage;

/**
 * Main entry point for the Ludo Elite Desktop Application.
 * Bootstraps the JavaFX runtime and delegates navigation to ViewNavigator.
 */
public class LudoEliteApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Ludo Elite");
        primaryStage.setMinWidth(1100);
        primaryStage.setMinHeight(700);
        primaryStage.setResizable(true);

        // Initialize the navigator with the primary stage
        ViewNavigator.init(primaryStage);

        // DEMO MODE: Skip login and go directly to dashboard
        // TODO: Re-enable authentication when backend is ready
        ViewNavigator.navigateToDashboard();
        
        // Original authentication check (commented for demo):
        // if (SessionManager.getInstance().isLoggedIn()) {
        //     ViewNavigator.navigateToDashboard();
        // } else {
        //     ViewNavigator.navigateToLogin();
        // }

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
