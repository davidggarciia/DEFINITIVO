package com.example.definitivo.ui.dashboard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;

import com.example.definitivo.R;
import com.example.definitivo.databinding.FragmentDashboardBinding;

public class DashboardFragment extends Fragment { //CATEGORIES

    private FragmentDashboardBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_dashboard, container, false);

        // Encuentra tu botón1 dentro del layout del fragmento
        ImageButton button1 = view.findViewById(R.id.boton1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Navega hacia restaurantes
                Navigation.findNavController(view).navigate(R.id.action_navigation_dashboard_to_navigation_restaurantes);
            }

        });

        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}