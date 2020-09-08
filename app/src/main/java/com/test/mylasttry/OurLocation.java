package com.test.mylasttry;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class OurLocation extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_our_location);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }
    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng street1 = new LatLng(25.412485, 68.272212);
        mMap.addMarker(new MarkerOptions().position(street1).title("Street 1"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(street1));

        LatLng street2= new LatLng(25.411660, 68.272128);
        mMap.addMarker(new MarkerOptions().position(street2).title("Street 2"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(street2));

        // Add a marker in Sydney and move the camera
        LatLng street3 = new LatLng(25.410996, 68.272470);
        mMap.addMarker(new MarkerOptions().position(street3).title("Street 3"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(street3));

        LatLng street4 = new LatLng(25.410672, 68.272999);
        mMap.addMarker(new MarkerOptions().position(street4).title("Street 4"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(street4));

        LatLng street5 = new LatLng(25.410267, 68.273533);
        mMap.addMarker(new MarkerOptions().position(street5).title("Street 5"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(street5));

        LatLng street6 = new LatLng(25.409870, 68.274017);
        mMap.addMarker(new MarkerOptions().position(street6).title("Street 6"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(street6));

        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(street1,12.0f));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(street2,12.0f));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(street3,12.0f));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(street4,12.0f));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(street5,12.0f));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(street6,12.0f));

    }
}