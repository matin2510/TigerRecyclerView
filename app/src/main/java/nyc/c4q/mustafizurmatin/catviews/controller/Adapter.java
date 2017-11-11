package nyc.c4q.mustafizurmatin.catviews.controller;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import nyc.c4q.mustafizurmatin.catviews.R;
import nyc.c4q.mustafizurmatin.catviews.model.Tigers;
import nyc.c4q.mustafizurmatin.catviews.view.TigerViewHolder;

/**
 * Created by c4q on 11/11/17.
 */

public class Adapter extends RecyclerView.Adapter<TigerViewHolder> {
    private List<Tigers> tigersList;

    public Adapter(List<Tigers> tigersList) {
        this.tigersList = tigersList;
    }

    @Override
    public TigerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View childView = LayoutInflater.from(parent.getContext()).inflate(R.layout.tigers_layout,parent, false);
        return new TigerViewHolder(childView);
    }

    @Override
    public void onBindViewHolder(TigerViewHolder holder, int position) {
        Tigers tiger =tigersList.get(position);
        holder.onBind(tiger);
    }

    @Override
    public int getItemCount() {
        return tigersList.size();
    }
}
