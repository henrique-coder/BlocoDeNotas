package com.androidstudioetec.notepad.ui.main.notes;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.androidstudioetec.notepad.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link NoteItemEditorFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class NoteItemEditorFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String name_position = "position";
    private static final String name_title = "title";
    private static final String name_text = "text";

    // TODO: Rename and change types of parameters
    private Integer position;
    private String title;
    private String text;

    public NoteItemEditorFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param position Parameter 1.
     * @param notes Parameter 2.
     * @return A new instance of fragment NoteItemEditorFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static NoteItemEditorFragment newInstance(Integer position, Notes notes) {
        NoteItemEditorFragment fragment = new NoteItemEditorFragment();
        Bundle args = new Bundle();
        args.putInt(name_position, position);
        args.putString(name_title, notes.get(position).title);
        args.putString(name_text, notes.get(position).text);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            position = getArguments().getInt(name_position);
            title = getArguments().getString(name_title);
            text = getArguments().getString(name_text);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_note_item_editor, container, false);
    }
}