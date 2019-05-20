package org.khanhtrancong.ISP.violation;
public class NormalUser implements IPage{

    @Override
    public String getHomePage() {
        return "HomePage";
    }

    @Override
    public String getProfilePage() {
        return "Profile Page";
    }

    @Override
    public String getReportPage() {
        //Do Nothing because
        return null;
    }

}