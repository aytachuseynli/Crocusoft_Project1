package com.aytachuseynli.crocusoft_project1

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.aytachuseynli.crocusoft_project1.databinding.ItemMoreBinding

class MoreAdapter (var mContext: Context, var moreList: List<MoreList>)
    :RecyclerView.Adapter<MoreAdapter.CardDesignHolder>() {

    inner class CardDesignHolder(var binding: ItemMoreBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardDesignHolder {
        val binding = ItemMoreBinding.inflate(LayoutInflater.from(mContext),parent,false)
        return CardDesignHolder(binding)
    }

    override fun getItemCount(): Int {
        return moreList.size
    }

    override fun onBindViewHolder(holder: CardDesignHolder, position: Int) {
        val more = moreList.get(position)
        val m = holder.binding

        m.moreIcon.setImageResource(
            mContext.resources.getIdentifier(more.image, "drawable",mContext.packageName))

        m.moreText.text = "${more.text}"
    }

    internal fun setDataList(dataList: List<MoreList>) {
        this.moreList = dataList
        notifyDataSetChanged()
    }



}