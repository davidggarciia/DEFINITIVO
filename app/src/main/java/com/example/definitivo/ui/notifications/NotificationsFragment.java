package com.example.definitivo.ui.notifications;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.definitivo.R;

import java.util.ArrayList;

public class NotificationsFragment extends Fragment {

    private ArrayList<String> cartItems; // Lista de elementos del carrito
    private ArrayAdapter<String> cartAdapter; // Adaptador para el carrito

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_notifications, container, false);

        // Obtener referencias a las vistas
        ListView listViewCart = view.findViewById(R.id.list_view_cart);
        TextView textViewTotal = view.findViewById(R.id.text_view_total);

        // Crear una lista de elementos del carrito (esto es solo un ejemplo)
        cartItems = new ArrayList<>();
        cartItems.add("Hamburger");

        // Inicializar y establecer el adaptador para mostrar los elementos del carrito en el ListView
        cartAdapter = new ArrayAdapter<>(requireContext(), android.R.layout.simple_list_item_1, cartItems);
        listViewCart.setAdapter(cartAdapter);

        // Calcular y mostrar el total del carrito (esto es solo un ejemplo)
        double total = calculateTotal();
        textViewTotal.setText("Total: €" + total);

        return view;
    }

    // Calcular el total del carrito
    private double calculateTotal() {
        //
        return 50.0;
    }
}
