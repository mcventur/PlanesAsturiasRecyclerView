package com.example.planesasturiasrecyclerview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.planesasturiasrecyclerview.R
import com.example.planesasturiasrecyclerview.model.PlanAsturias

class PlanesRecyclerAdapter(val planesDataSet:List<PlanAsturias>): RecyclerView.Adapter<PlanesRecyclerAdapter.PlanesViewHolder>() {
    class PlanesViewHolder(view: View): RecyclerView.ViewHolder(view){
        val imgPlan : ImageView = view.findViewById(R.id.imgPlan)
        val txtSlogan : TextView = view.findViewById(R.id.txtSlogan)

        fun vincular(item:PlanAsturias){
            imgPlan.setImageResource(item.imgResourceId)
            txtSlogan.text = item.descripcion
        }
    }

    /**
     *RecyclerView Llama a este método siempre que necesita crear una ViewHolder
     * nueva. El método crea el ViewHolder y su View asociada, y los inicializa,
     * pero no completa el contenido de la vista (aún no se vinculó el ViewHolder
     * con datos específicos. Se hace después con onBindViewHolder).
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlanesViewHolder {
        val inflador = LayoutInflater.from(parent.context)
        val vistaInflada : View = inflador.inflate(R.layout.item_plan_asturias, parent, false)
        return PlanesViewHolder(vistaInflada)
    }

    override fun getItemCount() = planesDataSet.size

    /**
     * El RecyclerView llama a este método para establecer la correspondencia
     * entre los datos del modelo (recibimos la posición del dataset a mostrar)
     * y la View que hemos inflado en el onCreateViewHolder anterior
      */
    override fun onBindViewHolder(holder: PlanesViewHolder, position: Int) {
        holder.vincular(planesDataSet[position])
    }
}