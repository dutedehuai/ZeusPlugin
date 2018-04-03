package tencent.com.chacezesuapp;

import java.util.HashMap;

import zeus.plugin.PluginManager;
import zeus.plugin.ZeusBaseApplication;

/**
 * Created by chacewang on 18/4/2.
 */

public class MyApplication extends ZeusBaseApplication {
    public static final String PLUGIN_TEST = "zeusplugin_chacetestplugin";

    @Override
    public void onCreate() {
        super.onCreate();
        HashMap<String, Integer> defaultList = new HashMap<>();
        /**
         * apk自带的插件的列表，每次添加内置插件的时候需要添加到这里，格式(pluginName,pluginVersion)
         * pluginVersion一定要与插件中PLUGINWEB_MAINIFEST_FILE文件里的version保持一致。
         * 对于插件还可以使用diff补丁的形式下载增量包，这样可以降低文件下载的大小。
         */
        //补丁必须以EXP_PLUG_HOT_FIX_PREFIX开头
        //插件必须以PluginUtil.EXP_PLUG_PREFIX开头，否则不会识别为插件
//        defaultList.put(PLUGIN_TEST, 1);
        PluginManager.init(this, defaultList);
    }
}
