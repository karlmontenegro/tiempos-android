package com.example.isabelduninborkowski.freelo;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.isabelduninborkowski.freelo.beans.Client;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IsabelDuninBorkowski on 13/04/16.
 */

public class ClientListView extends Fragment {
    View myView;
    ImageButton addClientBtn;

    private List<Client> clientList =  new ArrayList<Client>();

    private void populateList() {
        this.clientList.add(new Client("Carlos", "Carlos SAC", "1234"));
        this.clientList.add(new Client("Andres", "Andres SAC", "5678"));
        this.clientList.add(new Client("Abel", "Abel SAC", "45454"));
        this.clientList.add(new Client("Miguel", "Miguel SAC", "99956"));
        this.clientList.add(new Client("Alberto", "Alberto SAC", "86868"));
        this.clientList.add(new Client("Abel", "Abel SAC", "45454"));
        this.clientList.add(new Client("Miguel", "Miguel SAC", "99956"));
        this.clientList.add(new Client("Alberto", "Alberto SAC", "86868"));
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.client_list_layout, container, false);

        populateList();

        ArrayAdapter<Client> adapter = new CustomListAdapter();

        ListView list = (ListView) myView.findViewById(R.id.clientList);
        list.setAdapter(adapter);

        this.addClientBtn = (ImageButton) myView.findViewById(R.id.addClientBtn);

        this.addClientBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Toast.makeText(ClientListView.this.getActivity(), "Client Added", Toast.LENGTH_SHORT).show();

            }
        });

        return myView;
    }

    //Adapter for the list view
    private class CustomListAdapter extends ArrayAdapter<Client> {

        public CustomListAdapter() {
            super(ClientListView.this.getActivity(), R.layout.client_cell_layout, clientList);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View itemView = convertView;

            if (itemView == null) {
                itemView = ClientListView.this.getActivity().getLayoutInflater().inflate(R.layout.client_cell_layout, parent, false);
            }

            Client client = clientList.get(position);

            TextView clientName = (TextView) itemView.findViewById(R.id.clientName);
            TextView razSoc = (TextView) itemView.findViewById(R.id.razSoc);
            TextView ruc = (TextView) itemView.findViewById(R.id.ruc);

            clientName.setText(client.getClientName());
            razSoc.setText(client.getRazSoc());
            ruc.setText("RUC: " + client.getRuc());

            return itemView;
        }
    }

}
