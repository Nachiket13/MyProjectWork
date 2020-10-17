package com.example.myprojectwork;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PagerAdapter extends FragmentPagerAdapter {

    String[] TabArray = {"Books","Notes","Others","Earn"};
    public PagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: BooksFragment booksFragment = new BooksFragment();
            return booksFragment;
            case 1: NotesFragment notesFragment =new NotesFragment();
            return notesFragment;
            case 2: OthersFragment othersFragment = new OthersFragment();
            return othersFragment;
            case 3: EarnFragment earnFragment =new EarnFragment();
            return earnFragment;
            default: return null;


        }

    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return TabArray[position];
    }

    @Override
    public int getCount() {
        return 0;
    }
}
