package com.example.barbershop.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.barbershop.databinding.ServicosItemBinding
import com.example.barbershop.model.Servicos

class ServicosAdapter(
    private val context: Context,
    private val listaServicos: MutableList<Servicos>
) : RecyclerView.Adapter<ServicosAdapter.ServicosViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ServicosViewHolder {
        val binding = ServicosItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ServicosViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ServicosViewHolder, position: Int) {
        val servico = listaServicos[position]
        holder.bind(servico)
    }

    override fun getItemCount(): Int = listaServicos.size

    inner class ServicosViewHolder(private val binding: ServicosItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(servico: Servicos) {
            // Verifica se img é null e usa um drawable padrão se for o caso
            servico.img?.let {
            } ?: binding.imgServico// Substitua por seu recurso padrão

            binding.txtServico.text = servico.nome
        }
    }
}
