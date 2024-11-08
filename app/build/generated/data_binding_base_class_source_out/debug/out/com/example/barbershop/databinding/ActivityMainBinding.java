// Generated by view binder compiler. Do not edit!
package com.example.barbershop.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.barbershop.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final EditText editNome;

  @NonNull
  public final EditText editSenha;

  @NonNull
  public final Button editbtLogin;

  @NonNull
  public final LinearLayout main;

  private ActivityMainBinding(@NonNull ScrollView rootView, @NonNull EditText editNome,
      @NonNull EditText editSenha, @NonNull Button editbtLogin, @NonNull LinearLayout main) {
    this.rootView = rootView;
    this.editNome = editNome;
    this.editSenha = editSenha;
    this.editbtLogin = editbtLogin;
    this.main = main;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.editNome;
      EditText editNome = ViewBindings.findChildViewById(rootView, id);
      if (editNome == null) {
        break missingId;
      }

      id = R.id.editSenha;
      EditText editSenha = ViewBindings.findChildViewById(rootView, id);
      if (editSenha == null) {
        break missingId;
      }

      id = R.id.editbtLogin;
      Button editbtLogin = ViewBindings.findChildViewById(rootView, id);
      if (editbtLogin == null) {
        break missingId;
      }

      id = R.id.main;
      LinearLayout main = ViewBindings.findChildViewById(rootView, id);
      if (main == null) {
        break missingId;
      }

      return new ActivityMainBinding((ScrollView) rootView, editNome, editSenha, editbtLogin, main);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
