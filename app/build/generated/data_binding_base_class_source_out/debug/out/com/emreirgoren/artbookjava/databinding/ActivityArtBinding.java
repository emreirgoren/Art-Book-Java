// Generated by view binder compiler. Do not edit!
package com.emreirgoren.artbookjava.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.emreirgoren.artbookjava.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityArtBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final EditText artistName;

  @NonNull
  public final Button button;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final EditText nameText;

  @NonNull
  public final EditText yearText;

  private ActivityArtBinding(@NonNull ConstraintLayout rootView, @NonNull EditText artistName,
      @NonNull Button button, @NonNull ImageView imageView, @NonNull EditText nameText,
      @NonNull EditText yearText) {
    this.rootView = rootView;
    this.artistName = artistName;
    this.button = button;
    this.imageView = imageView;
    this.nameText = nameText;
    this.yearText = yearText;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityArtBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityArtBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_art, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityArtBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.artistName;
      EditText artistName = ViewBindings.findChildViewById(rootView, id);
      if (artistName == null) {
        break missingId;
      }

      id = R.id.button;
      Button button = ViewBindings.findChildViewById(rootView, id);
      if (button == null) {
        break missingId;
      }

      id = R.id.imageView;
      ImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.nameText;
      EditText nameText = ViewBindings.findChildViewById(rootView, id);
      if (nameText == null) {
        break missingId;
      }

      id = R.id.yearText;
      EditText yearText = ViewBindings.findChildViewById(rootView, id);
      if (yearText == null) {
        break missingId;
      }

      return new ActivityArtBinding((ConstraintLayout) rootView, artistName, button, imageView,
          nameText, yearText);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}