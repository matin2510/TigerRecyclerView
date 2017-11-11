package nyc.c4q.mustafizurmatin.catviews.view;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import nyc.c4q.mustafizurmatin.catviews.R;
import nyc.c4q.mustafizurmatin.catviews.model.Tigers;

/**
 * Created by c4q on 11/11/17.
 */

public class TigerViewHolder extends RecyclerView.ViewHolder{
    private TextView breed;
    private TextView color;
    private TextView size;

    public TigerViewHolder(View itemView) {
        super(itemView);
        breed =(TextView) itemView.findViewById(R.id.tigers_breed_textview);
        color=(TextView) itemView.findViewById(R.id.tigers_color_textview);
        size=(TextView)itemView.findViewById(R.id.tigers_size_textview);

    }
    public void onBind(Tigers tiger){
        breed.setText("Bengal: " + tiger.getBreed());
        color.setText("White " + tiger.getColor());
        size.setText("Size is : " + 50);
    }
}
