package com.xiaojinzi.component.cache;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

public class ClassCache {

    private static final Cache<Class, Object> classCache =
            DefaultCacheFactory.INSTANCE.build(CacheType.CLASS_CACHE);

    public static synchronized final void put(@NonNull Class clazz, @Nullable Object o) {
        classCache.put(clazz, o);
    }

    public static synchronized final <T> T get(@NonNull Class clazz) {
        return (T) classCache.get(clazz);
    }

    public static synchronized final <T> T remove(@NonNull Class clazz) {
        return (T) classCache.remove(clazz);
    }

    public static synchronized final void clear() {
        classCache.clear();
    }

}
