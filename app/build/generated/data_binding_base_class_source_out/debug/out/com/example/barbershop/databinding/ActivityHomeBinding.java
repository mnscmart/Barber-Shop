// Generated by view binder compiler. Do not edit!
package com.example.barbershop.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.SearchView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.barbershop.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityHomeBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btAgendar;

  @NonNull
  public final ConstraintLayout main;

  @NonNull
  public final SearchView pesquisa;

  @NonNull
  public final RecyclerView recyclerViewServicos;

  @NonNull
  public final TextView textNomeUsuario;

  @NonNull
  public final TextView textTituloServicos;

  private ActivityHomeBinding(@NonNull ConstraintLayout rootView, @NonNull Button btAgendar,
      @NonNull ConstraintLayout main, @NonNull SearchView pesquisa,
      @NonNull RecyclerView recyclerViewServicos, @NonNull TextView textNomeUsuario,
      @NonNull TextView textTituloServicos) {
    this.rootView = rootView;
    this.btAgendar = btAgendar;
    this.main = main;
    this.pesquisa = pesquisa;
    this.recyclerViewServicos = recyclerViewServicos;
    this.textNomeUsuario = textNomeUsuario;
    this.textTituloServicos = textTituloServicos;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityHomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_home, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityHomeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btAgendar;
      Button btAgendar = ViewBindings.findChildViewById(rootView, id);
      if (btAgendar == null) {
        break missingId;
      }

      ConstraintLayout main = (ConstraintLayout) rootView;

      id = R.id.pesquisa;
      SearchView pesquisa = ViewBindings.findChildViewById(rootView, id);
      if (pesquisa == null) {
        break missingId;
      }

      id = R.id.recyclerViewServicos;
      RecyclerView recyclerViewServicos = ViewBindings.findChildViewById(rootView, id);
      if (recyclerViewServicos == null) {
        break missingId;
      }

      id = R.id.textNomeUsuario;
      TextView textNomeUsuario = ViewBindings.findChildViewById(rootView, id);
      if (textNomeUsuario == null) {
        break missingId;
      }

      id = R.id.textTituloServicos;
      TextView textTituloServicos = ViewBindings.findChildViewById(rootView, id);
      if (textTituloServicos == null) {
        break missingId;
      }

      return new ActivityHomeBinding((ConstraintLayout) rootView, btAgendar, main, pesquisa,
          recyclerViewServicos, textNomeUsuario, textTituloServicos);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}