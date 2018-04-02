package tencent.com.chacezesuapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import tencent.com.chacezesuapp.plugin.TestPluginActivity;
import zeus.plugin.ZeusBaseActivity;

public class MainActivity extends ZeusBaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * 插件测试
     *
     * @param view
     */
    public void testPlugin(View view) {
        Intent intent = new Intent(MainActivity.this, TestPluginActivity.class);
        startActivity(intent);
    }

    /**
     * 补丁测试
     *
     * @param view
     */
    public void testHotfix(View view) {
    }

    /**
     * 应用补丁
     *
     * @param view
     */
    public void applyHotfix(View view) {
    }
}
