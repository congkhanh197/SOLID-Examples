package org.khanhtrancong.ISP.violation;

public class AdminUser implements IPage{

    @Override
    public String getHomePage() {
        return "HomePage";
    }

    @Override
    public String getProfilePage() {
        return "ProfilePage";
    }

    @Override
    public String getReportPage() {
        return "ReportPage";
    }
    
}