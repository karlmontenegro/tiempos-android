package com.example.isabelduninborkowski.freelo;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

/**
 * Created by IsabelDuninBorkowski on 4/04/16.
 */
public class SecondFragment extends Fragment{
    View myView;
    EditText txtName;
    EditText txtRazSoc;
    EditText txtRuc;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.client_detail_layout, container, false);

        txtName = (EditText) myView.findViewById(R.id.txtName);
        txtRazSoc = (EditText) myView.findViewById(R.id.txtRazSoc);
        txtRuc = (EditText) myView.findViewById(R.id.txtRuc);


        return myView;
    }
}
