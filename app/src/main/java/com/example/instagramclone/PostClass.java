package com.example.instagramclone;

import android.app.Activity;
import android.app.Application;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class PostClass extends ArrayAdapter<String> {

    private final ArrayList<String> username;
    private final ArrayList<String> userComment;
    private final ArrayList<Bitmap> userImage;
    private final Activity context;

    public PostClass(ArrayList<String> username, ArrayList<String> userComment, ArrayList<Bitmap> userImage, Activity context) {
        super(context, R.layout.custom_view, username);

        this.username = username;
        this.userComment = userComment;
        this.userImage = userImage;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater layoutInflater = context.getLayoutInflater();
        View customView = layoutInflater.inflate(R.layout.custom_view, null, true);
        TextView usernameText = customView.findViewById(R.id.custom_view_username_text);
        TextView usercommentText = customView.findViewById(R.id.custom_view_comment_text);
        ImageView userImageBitmap = customView.findViewById(R.id.custom_view_image_view);

        usernameText.setText(username.get(position));
        usercommentText.setText(userComment.get(position));
        userImageBitmap.setImageBitmap(userImage.get(position));

        return customView;
    }
}
