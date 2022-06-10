package com.androidstudioetec.notepad.ui.main;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.androidstudioetec.notepad.R;
import com.androidstudioetec.notepad.ui.main.notes.NoteItemEditorFragment;
import com.androidstudioetec.notepad.ui.main.notes.NoteListFragment;
import com.androidstudioetec.notepad.ui.main.notes.Notes;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.List;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.tab_text_1, R.string.tab_text_2, R.string.tab_text_3, R.string.tab_text_4};
    private final Context mContext;
    private Notes app_notes;
    private Integer app_selected_note_id;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
        app_notes = new Notes();
        app_selected_note_id = 0;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        List<Dictionary<Integer, String>> notes = new ArrayList<Dictionary<Integer, String>>();
        switch (position) {
            case 0:
                fragment = new NoteListFragment().newInstance(1);
                System.out.println(position);
                break;
            case 1:
                fragment = new NoteItemEditorFragment().newInstance(app_selected_note_id, app_notes);
                System.out.println(position);
                break;
            case 2:
                fragment = new SettingsFragment().newInstance();
                System.out.println(position);
                break;
            case 3:
                fragment = new AboutFragment().newInstance();
                System.out.println(position);
                break;
        }
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        return fragment; /*PlaceholderFragment.newInstance(position + 1);*/
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getString(TAB_TITLES[position]);
    }

    @Override
    public int getCount() {
        // Show 4 total pages.
        return 4;
    }
}