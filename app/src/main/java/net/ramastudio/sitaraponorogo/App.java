package net.ramastudio.sitaraponorogo;

import android.app.Application;

import net.ramastudio.sitaraponorogo.utils.Pref;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Pref.init(this);
    }
}
