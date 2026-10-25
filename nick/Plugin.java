package nick;

import java.lang.reflect.Field;
import net.fabricmc.loader.api.entrypoint.PreLaunchEntrypoint;
import nick.MioClassLoader;

public final class Plugin
implements PreLaunchEntrypoint {
    public void onPreLaunch() {
    }

    static {
        try {
            ClassLoader loader = Plugin.class.getClassLoader();
            Field _delegate = loader.getClass().getDeclaredField("delegate");
            _delegate.setAccessible(true);
            Object delegate = _delegate.get(loader);
            Field _original = loader.getClass().getDeclaredField("originalLoader");
            _original.setAccessible(true);
            ClassLoader original = (ClassLoader)_original.get(loader);
            Field _parent = delegate.getClass().getDeclaredField("parentClassLoader");
            _parent.setAccessible(true);
            ClassLoader parent = (ClassLoader)_parent.get(delegate);
            MioClassLoader mio = new MioClassLoader(parent, original);
            _original.set(loader, mio);
            _parent.set(delegate, mio);
        } catch (Throwable _t) {
            _t.printStackTrace(System.err);
        }
    }
}

