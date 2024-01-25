package com.example.definitivo.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.OnBackPressedCallback;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.example.definitivo.R;

public class ComidaFragment extends Fragment {

    private int cantidad = 1; // Inicializar la cantidad a 1
    private TextView cantidadTextView; // TextView para mostrar la cantidad seleccionada

    public ComidaFragment() {
        // Required empty public constructor
    }

    public static ComidaFragment newInstance() {
        return new ComidaFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_comida2, container, false);

        requireActivity().getOnBackPressedDispatcher().addCallback(getViewLifecycleOwner(), new OnBackPressedCallback(true) {
            @Override
            public void handleOnBackPressed() {
                Navigation.findNavController(requireView()).navigate(R.id.action_navigation_comida_to_navigation_restaurantes);
            }
        });

        // Enlazar vistas con sus IDs
        Button botonDisminuirCantidad = view.findViewById(R.id.boton_disminuir_cantidad);
        Button botonAumentarCantidad = view.findViewById(R.id.boton_aumentar_cantidad);
        ImageButton botonAgregarCarrito = view.findViewById(R.id.boton_agregar_al_carrito);
        cantidadTextView = view.findViewById(R.id.texto_cantidad);

        // Configurar listeners para los botones
        botonDisminuirCantidad.setOnClickListener(v -> disminuirCantidad());
        botonAumentarCantidad.setOnClickListener(v -> aumentarCantidad());
        botonAgregarCarrito.setOnClickListener(v -> agregarAlCarrito());

        return view;
    }

    // Método para disminuir la cantidad
    private void disminuirCantidad() {
        if (cantidad > 1) {
            cantidad--;
            cantidadTextView.setText(String.valueOf(cantidad));
        }
    }

    // Método para aumentar la cantidad
    private void aumentarCantidad() {
        cantidad++;
        cantidadTextView.setText(String.valueOf(cantidad));
    }

    // Método para agregar al carrito
    private void agregarAlCarrito() {
        // Por ahora, simplemente mostramos un Toast con la cantidad seleccionada
        String mensaje = "Agregado al carrito: " + cantidad + " unidades";
        Toast.makeText(requireContext(), mensaje, Toast.LENGTH_SHORT).show();
    }
}
