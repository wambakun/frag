package developerkampus.examplefrag.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import developerkampus.examplefrag.R;

/**
 * Created by Wambakun on 22/12/2016.
 */

public class MadingAdapter extends ArrayAdapter<String> {
    private final Activity context;
    private final Integer[] image;
    private final Integer[] imageUser;
    private final String[] name;
    public MadingAdapter(Activity context,Integer[] image,Integer[] imageUser,String[] name){
        super(context,R.layout.mading_list,name);
        this.context=context;
        this.image=image;
        this.imageUser=imageUser;
        this.name=name;

    }
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.mading_list, null, true);
        ImageView img = (ImageView) rowView.findViewById(R.id.img);
        ImageView imgUser = (ImageView) rowView.findViewById(R.id.image_user);
        TextView tvNama = (TextView) rowView.findViewById(R.id.tv_user);

        img.setImageResource(image[position]);
        imgUser.setImageResource(imageUser[position]);
        tvNama.setText(name[position]);

        return rowView;
    }
}
