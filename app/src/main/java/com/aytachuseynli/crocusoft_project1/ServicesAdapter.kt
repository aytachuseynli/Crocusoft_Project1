package com.aytachuseynli.crocusoft_project1

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.aytachuseynli.crocusoft_project1.databinding.ItemServicesBinding


class ServicesAdapter(var mContext: Context, var servicesList: List<ServicesList>) :
    RecyclerView.Adapter<ServicesAdapter.CardDesignHolder>() {

    inner class CardDesignHolder(var binding: ItemServicesBinding) :RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardDesignHolder {
        val binding = ItemServicesBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CardDesignHolder(binding)
    }

    override fun getItemCount(): Int {
        return servicesList.size
    }

    override fun onBindViewHolder(holder: CardDesignHolder, position: Int) {
        val service = servicesList.get(position)
        val s = holder.binding

        s.servicesIcon.setImageResource(
            mContext.resources.getIdentifier(service.image, "drawable",mContext.packageName))

        s.servicesText.text = "${service.text}"
    }

    internal fun setDataList(dataList: List<ServicesList>) {
        this.servicesList = dataList
        notifyDataSetChanged()
    }

}