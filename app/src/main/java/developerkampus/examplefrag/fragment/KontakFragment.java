package developerkampus.examplefrag.fragment;


import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import developerkampus.examplefrag.R;
import developerkampus.examplefrag.adapter.KontakAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class KontakFragment extends Fragment {

    private ListView listView;
    String[] nama = {"Wamba Kiswara Putra", "Dodi Rivaldi", "Aang", "Yudhitya Daiwanne"};
    String[] telp = {"083871535560", "083871535560", "083871535560", "083871535560"};
    Integer[] image = {R.drawable.id, R.drawable.id, R.drawable.id, R.drawable.id};
    private FloatingActionButton floatingActionButton;
    public KontakFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_kontak, container, false);
        KontakAdapter adapter = new KontakAdapter(getActivity(), nama, telp, image);
        listView = (ListView) view.findViewById(R.id.lv_kontak);
        listView.setAdapter(adapter);
        return view;


    }
}