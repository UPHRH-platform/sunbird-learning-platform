package org.sunbird.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import org.sunbird.util.LocalCacheUpdater;
import org.sunbird.learning.router.LearningRequestRouterPool;
import org.sunbird.telemetry.logger.TelemetryManager;


public class InitServlet extends HttpServlet {

    private static final long serialVersionUID = 8162107839763607722L;
    
    
    
    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        // Initialising Request Router Pool
        TelemetryManager.log("Initialising Request Router Pool");
        LearningRequestRouterPool.init();
        TelemetryManager.log("Initialising Local Cache Updater");
        LocalCacheUpdater.init();
    }
}
