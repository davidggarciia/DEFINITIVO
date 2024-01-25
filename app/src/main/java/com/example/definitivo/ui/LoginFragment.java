package com.example.definitivo.ui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.example.definitivo.MainActivity;
import com.example.definitivo.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

public class LoginFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_login, container, false);

        Button loginButton = view.findViewById(R.id.LoginBtn);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.action_navigation_login_to_navigation_home);
            }
        });
        return view;
    }

    @Override
    public void onResume() {
        super.onResume();

        // Obtener la actividad principal
        MainActivity mainActivity = (MainActivity) requireActivity();

        // Ocultar el BottomNavigationView al mostrar el fragmento de login
        BottomNavigationView bottomNavigationView = mainActivity.findViewById(R.id.nav_view);
        if (bottomNavigationView != null) {
            bottomNavigationView.setVisibility(View.GONE);
        }
    }

    @Override
    public void onPause() {
        super.onPause();

        // Mostrar el BottomNavigationView al salir del fragmento de login
        MainActivity mainActivity = (MainActivity) requireActivity();
        BottomNavigationView bottomNavigationView = mainActivity.findViewById(R.id.nav_view);
        if (bottomNavigationView != null) {
            bottomNavigationView.setVisibility(View.VISIBLE);
        }
    }
}