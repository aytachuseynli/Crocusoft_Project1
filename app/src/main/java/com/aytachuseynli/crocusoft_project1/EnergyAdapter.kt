package com.aytachuseynli.crocusoft_project1

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.aytachuseynli.crocusoft_project1.databinding.ItemEnergyBinding

class EnergyAdapter (var mContext: Context, var energyList:List<EnergyList>)
        : RecyclerView.Adapter<EnergyAdapter.CardDesignHolder>(){

        inner class CardDesignHolder(var binding: ItemEnergyBinding): RecyclerView.ViewHolder(binding.root)

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardDesignHolder {
                val binding = ItemEnergyBinding.inflate(LayoutInflater.from(mContext),parent,false)
                return CardDesignHolder(binding)
        }

        override fun getItemCount(): Int {
                return energyList.size
        }

        override fun onBindViewHolder(holder: CardDesignHolder, position: Int) {
                val energy = energyList.get(position)
                val e = holder.binding
               // holder.itemView.context

                e.energyIcon.setImageResource(
                        mContext.resources.getIdentifier(energy.image, "drawable",mContext.packageName))

                e.energyText.text = "${energy.text}"

                e.itemEnergy.setCardBackgroundColor(energy.color)
        }

        internal fun setDataList(dataList: List<EnergyList>) {
                this.energyList = dataList
                notifyDataSetChanged()
        }





}