package com.six.zhihu.fragment.home;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.six.zhihu.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HotTopFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HotTopFragment extends Fragment {


    public HotTopFragment() {
        // Required empty public constructor
    }

    public static HotTopFragment newInstance() {
        HotTopFragment fragment = new HotTopFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_hot_top, container, false);
    }
}