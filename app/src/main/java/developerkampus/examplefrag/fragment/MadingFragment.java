package developerkampus.examplefrag.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import developerkampus.examplefrag.MainActivity;
import developerkampus.examplefrag.R;
import developerkampus.examplefrag.activity.DetailMadingActivity;
import developerkampus.examplefrag.adapter.MadingAdapter;

import static android.R.attr.value;

/**
 * A simple {@link Fragment} subclass.
 */
public class MadingFragment extends Fragment {
    private ListView listView;
    Integer[] image={R.drawable.mars,R.drawable.mars,R.drawable.mars,R.drawable.mars,R.drawable.mars};
    Integer[] imageUser={R.drawable.mars,R.drawable.mars,R.drawable.mars,R.drawable.mars,R.drawable.mars};
    String[] name={"Wamba","Dodi","Rizky","Aang","Yudhit"};

    public MadingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_mading, container, false);
        MadingAdapter adapter = new MadingAdapter(getActivity(),image,imageUser,name);
        listView = (ListView) view.findViewById(R.id.lv_mading);
        FloatingActionButton fab1 = (FloatingActionButton)view.findViewById(R.id.fabs);

        fab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplication(), DetailMadingActivity.class);
                startActivity(intent);

            }
        });
        return view;

}

}
