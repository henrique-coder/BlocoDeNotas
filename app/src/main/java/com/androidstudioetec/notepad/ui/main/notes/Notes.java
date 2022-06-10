package com.androidstudioetec.notepad.ui.main.notes;

import android.graphics.Color;
import android.R.color;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class Notes {

    /**
     * An array of sample (placeholder) items.
     */
    public static final List<NoteItem> ITEMS = new ArrayList<NoteItem>();

    /**
     * A map of sample (placeholder) items, by ID.
     */
    public static final Map<String, NoteItem> ITEM_MAP = new HashMap<String, NoteItem>();

    static {
        // Add some sample items.
        add(createItem("Teste 1", "lorem ipsum testado", 0, null));
        add(createItem("Nota 2", "lorem ipsum teste", 1, null));
        add(createItem("asdasdsad", "lorem ipsum sadsadas", 2, null));
        add(createItem("UwU", "lorem ipsum uwuwuwu", 3, null));
    }

    public static void add(NoteItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.title, item);
    }

    public static NoteItem get(Integer position) {
        return ITEMS.get(position);
    }

    private static NoteItem createItem(String title, String text, Integer position, Color background_color) {
        if (background_color == null) {
        }
        return new NoteItem(title, text, position, background_color);
    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }

    /**
     * A placeholder item representing a piece of content.
     */
    public static class NoteItem {
        public final String title;
        public final String text;
        public final Integer position;
        public final Color background_color;

        public NoteItem(String title, String text, Integer position, Color background_color) {
            this.title = title;
            this.text = text;
            this.position = position;
            this.background_color = background_color;
        }

        @Override
        public String toString() {
            return title;
        }
    }
}