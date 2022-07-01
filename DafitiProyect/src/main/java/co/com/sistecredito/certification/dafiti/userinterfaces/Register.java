package co.com.sistecredito.certification.dafiti.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Register {

    public static final Target BTN_MEN = Target.the("Button continue enter")
            .locatedForAndroid(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button"))
            .locatedForIOS(By.xpath(""));
    public static final Target BTN_NEW = Target.the("Button continue enter")
            .locatedForAndroid(By.xpath("//android.widget.TextView[@content-desc=\"Dafiti\"]"))
            .locatedForIOS(By.xpath(""));
    public static final Target BTN_PAIS = Target.the("Button continue enter")
            .locatedForAndroid(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[2]/android.widget.ImageView\n"))
            .locatedForIOS(By.xpath(""));
    public static final Target BTN_HOMBRE = Target.the("Button continue enter")
            .locatedForAndroid(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ImageView"))
            .locatedForIOS(By.xpath(""));



}
