//package com.mcsf19a029.loanedmoneytracker;
//
//import android.text.Layout;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.TextView;
//
//import androidx.annotation.NonNull;
//import androidx.recyclerview.widget.RecyclerView;
//public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder> {
//    private String[] data;
//    public RecyclerAdapter(String[] data)
//    {
//        this.data = data;
//    }
//    @NonNull
//    @Override
//    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
//        View view = inflater.inflate(R.layout.records_layout,parent,false);
//        return new RecyclerViewHolder(view);
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {
//
//    }
//
//    @Override
//    public int getItemCount() {
//        return 0;
//    }
//
//    public class RecyclerViewHolder extends RecyclerView.ViewHolder{
//        TextView shortname,full,amount;
//        public RecyclerViewHolder(@NonNull View itemView) {
//            super(itemView);
//            shortname = itemView.findViewById(R.id.shortname);
//            full = itemView.findViewById(R.id.full);
//            amount = itemView.findViewById(R.id.amount);
//        }
//    }
//}
