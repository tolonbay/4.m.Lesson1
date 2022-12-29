package com.example.a4_mlesson1.ui.board

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.view.isGone
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import com.example.a4_mlesson1.R
import com.example.a4_mlesson1.databinding.ItemBoardBinding
import com.example.a4_mlesson1.ui.board.BoardAdapter.BoardViewHolder

class BoardAdapter(private val listener: OpenListener): RecyclerView.Adapter<BoardViewHolder>() {

    val titleList = listOf("Заметки", "Контакты", "Конец")
    val desList = listOf("Добавление заметок", "Доступ ко всем контактам", "Регистрация через email")
    val imgList = listOf(R.drawable.note, R.drawable.contact,R.drawable.emal)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BoardViewHolder {
        return BoardViewHolder(ItemBoardBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: BoardViewHolder, position: Int) {
        holder.inBind(position)
        holder.binding.btnItemStart.setOnClickListener { listener.open()}
        if (position ==titleList.size-1){
            holder.binding.btnItemStart.isVisible = true
        } else {
            holder.binding.btnItemStart.isGone = true
        }

    }

    override fun getItemCount(): Int = titleList.size

   inner class BoardViewHolder( val binding: ItemBoardBinding): RecyclerView.ViewHolder(binding.root) {

        fun inBind(position: Int) {
        binding.imItemBoard.setImageResource(imgList[position])
        binding.tvItemTitleBoard.text = titleList[position]
        binding.tvItemDesBoard.text = desList[position]
        }

    }
    interface OpenListener{
        fun open()
    }

}