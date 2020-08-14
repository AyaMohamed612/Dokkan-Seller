package com.example.dokkanseller.views.Update_Product;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;

import com.bumptech.glide.Glide;
import com.example.dokkanseller.R;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.smarteist.autoimageslider.SliderViewAdapter;

import java.util.ArrayList;


public class SliderUpdateAdapter extends SliderViewAdapter<SliderUpdateAdapter.SliderAdapterVH> {

    private FirebaseDatabase firebaseDatabase;
     private DatabaseReference databaseReference;
    private Context context;
    String image1,image2,image3;
    String productId;
    ArrayList<Uri> mArrayUri;

    public SliderUpdateAdapter(Context context, ArrayList<Uri> mArrayUri) {
        this.context = context;
        this.mArrayUri = mArrayUri;
    }

    public SliderUpdateAdapter(Context context) {
        this.context = context;
    }
    @Override
    public SliderAdapterVH onCreateViewHolder(ViewGroup parent) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.image_slider_layout_item, null);
        return new SliderAdapterVH(inflate);
    }

    @Override
    public void onBindViewHolder(final SliderAdapterVH viewHolder, final int position) {

        databaseReference = FirebaseDatabase.getInstance().getReference("products").child( productId);
        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override

            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                image1 = dataSnapshot.child("image1").getValue(String.class);
                image2 = dataSnapshot.child("image2").getValue(String.class);
                image3 = dataSnapshot.child("image3").getValue(String.class);
                switch (position) {
                    case 1:
                        Glide.with(viewHolder.itemView).load(image1).into(viewHolder.imageViewBackground);
                        break;
                    case 2:
                        Glide.with(viewHolder.itemView).load(image2).into(viewHolder.imageViewBackground);
                        break;
                    default:
                        Glide.with(viewHolder.itemView).load(image3).into(viewHolder.imageViewBackground);
                        break;

                }

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

    }



    //================================
    @Override
    public int getCount() {
        //slider view count could be dynamic size
        return 3;
    }
    //===========================================================================//
    class SliderAdapterVH extends SliderViewAdapter.ViewHolder {

        View itemView;
        ImageView imageViewBackground;


        public SliderAdapterVH(View itemView) {
            super(itemView);
            imageViewBackground = itemView.findViewById(R.id.iv_auto_image_slider);
            this.itemView = itemView;
        }
    }
    //=======================================================================//
}