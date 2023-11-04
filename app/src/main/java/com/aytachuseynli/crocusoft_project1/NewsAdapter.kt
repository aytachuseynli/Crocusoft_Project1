package com.aytachuseynli.crocusoft_project1

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.aytachuseynli.crocusoft_project1.databinding.ItemNewsBinding

class NewsAdapter (var mContext: Context, var newsList: List<NewsList>)
    :RecyclerView.Adapter<NewsAdapter.CardDesignHolder>() {

        inner class CardDesignHolder(var binding: ItemNewsBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardDesignHolder {
        val binding = ItemNewsBinding.inflate(LayoutInflater.from(mContext),parent,false)
        return CardDesignHolder(binding)
    }

    override fun getItemCount(): Int {
        return newsList.size
    }

    override fun onBindViewHolder(holder: CardDesignHolder, position: Int) {
        val news = newsList.get(position)
        val n = holder.binding
        // holder.itemView.context

        n.newsImage.setImageResource(
            mContext.resources.getIdentifier(news.image, "drawable",mContext.packageName))

        n.newsText.text = "${news.text}"
    }

    internal fun setDataList(dataList: List<NewsList>) {
        this.newsList = dataList
        notifyDataSetChanged()
    }


}