package com.zub.covid_19;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.facebook.shimmer.ShimmerFrameLayout;

public class StatsFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_stats, container, false);

        ShimmerFrameLayout shimmerFrameLayout = view.findViewById(R.id.stats_shimmer);

        shimmerFrameLayout.setVisibility(View.GONE);

        return view;
    }
}
