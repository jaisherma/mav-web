package net.serenitybdd.screenplay.jenkins.user_interface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.jenkins.targets.Checkbox;
import net.serenitybdd.screenplay.jenkins.targets.Setting;
import net.serenitybdd.screenplay.targets.Target;

public class ViewConfigurationPage {
    public static final Target Status_Filter                    = Setting.defining("Status Filter");
    public static final Target Recurse_In_Subfolders            = Target.the("the 'Recurse in subfolders' option").locatedBy("#recurse");
    public static final Target Use_Regular_Expression           = Checkbox.withLabel("Use a regular expression to include jobs into the view");
    public static final Target Regular_Expression               = Target.the("the 'Regular expression' field").located(By.name("includeRegex"));
    public static final Target Enable_Show_Badges               = Target.the("the 'Enable Show badges' option").locatedBy("#showBadges");
    public static final Target Display_Badges                   = Target.the("the 'Display badges' field").located(By.name("displayBadges"));
    public static final Target Display_Badges_From              = Target.the("the 'Display badges from' field").located(By.name("displayBadgesFrom"));
    public static final Target Display_JUnit_Realtime_Progress  = Target.the("the 'Display JUnit Realtime progress' option").locatedBy("#displayJUnitProgress");
}