package org.khanhtrancong.ISP.solution;
public class AdminUser implements IHomePage, IReportPage{

    @Override
    public String getReportPage() {
        return "ReportPage";
    }

    @Override
    public String getHomePage() {
        return "HomePage";
    }

}