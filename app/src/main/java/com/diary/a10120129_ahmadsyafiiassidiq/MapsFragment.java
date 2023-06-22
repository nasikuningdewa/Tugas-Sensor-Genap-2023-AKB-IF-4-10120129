package com.diary.a10120129_ahmadsyafiiassidiq;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsFragment extends Fragment { // 10120129-Ahmad Syafii Assidiq-IF4 //

    private OnMapReadyCallback callback = new OnMapReadyCallback() {

        /**
         * Manipulates the map once available.
         * This callback is triggered when the map is ready to be used.
         * This is where we can add markers or lines, add listeners or move the camera.
         * In this case, we just add a marker near Sydney, Australia.
         * If Google Play services is not installed on the device, the user will be prompted to
         * install it inside the SupportMapFragment. This method will only be triggered once the
         * user has installed Google Play services and returned to the app.
         */
        @Override
        public void onMapReady(GoogleMap googleMap) {
            LatLng makan = new LatLng(-5.1608128,119.4466609);
            googleMap.addMarker(new MarkerOptions().position(makan).title("Nasi Kuning Nita"));
            googleMap.moveCamera(CameraUpdateFactory.newLatLng(makan));

            LatLng makan1 = new LatLng(-5.1592385,119.3831349);
            googleMap.addMarker(new MarkerOptions().position(makan1).title("Pallubasa Serigala"));
            googleMap.moveCamera(CameraUpdateFactory.newLatLng(makan1));

            LatLng makan2 = new LatLng(-5.1542339,119.4115478);
            googleMap.addMarker(new MarkerOptions().position(makan2).title("Bakso Mutiara"));
            googleMap.moveCamera(CameraUpdateFactory.newLatLng(makan2));

            LatLng makan3 = new LatLng(-5.1543091,119.4440445);
            googleMap.addMarker(new MarkerOptions().position(makan3).title("Mie Titi"));
            googleMap.moveCamera(CameraUpdateFactory.newLatLng(makan3));

            LatLng makan4 = new LatLng(-5.1546662,119.4443603);
            googleMap.addMarker(new MarkerOptions().position(makan4).title("Mie Setan"));
            googleMap.moveCamera(CameraUpdateFactory.newLatLng(makan4));

            LatLng makan5 = new LatLng(-5.1677047,119.4485531);
            googleMap.addMarker(new MarkerOptions().position(makan5).title("Bakso Keju Mas Komeng"));
            googleMap.moveCamera(CameraUpdateFactory.newLatLng(makan5));

        }

    };

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_maps, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        SupportMapFragment mapFragment =
                (SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.map);
        if (mapFragment != null) {
            mapFragment.getMapAsync(callback);
        }
    }
}