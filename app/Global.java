
import cn.bran.play.GlobalSettingsWithJapid;


/**
 * @author Kyel John David
 */
public class Global extends GlobalSettingsWithJapid{

    private static final String JAPID_TEMPLATE_ROOT = "japidroot";

    @Override
    public void onStartJapid() {
        setTemplateRoot(JAPID_TEMPLATE_ROOT);
        setLogVerbose(true);
        setKeepJavaFiles(false);
    }
}
