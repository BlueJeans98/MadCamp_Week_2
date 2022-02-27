package com.example.tournament;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.ArrayList;

public class PagerAdapter extends FragmentStateAdapter {

    private final ArrayList<Fragment> mFragmentList = new ArrayList<>();

    public PagerAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {

        super(fragmentManager, lifecycle);

    }

    public void addFragment(Fragment fragment) {

        mFragmentList.add(fragment);

    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {

        return mFragmentList.get(position);

    }

    @Override
    public int getItemCount() {

        return mFragmentList.size();

    }

    @Override
    public long getItemId(int position) {
        return position;
    }


}
