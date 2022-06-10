package com.androidstudioetec.notepad.ui.main;

import android.content.Context;

import java.util.Collection;
import java.util.Dictionary;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SharedPreferences {
    private Context context;
    private android.content.SharedPreferences preferences;
    private android.content.SharedPreferences.Editor editor;

    private final String NOME_ARQUIVO = "anotacao.preferencias";
    private final String CHAVE_NOME = "nome";

    public SharedPreferences(Context c, String filename) {
        this.context = c;
        preferences = context.getSharedPreferences(filename,0);
        editor = preferences.edit();
    }

    public Map<String, ?> getAll() { return preferences.getAll(); }

    public String getString(String key) { return preferences.getString(key, ""); }
    public Set<String> getStringSet(String key) { return preferences.getStringSet(key, new HashSet<String>()); }
    public Integer getInt(String key) { return preferences.getInt(key, 0); }
    public Float getFloat(String key) { return preferences.getFloat(key, 0); }
    public Long getLong(String key) { return preferences.getLong(key, 0); }
    public Boolean getBoolean(String key) { return preferences.getBoolean(key, false); }

    public void set(String key, Object value) {
        if (value instanceof String) { editor.putString(key, (String) value); }
        else if (value instanceof Set) { editor.putStringSet(key, (Set) value); }
        else if (value instanceof Integer) { editor.putInt(key, (Integer) value); }
        else if (value instanceof Float) { editor.putFloat(key, (Float) value); }
        else if (value instanceof Long) { editor.putLong(key, (Long) value); }
        else if (value instanceof Boolean) { editor.putBoolean(key, (Boolean) value); }
        editor.commit();
    }
}
